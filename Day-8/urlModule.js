let url = require('url')
let http = require('http')
let port =8072;

let Server = http.createServer((req,res) => {
    if(req.url != '/favicon.ico'){
        let urlObject = url.parse(req.url,true);
        console.log(urlObject.query.username,urlObject.query.age);
        res.writeHead(200,{'content-type': 'text/html'});
        res.write(`<h2> Welcome to Legato!!!</h2>`);
        res.end();


    }

});
Server.listen(port,()=>
console.log(`server satrted at ${port}`))