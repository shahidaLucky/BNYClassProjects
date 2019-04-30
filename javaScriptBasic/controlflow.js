/**
 * We are expecting a number from user. that might be 1,2,3,4
 * You need to console.log() those number's string from i.e. ONE, TWO, THree... so on
 * If No mathc found, then print "No Match";
 * Wrap this control flow within a function, so that we can call this function with different number's as input.
 *
 */
// Default parameter value

// function numberTest(number){
//     console.log(number);
//     if (number === 1) {
//         console.log("ONE");
//     }
//     else if (number === 2) {
//         console.log("Two");
//     }
//     else if (number === 3) {
//         console.log("Three");
//     }
//     else if (number === 4) {
//         console.log("Four");
//     } else {
//         console.log("No Match");
//     }
// }

// numberTest(2);
// numberTest(5);


/*
Test: 2
We are expecting 1 as input from user. 
Create a new variable named: stringNumber
store to stringNumber "one" when we got 1 as input
otherwise store "two" on stringNumber and print stringNumber end of your script
// */
let input = 1; // via form or promt
// let stringNumber;
// // variable scope
// if (input === 1) {
//     stringNumber = "one";
// }
// else {
//     stringNumber = "two";
// }
// console.log(stringNumber);

// using ternary operator
// let stringNumber = (input === 1) ? "one" : "two";
// console.log(stringNumber);


/*
Falsy Value: false, undefined, null, emptyString, 0, NaN
*/
// let test = [];
// if (test) {
//     console.log("Inside True");
// } else {
//     console.log("haha");
// }



/*
Switch
 * We are expecting a number from user. that might be 1,2,3,4
 * You need to console.log() those number's string from i.e. ONE, TWO, THree... so on
 * If No mathc found, then print "No Match";
 * Wrap this control flow within a function, so that we can call this function with different number's as input.
 * This time use switch
*/
let number = 1;
switch (number) {
    case 1:
        console.log("one");
        break;
    case 2:
        console.log("two");
        break;
    case 3:
        console.log("three");
        break;
    case 4:
        console.log("four");
        break;
    default:
        console.log("Invalid");
        break;
}



// End of control flow;





