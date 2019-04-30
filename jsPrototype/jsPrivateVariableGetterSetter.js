/**
 * 
 */
function counter (n){ // Function argumnets n is the private variable
    return{
        //property getter method returns and increments private counter var.
        get count(){return n++;},
        //property setter doesn't allow the value of n to decrease
        set count(m){
            if(m>=n) n=m;
            else throw Error("Count can only be set to a larger value");
        }
    };
}
try{                                    // using try and catch we r able to get rid of red errors.
var c = counter(1000);
console.log(c.count);//------->1000
console.log(c.count);// ----->1000
c.count = 2000;
console.log(c.count);// ---> 2000
//c.count = 2000; // ---------> Error!, 
c.count = 2001
console.log(c.count);
}catch (Error){
console.log(Error);
}

//---------------------------------MDN Call() function example--------------------------
function Product(name, price) {
  this.name = name;
  this.price = price;
}

function Food(name, price) {
  Product.call(this, name, price);
  this.category = 'food';
}

console.log(new Food('cheese', 5).name);
// expected output: "cheese"