/**
 * 
 */
console.log("-----------Slide  20--------------");
var sum_of_square = {
    first: 0,
    second: 0,
    square: function(){
        this.result = ((this.first * this.first) + (this.second * this.second));
        return this.result;
    }
}
sum_of_square.first = 2;
sum_of_square.second = 3;
var FR = sum_of_square.square();
console.log(FR);
console.log(sum_of_square);

console.log("-----------Nested Functions Slide  20--------------");
function new_sum_of_square(a,b){
    function square(x){
        return x*x;
    }
    return ((square(a) + square(b)));
}
var result = new_sum_of_square(2,3);
console.log(result);
//console.log(square(a));// its inside the another function that is nested and we can not access them outside 
