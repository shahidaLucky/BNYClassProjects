/**
 * Prime Number
 * if the number is prime print yes or no.
 * Console log Prime number between 1-100;
 */
var vNumber;
for (vNumber = 1; vNumber < 100; vNumber++) {
    var vDivisor = 2;
    var vResult = 0;
    var vPrime = true;
    for (vDivisor = 2; ((vDivisor < vNumber) && vPrime); vDivisor++) {
        if (vNumber % vDivisor == 0) {
            //console.log(vDivisor);
            vPrime = false;
        }
    }
    if (vPrime) {
        console.log(vNumber + " is a prime number");
    }
}

//-------------------------Using While Loop------------------
// Determining a Number is Prime or Not
console.log("Using While Loop");
var vNumber = 7;
var vDivisor = 2;
var vResult = 0;
var vPrime = true;
// ++vDivisor vs vDivisor++
while ((vDivisor < vNumber) && vPrime) {
    if (vNumber % vDivisor == 0) {
        vPrime = false;
    }
    vDivisor++;
}
if (vPrime) {
    console.log(vNumber + " is a prime number")
}
//Big O Notation 