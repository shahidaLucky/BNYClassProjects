/**
 * Hello, include comments here.............
 * This is my first javaScript
 */
//this is an inline comment.

console.log(4+3);
console.log(4*5);
console.log(4/2);
console.log(3>4);
console.log(2==2);
console.log("5"==5);
console.log("2"=="2");
console.log("now watch ?")
console.log(2===2);
console.log("5"===5);
console.log("2"==="2");

//--------------------------------------
console.log("Condition Operators")
console.log(3>2);
console.log(6==6);
console.log(3>2 && 6==6);
console.log(3>2 && 6==7);

console.log(3>2 || 6==7);

console.log((3>2 && 6==7) && (3>2 && 6==6));
console.log((3>2 && 6==7) || (3>2 && 6==6));
// slide 15-----
console.log(3>4 && 4==4);
console.log(3>4 || 4==4);
console.log((5!=5 || 4>4) && !(2==2));



//slide 16---- concat--------------
console.log("hola" + " my name is: " +(4*5) );
console.log("hey, is this" + " my name is: " +(4*5) );

// bitwise
console.log(1&2);
console.log(1|2);


//-------Assignment operator-----
// using var keyword
var myNumber=6;
var myNumber=0;
//console.log(myNumber);
// using let keyword
// let myNumber=6;
// let myNumber=0;
// console.log(myNumber);--------------it will show error
// slide--------------22
console.log("-------------opeerations-------------")
console.log("Operator ++ ");

var myNumber =9;
console.log(myNumber++);//10
console.log(++myNumber);
console.log(10 +myNumber);
//---------Operator --     --------------------
console.log("Operator -- ");
var myNumber=9;
console.log(myNumber);//9
console.log(10 +myNumber--);//19
console.log(10 +myNumber);//18

console.log(myNumber++);//10
console.log(++myNumber);
console.log(10 +myNumber)

//-----------slide 23---------------------
console.log("-------------Arithmetic shortcut---------------- ");
var myNumber=10;
console.log(myNumber +=5);//15 ===> myNumber = myNumber + 5;
console.log(myNumber -=5);//10 ===> myNumber = myNumber - 5;
console.log(myNumber %=3);//1 ===> myNumber = myNumber % 5;
console.log(myNumber *=5);//5 ===> myNumber = myNumber * 5;
console.log(myNumber /=5);//1 ===> myNumber = myNumber / 5;

console.log("------------------------------");
console.log(myNumber);//1
console.log("This is: " + ((myNumber +=5) > 10));

console.log("------------declaring varables string boolean and othes---------------")
var myName= "Lucky"; // String variable
var myFlag= true;   // boolean
var myOther= null;

console.log("This is my name : " +myName);
console.log("This is my flag : " +myFlag);
console.log("This is my my Other : " +myOther);
console.log(true==myFlag); // true
console.log("This is : " +(true==myFlag));//true
console.log("This is : " +(true===myFlag));// true

console.log("This is : " +(null==myOther));//true
console.log("This is : " +(null===myOther));//true

//----------------if statement slide 24----------------
var myNumber=5;
if(myNumber >= 5){
    console.log(myNumber+ "  is greter than on equal to 5");
}
if(myNumber==5){
    console.log(myNumber + "  is equal to 5");
}
//----------------if else statement slide 26----------------
var myNumber=5;
if(myNumber >= 5){
    console.log(myNumber+ "  is greter than on equal to 5");
}
else{
    console.log(myNumber + "  is less than 5");
}

//----------------if statement slide 27----------------
var myNumber=5;
if(myNumber == 0){
    console.log(myNumber+ "  is equal to 0");
}else if(myNumber > 0){
    console.log(myNumber + "  is a positive number");
}else if(myNumber < 0){
    console.log(myNumber + "  is a negative number");
}

/*
*ATM MENU SAMPLE
* 1 deposit  ====> Deposit Amount = $1.00
* 2 balance  ====> Account Balance = $1.00
* 3 services  ====> Welcome to the ATM Services
* 4 exit  ====> Thank you for using our service
*
* Enter optin (1-4) : [_]
*
*/
//-------------- 1st way-----------------------------------
var option = 3;
if (option == 1){
    console.log("Deposite Amount = $1.00");
}else if(option == 2){
    console.log("Account Balancet = $1.00");
}
else if(option == 3){
    console.log("Welcome to the ATM Services");
}
else if(option == 4){
    console.log("Thank you for using our service");
}
else{
    console.log("Error Messages: Invalid option. Valid option are 1-4");
}

//-------------------------  2nd way -----------------------------
option = 3;
console.log("option = " +option);
if ((option > 4) || (option <1)){
  console.log("Error Messages: Invalid option. Valid option are 1-4");
}else if(option == 2){
    console.log("Account Balancet = $1.00");
}
else if(option == 3){
    console.log("Welcome to the ATM Services");
}
else if(option == 4){
    console.log("Thank you for using our service");
}
else{
    console.log("Error Messages: Invalid option. Valid option are 1-4");
}

// -------------------------- switch--------------------
option=3;
console.log("option = " +option);
switch (option == 3){
    case 1:
    console.log("Deposite Amount = $1.00");
    break;
    case 2:
    console.log("Account Balance = $1.00");
    break;
    case 3:
    console.log(" Welcome to the ATM Services");
    break;
    case 4:
    console.log("Thank you for using our service");
    break;
    defult:
    console.log("ERROR Mrssage: invalid option.")
    break;
}
//---------------------slide 33 While Loop Excercise----------------

var year= 0;
var rate= 5;
var Initialbalance = $10000;
var target = 2* Initialbalance;
var balance = Initialbalance;

while(balance<target){
    var interest = balance * rate / 100;
    balance= balanace + interest;
    year++;// process towards failure
}
console.log("The investment doubled after " + year + " years.");