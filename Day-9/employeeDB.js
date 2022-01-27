let app = require("express")();
let MongoClient = require('mongodb').MongoClient;
let dbURL = "mongodb://localhost:2080";
let port = 9090;
app.listen(port, () => console.log(`Node server is running with ${port}`));
app.get('/employee', (request, response) => {
    MongoClient.connect(dbURL, {useNewUrlParser : true}, (err, client) => {
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
                    response.json({error : ` id ${id} not found`});
                }
                client.close();
            });
        } 
    });
});

