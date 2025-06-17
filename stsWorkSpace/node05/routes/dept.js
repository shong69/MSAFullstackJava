const express=require('express');
const mysql=require('mysql2');
const router=express.Router();

// const getConnection=()=>mysql.createConnection({
//       host: "localhost",
//       user: "root",
//       password: "mysql",
//       database: "xe"
//     });

//pooling
const pool=mysql.createPool({
    host: process.env.db_url?process.env.db_url:"localhost",
    user: "root",
    password: "mysql",
    database: "xe",
    waitForConnections: true,
    connectionLimit: 10,
    maxIdle: 10, // max idle connections, the default value is the same as `connectionLimit`
    idleTimeout: 6000
});


router.get('/',(req,res)=>{
    // const conn = getConnection();
    pool.getConnection(function(err,conn) {
        if (err) throw err;
        conn.query("SELECT * FROM dept order by deptno desc", function (err, result, fields) {
            if (err) throw err;
            const arr = result.map(ele=>ele);
            pool.releaseConnection(conn); //db 연결 반환
            res.render('dept/list',{arr});
        });
    });
});

router.get("/add",(req,res)=>{
    res.render('dept/add');
});


router.post("/",(req,res)=>{
    const dept = req.body;
    let sql = `insert into dept values(${dept.deptno},${dept.dname},${dept.loc})`;
    // const conn = getConnection();
    pool.getConnection((err,conn)=>{
        if(err) throw err;
        conn.query(sql,err=>{
            if(err) throw err;
            res.redirect('./');
            // conn.end();
            pool.releaseConnection(conn); //db 연결 반환

        })
    });
})

router.get('./:deptno',(req,res)=>{
    const deptno = req.params.deptno;
    // const conn = getConnection();
    pool.getConnection((err,conn)=>{
        if(err) throw err;
        conn.query(`select * from dept where deptno=${deptno}`,(err,data)=>{
            if(err) throw err;
            res.render('dept/dept',{bean:data});
            // conn.end();
            pool.releaseConnection(conn); //db 연결 반환
        });
    })
});

router.put('/:deptno',(req,res)=>{
    const dept = req.body;
    let sql = `update dept set dname=${dept.dname},loc=${dept.loc} where deptno=${dept.deptno}`;
    // const conn = getConnection();
    pool.getConnection((err,conn)=>{
        if(err) throw err;
        conn.query(sql,(err,result)=>{
            if(err) throw err;
            console.log(result);
            res.json({result:result.affectedRows});
            // conn.end();
            pool.releaseConnection(conn); //db 연결 반환
        });
    });
});

router.delete("/:deptno",(req,res)=>{
    const deptno= req.params.deptno;
    let sql = `delete from dept where deptno=${deptno}`;
    // const conn = getConnection();
    pool.getConnection((err,conn)=>{
        if(err) throw err;
        conn.query(sql,err=>{
            // conn.end();
            pool.releaseConnection(conn); //db 연결 반환
            res.json({result:true});
        })
    });
})
module.exports=router;