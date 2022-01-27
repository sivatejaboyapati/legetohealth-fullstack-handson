
let http = require("http");
let port =8090;

let Server = http.createServer( (req,res) => {
    
res.writeHead(200,{'content-Type': 'text/html'})

    res.write("<h2>welcome to Legato!!!</h2>");
    res.end()
});
Server.listen(port,() => console.log(`server started for port ${port}`));

console.log('server running at http:// 127.1.0.1:8090');