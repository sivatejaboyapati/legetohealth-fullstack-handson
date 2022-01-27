let app= require("express")();
let mysql = require('mysql');

let bodyparser = require('body-parser');
let con = mysql.createConnection({
    host:"localhost", user:"root",password:"root",
    database: "myEmployeeDb"
   
});
let port = 8082;
app.listen(port, () => console.log(`Node server is running with ${port}`));
app.get('/employee', (request, response) => {
 con.connect((err)=>{
     let id = parseInt(request.params.id);
     con.query("SELECT * FROM myEmployeeDb",function(err,result){
         if(err) throw err;
         console.log(result);
         response.json(result);
     });
   
    });
   
 }); 

    
