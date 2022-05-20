// plain old javascript
var x: number;
var x = 10;
console.log(x);
x = 1.05;
console.log(x);
// Type 'string' is not assignable to type 'number'
// x = "hello";
var y : string;
y = "welcome";
console.log(x);

// let keyword
let z = 200;
let msg = "let keyword"
console.log(z)
console.log(msg)

interface Product {
   productId: string;
   price : number;
   productName : string;
}
const productTS : Product =  {
   productId: "P01",
   price : 500,
   productName : "TS"
}
console.log(productTS);

// class
class ProductClass {
   productId: string;
   price : number;
   productName : string;
   constructor( productId: string, price : number,productName : string) {
      this.productId = productId;
      this.price = price;
      this.productName = productName;
   }
}
// create product
var productObject = new ProductClass("P1",50,"Book");
console.log(productObject);