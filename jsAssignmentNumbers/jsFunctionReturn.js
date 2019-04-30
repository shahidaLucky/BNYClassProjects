/**
 * 
 */
console.log("------Function Returns --- slide 13-------------");
function myJoin(p) {
    for (var o in p)
        console.log(o + ":" + p[o], "\n");
}
var books = {
    main_tittle: "JavaScript",
    sub_tittle: "The Definitive Guide",
    author: "David Flanagan",
    pages: 300
};
//console.log("")
myJoin(books);
console.log("------Function Returns --- slide 13-------------");
function myJoin(obj) {
    console.log(obj.first_name);//print the value stored in the object obj's property firstName
    console.log(obj["first_name"]);

    // var person = {
    //     first_name: "Luke",
    //     last_name: "Lance"
    // };

    console.log("------Function Returns --- slide 13-------------");
    function myJoinPerson(objPerson) {
        console.log(obj.first_name);//print the value stored in the object obj's property firstName
        console.log(obj[first_name]);

        var person = {
            first_name: "Luke",
            last_name: "Lance"
        };
        //-----------------------------------------------------------------------------------------------
        console.log("------Function Returns --- slide 12-------------");
        function add(a, b) {
            var c = a + b;
            return c;
        }
        var result = add(3, 5);
        console.log("The sum of two numbers = " + result);
    }
}
console.log("------Hoisting------------------");
person= {
    first_name: "Luke",
    last_name: "Lance",
    age: 23
};

function printprops(p){
    for(var o in p){
        console.log(o + ":" + p[o] + "\n");
    }
}
printprops(person);
var person;