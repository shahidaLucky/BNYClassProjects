/**
 * anonymous function
 */

// slice
// splice
// join
// push 
// pop
// unshift
// shift
// concat
// reverse
// filter
// map
// sort



let numbers = [3, 4];

let anyFunction = function (value) {
    return value * 3;
}
let newNumbers = numbers.map(anyFunction);

console.log(newNumbers);