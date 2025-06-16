const fs = require('fs');
//rwx 로 모드 지정 가능
// a로 지정 시 append 모드임
fs.open('test01.txt','r',(err,fd)=>{
    console.log();
});