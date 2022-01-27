let x =50;
let y= 10;
let z= x+y;
console.log(`z = ${z}`);
setTimeout(()=>{
    console.log("we are inside callback");
},1000);
console.log('last line');