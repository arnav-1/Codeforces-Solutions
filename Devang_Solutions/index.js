//546 A
// A. Soldier and Bananas
const fs = require("fs")
const input = fs.readFileSync(0,"utf-8").split(/\s+/);

let current =0;
const Banana_price = Number(input[current++]);
const Initial_money = Number(input[current++]);
const No_of_bananas = Number(input[current++]);
let total_price = 0;


    for(let i=1;i<=No_of_bananas;i++){
total_price = total_price + i*Banana_price;
    }
if (total_price<=Initial_money){
console.log(0)
}
else{
    console.log(total_price-Initial_money)
}
