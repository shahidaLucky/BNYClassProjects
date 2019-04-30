/**
 * Consider the following example:
Given the string below:
**************
**************
**************
*****####**
**************
**************
Our task is to find the first # and see how many # follow without no interruption. Meaning I should keep looking for # until I find a * or I’m at the end of the string

 */

var inputString= "**************\n**************\n**************\n*****#####**\n**************\n**************";
console.log(inputString);
var counter = 0; // use the counter for counting every time # is found-- i--> use to iterate the inputString, form 0 inputStirng.length-1.

for(i=0; i<inputString.length; i++){
    if(inputString[i] =="#"){
        while((i<inputString.length) && inputString[i] == "#"){
        counter++;
        i++;
        }
        i--;
        break;
    }
}
console.log("Numbers of times = " + counter);