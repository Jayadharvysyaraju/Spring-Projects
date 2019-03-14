//every - tests whether all the elements in an array passes the test implemented by the provided function
function isBigEnough(element, index, array) {
    return (element >= 10);
}
var passed = [12, 5, 8, 130, 44].every(isBigEnough);
console.log("Test Value : " + passed);
// filter - creates a new array with all elements that pass the test implemented by the provided function
var filetered = [12, 5, 8, 130, 44].filter(isBigEnough);
console.log("Test Value : " + filetered);
//foreach - calls a function for each element in the array.
var num = [7, 8, 9];
num.forEach(function (value) {
    console.log(value);
});
num.forEach(function (element) {
    console.log(element);
});
//map() method creates a new array with the results of calling a provided function on every element in this array.
var numbers = [1, 4, 9];
var roots = numbers.map(Math.sqrt);
console.log("roots is : " + roots);
//pop() method removes the last element from an array and returns that element.
var numbers = [1, 4, 9];
var element = numbers.pop();
console.log("element is : " + element);
var element = numbers.pop();
console.log("element is : " + element);
//push() method appends the given element(s) in the last of the array and returns the length of the new array.
var numbers = new Array(1, 4, 9);
numbers.push(10);
console.log("new numbers is : " + numbers);
numbers.push(20);
console.log("new numbers is : " + numbers);
//reduce() applies a function simultaneously against two values of the array (from left-to-right) as to reduce it to a single value.
var total = [0, 1, 2, 3].reduce(function (a, b) { return a + b; });
console.log("total is : " + total);
//reduceRight()applies a function simultaneously against two values of the array (from right-to-left) as to reduce it to a single value
var total = [0, 1, 2, 3].reduceRight(function (a, b) { return a + b; });
console.log("total is : " + total);
//slice() method extracts a section of an array and returns a new array.
var arr = ["orange", "mango", "banana", "sugar", "tea"];
console.log("arr.slice( 1, 2) : " + arr.slice(1, 2));
console.log("arr.slice( 1, 3) : " + arr.slice(1, 3));
console.log("After splice " + arr);
//sort() method sorts the elements of an array.
var arr = new Array("orange", "mango", "banana", "sugar");
var sorted = arr.sort();
console.log("Returned string is : " + sorted);
//splice() method changes the content of an array, adding new elements while removing old elements.
var arr = ["orange", "mango", "banana", "sugar", "tea"];
var removed = arr.splice(2, 0, "water");
console.log("After adding 1: " + arr);
console.log("removed is: " + removed);
removed = arr.splice(3, 1);
console.log("After removing 1: " + arr);
console.log("removed is: " + removed);
