/**
 * 
 */
var obj = {x:1,y:2};

console.log("I'm here")
console.log(obj.x);
console.log(obj.y);
console.log(obj.toString());
console.log("------------------------")


delete obj.x;
console.log(obj.x);
delete obj.y;
console.log(obj.y);
console.log("--- Accesing object property through loop");
var book = {x:1, y:2};
for(var i in book){
    console.log("This is the key"  +i);// i is a vlue
   console.log("The is the value of the obj " +book[i]);// book in position i--- object name ["key name"]
}

console.log("--- Accesing object property through loop")
var colors = {cathy:"purple", nilda:"grey", meg:"blue"};
for(var i in colors){
    console.log(i);// i is a vlue
   console.log(colors[i]);// book in position i--- object name ["key name"]
}

console.log("----- array.join() --------");
var a = [1,2,3,4,5,6,7,8,9,10]

var x = a.join();
console.log("array.join(\" \") result = " +x);


x = a.join("");
console.log("array.join(\"\") result = " +x);// joining without sapce

var b = new Array(10);
console.log(b.join("-"));// will print 9 hyphens

console.log("---------------string.split()---------------")
var s = "d u t r w";
var arr = s.split(" ");
console.log(arr);

var s = "d u t r w";
console.log("string s = " +s);
var arr = s.split(" ");
console.log(arr);

var s = "d u t r w";
console.log("string s = " +s);
var arr = s.split(" ");
console.log(arr);
s= "xxx, yyyy, zzz , oooooo";
var arr= s.split(",");
console.log(arr);

s= "xxx123yyyy, zzz123YYYYY , oooooo123OOOOO";
var arr= s.split("123");
console.log(arr);


//read line by line a csv file separated by ,
console.log("---------------transaction file---------------")
transaxtionString= "debit, 100, february 26";
var transcation= transaxtionString.split(",");
console.log("Array transactions =  " +transcation);// will print by concation the " string inside"
console.log(transcation);// will print the format of an Array

console.log("---------------Array.reverse()---------------")
var a = [1,2,3,4,5,6,7,8,9,10];
console.log(a);
a.reverse();
console.log(a);
//console.log(a.reverse());------doing by one line same 

console.log("---------------Array.sort()---------------")
console.log("---sorting alphabetically---")
var b = [3,111,4,200,50]
console.log(b);

b.sort();// sort alphabetically as it is a string
console.log(b);
console.log("---Using function sort numerically---")
b.sort(function(a,b){return b-a;});// reverse order
console.log(b);

b.sort(function(a,b){return a-b;});// numerial order
console.log(b);

console.log("----------Array.slice() slide 38-----------");
var c = [1,2,3,4,5,6,7,8,9,10];
console.log(c);
var d =c.slice(0,3);
console.log(d);

var d =c.slice(5,9);
console.log(d);

var d =c.slice(3);
console.log(d);

console.log("----------Array.splice()- slide 39-----------");
var e= [1,2,3,4,5,6,7,8];
console.log(e);
var d =e.splice(4);
console.log(d);

var d =e.splice(1,2);
console.log(d);

var d =e.splice(1,1);
console.log(d);

// console.log("------Array.foreach()-----------")
// array1.forEach (function(element){console.log(element);});   // printing all elements of the array

console.log("----------Array.forEach-------");
var data = [1,2,3,4,5,6,7,8,9,10];
console.log(data);
var sum = 0;
data.forEach(function(value){sum +=value;});
console.log("The sum is : " + sum);

console.log(data);
data.forEach(function(v, i, a) { a[i] = v + 1;});// increment the value by 1 
console.log(data);

console.log("------Array.map()---------------")
var f = [1,2,3,4,5,6,7,8,9,10];
var g = f.map(function(x) {return x*x});
console.log(f);
console.log(g);

// increase the prices of the array list by 10%
console.log("-----------increase the prices by 10% using map()----------");
var prices = [1,2,3,4,5,6,7,8,9,10];
var newPrices = prices.map(function(x) {return x*1.1});
console.log(prices);
console.log(newPrices);

console.log("------Array.filter()---------------")
var prices = [1,2,3,4,5,6,7,8,9,10];
var lowestPrices = prices.filter(function(x) {return ((x<3) || (x>7))}); 
console.log(prices);
console.log(lowestPrices);
var highPrice = prices.filter(function(x,i) {return i%2==0}); 
console.log(highPrice);

