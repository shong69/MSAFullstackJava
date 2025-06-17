// ~ mysql 8.x 
var mysql = require('mysql2');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "mysql",
  database:"mydb"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
//   var sql= "SELECT * FROM customers";  
  const begin = 10;
  const end = 14;
  var sql = `select * from customers where id<${end} and id>${begin} order by name`;
  con.query(sql, function (err, result,fields) {
    if (err) throw err;
    // console.log(result,fields); 
    //fields : 테이블의 필드들에 대한 정보가 나온다
    result.forEach(ele=>{
        console.log(ele.id, ele.name, ele.address);
    });
  });
  con.end();
});