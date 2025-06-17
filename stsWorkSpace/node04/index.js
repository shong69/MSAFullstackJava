const express = require('express')
const bodyParser = require('body-parser')
const cookieParser = require('cookie-parser')
var cookieSession = require('cookie-session')
let ejs = require('ejs');

const app = express()
const port = 3000

app.use('/',bodyParser.urlencoded()) //query로 넘길 때
app.use('/',bodyParser.json()) //json으로 값을 넘길 때
// app.use(cookieParser()) //쿠키 사용할 때

app.use(cookieSession({
    name: 'session',
    keys: ['ssdlksdflkewurek'],
    
    // Cookie Options
    maxAge: 24 * 60 * 60 * 1000 // 24 hours
}))

//미들웨어 등록
app.use('/', (req, res,cb) => {
    console.log("index");
    console.log(req.url, req.session); //session 정보 객체로 받아오기
    cb();
})

app.use('/dept',require('./dept/dept.js'));
app.use('/emp',require('./emp/emp.js'));

//템플린 엔진 등록
app.set('view engine', 'ejs')


//요청 처리
app.get('/', (req, res) => {
  res.send('수정!'+req.session.name)
  console.log("index");
})
app.get('/ex01', (req, res) => {
    // console.log("param", req.body);
    // console.log("param", req.params);
    console.log("param", req.query); //get방식
    req.session.name='scott';
    res.send('ex01 page')
})
app.post('/ex02', (req, res) => {
    console.log("param",req.body);
    req.session={};
    res.send('ex02 page')
})



app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})