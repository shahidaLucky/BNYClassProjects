/**
 * 
 */
console.log("--------------------Slide 19----------------------");
var a =[23,32,45,67,22,77,99,67,98,56,12];
for(let i=0; i < a.length; i++){
    console.log(a[i]);
}

console.log("--------------------Slide 20----------------------");
var a =[23,32,45,67,,22,77,99,67,98,56,12];// before 22 it will print undefined for empty space then print the rest.

for(let i=0; i < a.length; i++){
    console.log(a[i]);
}
console.log("--------------------Slide 21----------------------");
var a =[23,32,45,67,,22,77,,67,98,56,12];// before 22 it will print undefined for empty space then print the rest.
for(let i=0; i < a.length; i++){
    if(!a[i]){
        continue;
    }
    console.log(a[i]);
}
console.log("--------------------Slide 21- 2nd part---------------------");
var a =[23,32,45,67,,77,,67,98,56,12];// before 22 it will print undefined for empty space then print the rest.
for(let i=0; i < a.length; i++){
    if(a[i]== = undefined){
        continue;
    }
    console.log(a[i]);
}
console.log("--------------------Slide 21 updated version1----------------------");
var accountTransaction =[1,1,1,1,1,1,1,1,1,1,111];// wiil not print the sum coz the array has undefined values.
var sum=0;
for(let i=0; i < accountTransaction.length; i++){
    sum += accountTransaction[i];
}
console.log("the total is = " + sum);
console.log("the length of a is =  " + accountTransaction.length);
console.log("the number of elements in a are = " + accountTransaction.length);// will skip the undefined value space and will print only the values

console.log("--------------------Slide 21 updated version-2---------------------");
var accountTransaction =[23,32,45,67,,22,77,99,67,98,56,12];// wiil not print the sum coz the array has undefined values.
var sum=0;
for(let i=0; i < accountTransaction.length; i++){
    sum += accountTransaction[i];
}
console.log("the total is " + sum);
console.log("the length of a is =  " + accountTransaction.length);
console.log("the number of elements in a are = " + accountTransaction.length);// will skip the undefined value space and will print only the values
