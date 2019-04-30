/**
 * SLide ----6
 */
var simpleObject = function(c){
    this.city = c;
}
var live1 = new simpleObject("Brooklyn");
var live2 = new simpleObject("Bronx");
live2.state = "New York";
console.log(live1);
console.log(live2);
console.log(live2.prototype === live1.prototype);