console.log("Testing Node");
let u =require('./utility');
u.store("alice", 50);
u.find("bob");
let c = require('./calci');
c.sum(17,20);
c.div(189,36);