/**
 * You try it now
Given the string below:
**************
**##*****#**
*****###****
**##*#***##
*****####**
**#**##*****
Our task is to find the first # and see how many # follow without no interruption. 
Meaning I should keep looking for # until I find a * or I’m at the end of the string. 
Stop only when the you count 4 or more # and print the number of #. 
If the numbers of continues # are 3 or less continue looking and print 0
 */
var inputString= "*****##*******"+
    "\n*************\n"+
     "*************\n"+
     "*****#####******\n"+
     "\n********######******\n"+
     "**************";
console.log(inputString);
var counter = 0; // use the counter for counting every time # is found-- i--> use to iterate the inputString, form 0 inputStirng.length-1.
var sequenceCounter=0;
for(i=0; i<inputString.length; i++){
    if(inputString[i] =="#"){
        counter++;
        if(inputString[i+1]=="*"){
            if(counter < 4){
                console.log("Number 0")
            }else{
                console.log("Number = " +counter)
                break;
            }
            counter=0;
        }
        }
    }