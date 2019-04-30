/**
 * 
 */
var today = new Date();
console.log("TODAY = " +today);

console.log("\n-----------------------------------\n");
var yesterday = new Date();
yesterday.setDate(today.getDate() - 1);
console.log("YESTERDAY = " +yesterday);

console.log("\n-----------------------------------\n");
var tomorrow = new Date();
tomorrow.setDate(today.getDate() + 1);
console.log("TOMORROW = " +tomorrow);

console.log("\n-----------------------------------\n");
var values = today.getDate()-1;
console.log(values);

console.log("\n-----------------------------------\n");
// what is todays year?
console.log("YEAR = " + today.getFullYear());
// what is todays month?
console.log("MONTH = "+today.getMonth());
// what is todays day?
console.log("DAY = "+today.getDay());

// -----------------------slide 32------------------------------------
console.log("\n-----------------------------------\n");
var text = "javaScript";

console.log(text.search(/script/));

console.log("\n-----------------------------------\n");
text = "I love javaScript, I love javaScript, I love javaScript, yeah ";
result = text.replace(/love/gi, "Like")
console.log(text);
console.log(result);

console.log("\n-----------------------------------\n");
text = "I love javaScript, I love javaScript, I love javaScript, yeah ";
var resultA = text.match(/love/gi);//An Array whose contents depend on the presence or absence of the global (g) flag,
                                   // or null if no matches are found.
console.log(resultA.length);
console.log(resultA[0]);
console.log(resultA[1]);
console.log(resultA[2]);


