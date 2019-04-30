/**
 * label of the book
 * labael required --- 
 * Tittle: JavaScript
 * Author: Lucky
 * Year: 2019
 * Description: Advance JavaScript for all
 * 
 */
var Book = function(tittle, authorFullName,yearPublication){
    this.tittle = tittle;
    this.author = authorFullName;
    this.yearPublication = yearPublication;
    this.edition = 0;
    this.description = " Advance JavaScript for all";
    this.printLable = function(){
        console.log("   Tittle : "+this.tittle);
        console.log("   Author Name : "+this.authorFullName);
        console.log("   Year : "+this.yearPublication);
        console.log("   Description : "+this.description);

    }
}

var jsBook = new Book("Intro to JS for all", "Lucky", 2019);

for(var label= 1; label<=10; label++){
    console.log("\n*****************************************************\n");
    console.log("L:- "+label);
    jsBook.printLable();
}
