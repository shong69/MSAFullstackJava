const fs = require('fs');

//파일 출력하기
const buf1=fs.readFileSync('ex01.js');
console.log(buf1.toString());

//파일 저장하기
fs.writeFileSync('test01.txt','hello javascript');