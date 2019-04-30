/**
 * SLide 19
 */
var uniqueInteger = function(){ // Define and invoke
    var counter = 0;// private state of function below
    return function(){ return counter++; };
}();

console.log(uniqueInteger());
console.log(uniqueInteger());
console.log(uniqueInteger());