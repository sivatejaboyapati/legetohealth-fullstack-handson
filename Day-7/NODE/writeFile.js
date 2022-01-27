let fs = require('fs')
let text = " writing from writeFile\n"
fs.writeFileSync('file.txt', text,{flag: 'a+'})
console.log("write success!!!");