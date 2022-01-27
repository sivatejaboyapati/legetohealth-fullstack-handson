let fs = require('fs');
let text = "async testing\n"
fs.writeFile('file.txt', ' writing Asyncronous way \n', {flag:'a+'},(err)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log("Write in Async Success");
    }
});