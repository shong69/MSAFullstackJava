var path = require('path');
console.log(path.delimiter,path.sep); //; \ 가 출력됨. 

//경로+파일이름 출력
console.log(__filename);
var p1 = "D:\\MSAFullstackJava\\..\\.\\stsWorkSpace\\node01\\";
var f1 = "ex15.js";
console.log(p1+f1);

//절대경로로 반환해주는 메서드
console.log(path.resolve(p1+f1));

// {
//   root: 'D:\\',
//   dir: 'D:\\MSAFullstackJava\\..\\.\\stsWorkSpace',
//   base: 'node01',
//   ext: '',
//   name: 'node01'
// }
console.log(path.parse(p1));

console.log('join',path.join(p1,f1));
