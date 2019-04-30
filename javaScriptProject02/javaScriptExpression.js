/**
 * Expression slide 48-------
 */
var expression= '27+83-3*5-6^';
var character= "";
var numbers="";
var operands= "";
const SEPARATOR = '|';

for(var i=0; i<expression.length;i++){
    console.log(expression[i]);

    character = expression[i];
    if((character == "+")||(character == "-")||(character == "*")||(character == "/")||(character == "^")){
        //console.log("This is a operand");
        operands = operands + character + "|";// it will print the "|" at the end
    }else{
        numbers += character + "|";
        //console.log("This is a number");
    }
}
console.log("Expression  =  " + expression);
console.log("Operandes  = " + operands);
console.log("Numbers   = " + numbers);