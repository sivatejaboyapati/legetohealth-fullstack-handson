var http = require("http");
http.createServer(function (req,res) {

    res.writeHead(200,{'content-Type': 'text/plain'});
    res.end("Hello World!");
}).listen(8081);

console.log('server running at http:// 127.1.0.1:8080');