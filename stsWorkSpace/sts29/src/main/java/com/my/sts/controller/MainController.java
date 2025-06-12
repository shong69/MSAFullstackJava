package com.my.sts.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import com.my.sts.Sts29Application;

@RestController
public class MainController {

    private final Sts29Application sts29Application;

    MainController(Sts29Application sts29Application) {
        this.sts29Application = sts29Application;
    }
	@GetMapping("/")
	public List index() {
		String conn = "mongodb://root:mongo@localhost:27017";
		MongoClient mc = MongoClients.create(conn);
		MongoDatabase db= mc.getDatabase("blog");
//		db.listCollections().forEach(System.out::println);
		
		//mongo db의 데이터에 대한 정보가 들어있는 도큐먼트 콜렉션이 나온다(dept 콜렉션에 관한 문서로)
		MongoCollection<Document> docs=db.getCollection("dept");
		FindIterable<Document> rs = docs.find();
		MongoCursor<Document> ite=rs.iterator();
		List list = new ArrayList<>();
		while(ite.hasNext()) {
			Document doc = ite.next();
//			System.out.println(doc.get("dname",String.class));
//			System.out.println(doc.get("loc",String.class));
//			System.out.println(doc.get("_id",Integer.class));
			Entry<String,String> entry1=Map.entry("dname", doc.getString("dname"));
			Entry<String,String> entry2=Map.entry("loc", doc.getString("loc"));
			Entry<String,Integer> entry3=Map.entry("deptno", doc.getInteger("_id"));
			Map map = Map.ofEntries(entry1,entry2,entry3);
			list.add(map);
		}
		return list;
	}
	
	@PostMapping("/")
	public String add(String msg) {
		String conn = "mongodb://root:mongo@localhost:27017";
		MongoClient mc = MongoClients.create(conn);
		MongoDatabase db= mc.getDatabase("blog");
		MongoCollection<Document> docs=db.getCollection("dept");

		Document doc = new Document();
		ObjectId obj = ObjectId.get();
		doc.append("_id",obj);
		doc.append("msg",msg);
		InsertOneResult result = docs.insertOne(doc);
		
		return obj.toHexString();
	}
}
