/**
 * 
 */
for(let i = 1; i<=4; i++){
    for(let j = 4; j>=i; j--){
        document.write(" ");
    }
    for(let k= 1; k<=i; k++){
        document.write("*");
    }
    for(let l= 2; l<=i; l++){
        console.log("*")
    }
    document.write('<br />>>');
}