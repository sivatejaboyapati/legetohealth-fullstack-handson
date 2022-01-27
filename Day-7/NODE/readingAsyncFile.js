let fs = require('fs')
fs.readFile('asyncfile.txt',(err,data) => {
    if(err){
        console.log(err);
    }
    else{
        let content = data.toString();
        console.log(content);
    }
});
console.log("File Read Completed!!!");