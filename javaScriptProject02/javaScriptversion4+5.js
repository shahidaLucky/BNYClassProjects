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
//case 2
var inputString= "******#*******\n*****##********\n**************\n*****#####**\n**************\n**************";
console.log(inputString);
var counter = 0; // use the counter for counting every time # is found-- i--> use to iterate the inputString, form 0 inputStirng.length-1.
var sequenceCounter = 0;
for(i=0; i<inputString.length; i++){
    if(inputString[i] =="#"){
        counter++;
        if(inputString[i+1]=="*"){
            sequenceCounter++;
            console.log("sequence # " + sequenceCounter + " Number of times = " + counter);
            counter=0;
        }
    }
}