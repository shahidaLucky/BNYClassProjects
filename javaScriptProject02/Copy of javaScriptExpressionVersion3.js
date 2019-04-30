/**
 * Expression slide 48-------
 */
var expression= '2237+83555-3*5-6678^';
var character= "";
var numbers="";
var operands= "";
const SEPARATOR = '|';

for(var i=0; i<expression.length;i++){
    console.log(expression[i]);

    character = expression[i];
    if((character == "+")||(character == "-")||(character == "*")||(character == "/")||(character == "^")){
        //console.log("This is a operand");
        operands = operands + character + SEPARATOR;
         numbers += "|";
    }else{
        numbers += character;
        //console.log("This is a number");
    }
}
if(numbers[numbers.length-1]!="|"){
 numbers += "|";
}
console.log("Expression  =  " + expression);
console.log("Operandes  = " + operands);
console.log("Numbers   = " + numbers);

console.log("-------------Concating two string as a number----------")
var numberA ="2";
var numberB = "3";

var result= numberA + numberB; // concating it as a string
var result= numberB + Number(numberA);// convert it to number then concating
var result= numberB + parseInt(numberA);// convert it to number then concating

console.log(numberA);
console.log(numberB);
console.log(result);

console.log("-----------------------------");
console.log("character 2 is : = "  +expression.charCodeAt(0)); // to find a ASCII of 0