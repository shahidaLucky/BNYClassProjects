/**
 * Function call
 */
console.log("--------------Function Call--------------")
function customMessage(pCustom, pTimes){ // pCustom just a convention of parameter means var type of parameter
    for (var i = 0; i < pTimes; i++){      // pTimes the same
        console.log(pCustom, i);
        console.log(i, pCustom);
    }
}
var vCustom = "Useful Message ----> ";
var vTimes = 5;
customMessage(vCustom, vTimes);