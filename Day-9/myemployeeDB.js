let app = require("express")();
let mysql = require('mysql').mysql;
let dbURL = "myemployeedb://localhost:8081";
let port = 8091;
app.listen(port, () => console.log(`Node server is running with ${port}`));
app.get('/employee', (request, response) => {
    mysql.connect(dbURL, {useNewUrlParser : true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("employee").find();
            let arrayOfRecords = [];
            let x = 0;
            doc.forEach((record) => {
                arrayOfRecords.push(record);
                x++;
            }, () => {
                if(x == 0) {
                    response.json({error: "No Data found!!!"})
                } else {
                    response.json(arrayOfRecords);
                }
                client.close();
            });
        } 
    }); 
});


app.get('/employee/:id', (request, response) => {
    let id = parseInt(request.params.id); 
    mysql.connect(dbURL, {useNewUrlParser: true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("employee").find({_id: id});
            
            let x = 0;
            doc.forEach((record) => {
                x++;
                response.json(record);
            }, () => {
                if(x == 0) {
                    response.json({error : `id ${id} not found`});
                }
                client.close();
            }); 
        } 
    });
});

