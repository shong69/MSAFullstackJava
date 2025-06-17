const { MongoClient } = require('mongodb');
console.log(1);
var url = "mongodb://localhost:27017";
var client = new MongoClient(url);
console.log(2);
(async ()=>{
    await client.connect();

    const dbo = client.db("xe");
    //최초 생성 시 컬렉션과 데이터를 만들어서 넣어야 db 생성이 됨
    //콜렉션 생성과 데이터 생성 순서를 맞추기 위해 await을 쓴다.
    // const coll = await dbo.createCollection('documents');
    const coll = dbo.collection('documents');

    // console.log(coll);
    // insert
    // const insertResult = await coll.insertMany([{ a: 1 }, { a: 2 }, { a: 3 }]);
    const insertResult = await coll.insertOne({ a: 4 });
    console.log('Inserted documents =>', insertResult);

    client.close();
})();

