console.time('time1');
///
var result = console.log('로그');
console.log(result);
console.error("에러"); 
console.warn("주의");

//__변수명  
console.log(__dirname); //폴더 명
console.log(__filename); //파일 이름

//프로세스 정보 목록
console.log(process);
console.log(process.env); //환경변수 목록
console.log(process.env.Oracle_id?process.env.Oracle_id:'root'); //있으면 있는거 쓰고, 없으면 root쓰도록
console.log(process.env.Oracle_pw);


globalThis.setTimeout(()=>console.log('run'),3000); //콜백 함수로 3초 뒤 호출하기

//전체 수행 시간
console.timeEnd('time1');  