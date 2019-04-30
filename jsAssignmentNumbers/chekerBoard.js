/**
 * Task B. Checkerboard
Write a program checkerboard.html that asks the user to input width and height and prints a rectangular checkerboard of the requested size using asterisks and spaces (alternating).
Example:
Input width: 11
Input height: 6

Shape:
* * * * * *
 * * * * * 
* * * * * *
 * * * * *
* * * * * *
 * * * * *

Hint:
You used nested loops in the previous task that looked probably like
for (var row = 0; row < height; row++) {
    for (var col = 0; col < width; col++) {
        ...
    }
}
Inside the loops, you can add an if statement that will be conditionally printing asterisk * or (space) depending on the coordinates row and col.
Again create the shape inside a string variable and the print the variable
 */
let height = prompt("please enter the height: ");
let width = prompt("please enter the width: ");
console.log(height);
console.log(width);

for (let i = 0; i <= height; i++) {
    let star = "";
    for (let j = width; j >= 1; j--) {
        if ((j+i)%2) {
            star += "*";
            document.write('*');
        }else{
            star += " ";
        }

    }
    console.log(star);
    document.write('<br/>');
}