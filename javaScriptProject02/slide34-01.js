/**
 * 
 */
// 1) Start with a year value of 0 and a balace of $10000.
var vYear= 0;
var vBalance= 10000;
var vInterest= 0;
var vRate =0.05;
// 2) Reapeat the following steps while the balance is less than 20000;
  while(vBalance < 20000){
     vYear++;                            // 3) Add 1 to the year value
                                        // 4) Compute the interest by multiplying the balance value by 0.05
                                                   // pluse together in line
                                            // 5) Add the interest to the balance
    vBalance *= (1+vRate); // vInterest = vBalance * 0.05; 
                          //vBalance += vInterest; //vBalance = vBalance+vInterest
// 6) Report the final  year value as the answer:
  console.log("Years = "  +vYear);





  /*var rate= 5;
var Initialbalance = $10000;
var target = 2* Initialbalance;
var balance = Initialbalance;

while(balance<target){
    var interest = balance * rate / 100;
    balance= balanace + interest;
    year++;// process towards failure
}
console.log("The investment doubled after " + year + " years.");*/