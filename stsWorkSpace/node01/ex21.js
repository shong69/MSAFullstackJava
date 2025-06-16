const fs = require('fs');

//비동기 -> 쓰고 읽어야 하는데 쓰기 전에 먼저 readFile될 수 있다.
// -> 강제성을 부여하기 위해 콜백 함수를 줘서 다 쓰고나서 callback함수 안에 readFile 메서드를 실행하도록 하는 것이다.
fs.writeFile('test01.txt',"한글",{},()=>{
    //파일을 읽어서 내용을 열어보기
    fs.readFile('test01.txt',{encoding:'utf-8'},(err, data)=>{
            console.log(data.toString());
    });
});

//비동기 함수로 만들어서 await을 통해 writeFile먼저 실행하도록 지정
async function func01(){
    await fs.writeFile('test01.txt',"한글",{},()=>{ });
    fs.readFile('test01.txt',{encoding:'utf-8'},(err, data)=>{
            console.log(data.toString());
    });
}


//옵션이 디폴트가 utf-8이다.안붙여도 잘 나오긴 함