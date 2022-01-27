

let app = require("express")();
let bodyParser = require('body-parser')
let port = 8090;
app.use([bodyParser.text(),bodyParser.json()]);
app.get('/employee/:id', (request, response) => {
    console.log(request.param.id);
    let employee = {id:3, name :"james",Salary: 45000};
    response.json(employee);
});
app.post('/employee', (request, response) => {
   console.log(request.body);
   let content = request.body;
   response.json(content);
 });
 app.put('/', (request, response) => {
    let employee = {id:1, name :"alice",Salary: 88000};
    response.json(employee);
});
app.delete('/', (request, response) => {
    let employee = {id:2, name :"bob",Salary: 74000};
    response.json(employee)
 });
app.listen(port, () => console.log(`we are in the port ${port}`));
