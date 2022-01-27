let app =require('express')();
const { response } = require('express');
let http = require('http')
let io = require('socket.io')(http)
app.get('/',(request,response)=>{
response.sendFile(-__dirname+ 'client.html')
}).listen(8070);
io.on('connection',(socket)=>{
    console.log("socket is connected" + socket.connected);
    socket.on("client message " ,(msg)=>{
        socket.emit("message key",msg);
    });
});