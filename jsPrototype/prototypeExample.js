/**
 * prototype Book
 * constructor /function
 * with parameter 
 * tittle, author, addition, year, typeOfBook, description
 * method name "pritnBookObject" which will print the properties.
 */
var Book = function(tittle, authorFullName,yearPublication){
    this.tittle = tittle;
    this.author = authorFullName;
    //this.addition = addition;
    this.yearPublication = yearPublication;
    this.type = "";
    this.edition = 0;
    this.description = "";
    this.pritnBookObject = function(){
       // console.log(this.tittle, ", ", this.authorFullName, ", ", this.yearPublication, ", ", this.year, ", ",this.description)
       console.log(this);
    }
    this.pritnBookLucky = function(){
        for(var prop in this){
            console.log(prop, "=", this[prop]); // Book.propertyName OR Book[propertyName]--prop is a variable of property its taking the name of the properties
        }
    }
}
var jsBook = new Book("Intro to JS for all", "Lucky", 2019);
jsBook.pritnBookObject();
console.log(" ------------------------------ ");
jsBook.pritnBookLucky();

//console.log("*************************************\n\n\n\n\n\n\n\n\");