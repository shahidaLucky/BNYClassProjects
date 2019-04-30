// write a function to determins a number is prime or not

function isPrime(number) {
    if (number % 2 === 0) {
        return 'No';
    }

    for (let i = number - 2; i > 2; i = i - 2) {
        if (number % i === 0) {
            return 'No';
        }
    }
    return 'Yes';
}

// console.log(isPrime(109));
// es6 features . https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals


// Display Prime number's between 20-90 by Using isPrime Function;

function primeBetween(l, u) {
    for (let i = l; i <= u; i++) {
        let test = isPrime(i);
        if (test === 'Yes') {
            console.log(i + " Is a prime number.");
        }
    }
}

// Write a function which count prime number between range by using isPrime function.
function countPrimeNumbers(l, u) {
    let counter = 0;
    for (let i = l; i <= u; i++) {
        let test = isPrime(i);
        if (test === 'Yes') {
            counter++;
        }
    }
    // console.log("There is" + counter + "Prime numbers.");
    console.log(`There is ${counter} Prime Numbers`);
}
countPrimeNumbers(2000, 5000);

// What is NodeJs?
// Nodejs is JS runtime. Its use Google V8 engine to interprate JS. V8 engine is used behind Google Chrome.

