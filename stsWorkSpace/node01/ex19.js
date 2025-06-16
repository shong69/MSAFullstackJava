//event
const events = requestAnimationFrame('events'); //event 객체 만들기

const emit = events.EventEmitter();

const cb1 = e=> {console.log('event 1 run....')};
//event 함수 붙이는 방법 addListener, on
// emit.addListener('event1',cb1);
// emit.removeListener('event1',cb1);

emit.on('event1',cb1);
emit.off('event1',cb1); //off로 끌 수 있다.

//once:여러번 호출해도 한번만 일어난다.
emit.once('event2',cb1);

//event 호출
emit.emit('event1');

//3초 뒤 event실행하도록 설정
setTimeout(() => {
   emit.emit('event1'); 
   emit.emit('event1'); 
}, 3000);

console.log(emit.listenerCount('event1')); //개수 출력
