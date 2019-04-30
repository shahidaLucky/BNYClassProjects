/**
 * Task C. Cross
Write a program cross.html that asks the user to input the shape size, and prints a diagonal cross of that dimension.
Example:
Input size: 8

Shape:
*      *
 *    *
  *  *
   **
   **
  *  *
 *    *
*      *

 */
let size=8;
//let bordeLine = "";
 for(let i=0; i<=8; i++){
     for(let j=0; j<=8; j++){
         if(i == j || i+j== 8-1){
           document.write('*'); 
         }else{
             document.write(' ');
         }
     }
  document.write('<br />');
 }