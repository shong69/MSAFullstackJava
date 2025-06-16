const fs = require('fs');

const stream=fs.createReadStream('test01.txt');
stream.on('data',function(data){
    console.log(data.toString()); //buffer로 나오고 있어서 toString()
});
stream.on('end',function(data){
    console.log('여기까지');
});

