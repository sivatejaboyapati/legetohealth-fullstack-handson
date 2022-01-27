let fs =require('fs')
let data= fs.readFileSync("file.txt")
let content = data.toString();
console.log(content);
