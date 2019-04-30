/**
 * Sigle dimentional Array
 */
// let numbers = [2, 3, 4];
// let n = [2, , , , 5];


// // multi dimentional Array
// let matrix = [
//     [
//         [1,2,3],
//         [5,6],
//     ],
//     [

//     ]
// ];

// console.log(matrix[0][1][1]);


// looping through array Using for
// let fruits = ["Apple", "Orange", "Plum", "jack", "litchi"];
// for (let i = fruits.length - 1; i >= 0; i--) {
//     console.log(fruits[i]);
// }

// let fruits = ["Apple", "Orange", "Plum", "jack", "litchi"];
// for (let name of fruits) {
//     console.log(name);
// }

// Array Operations
let fruits = ["Apple", "Orange", "Plum", "Jack", "Banana"];
// let lastValue = fruits.pop();
// console.log(lastValue);
// console.log(fruits);
// push(value); work on end
// pop(); work on end

// unshift(value); // front of the array
// shift(); // front of the array

// concating multiple array;
// let x = [2, 3];
// let y = [5, 6];
// let z = [11, 12];
// let nArray = z.concat(y).concat(x);
// console.log(nArray);
// let newArray = [].concat(x).concat(z).concat(y);
// console.log(newArray);

// method's on string



// var myFish = ['angel', 'clown', 'trumpet', 'sturgeon'];
// var removed = myFish.splice(1, 2, 'parrot', 'anemone', 'blue');
// console.log(myFish);
// console.log(removed);
// console.log(myFish);
// let word = 'abc';
// let reverseString = word.split("").reverse().join("");
// console.log(reverseString);

// let myFish = ['angel', 'clown', 'trumpet', 'sturgeon'];
// myFish.forEach(function (value, index) {
//     console.log(value, index);
// });


// let numbers = [2, 3, 4];
// let newNumbers = numbers.map(function (val) {
//     return val * 3;
// });
// console.log(newNumbers);

// let names = ['arshan', 'aksa'];
// let newNames = names.map(function (value, index) {
//     return val.toUpperCase();
// });

// console.log(newNames);

// let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// let newNumbers = numbers.filter(function (value) {
//     return value % 2 === 0;
// });

// console.log(newNumbers);

/// array sorting--- acending and decending
let numbers = [2, 1, 7, 9, 3, 7];
let sorted = numbers.sort(function (a, b) {
    if (a > b) return -1;
    if (b > a) return 1;
    return 0;
});
console.log(sorted);









