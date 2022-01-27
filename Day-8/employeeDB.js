let app = require("express")();
let MongoClient = require('mongodb').MongoClient;
let dbURL = "mongodb://localhost:2145";
let port = 8081;
app.listen(port, () => console.log(`Node server is running with ${port}`));
app.get('/employee/:id', (request, response) => {
    let id = parseInt(request.params.id)
    MongoClient.connect(dbURL, {useNewUrlParser : true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("employee").find({_id:id});
            let x = 0;
            doc.forEach((record) => {
                x++;
                response.json(record);
            }, () => {
                if(x == 0) {
                    response.json({error: "No data found!!!"})
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
    MongoClient.connect(dbURL, {useNewUrlParser: true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("employee").find({_id: id});
            
            let x = 0;
            doc.forEach((record) => {
                x++;
                response.json(record);
            }, () => {
                if(x == 0) {
                    response.json({error : `Sorry ${id}  not found`});
                }
                client.close();
            }); 
        } 
    });
});

