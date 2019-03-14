
//1
var x;
console.log(x);// undefined
x=10; 

//2
x=20;
console.log(x); //20

//3
let y=15;
console.log(y); //15

//4
//console.log(z); // reference error
//let z=5;

//5
let a;
console.log(a); // undefined
a=6;

//6
//b=4;
//console.log(b); // reference error
//let b;

// let and const are same -- Variables defined with const behave like let variables, except they cannot be reassigned,
// but u can modify constant object

var d=20;
function dummy()
{
   let  d= 10;
}
dummy();
console.log("jay"+d);


//function hoisting

console.log(add(4,3));
function add(x,y){
    return x+y;
}

console.log(add(2,3));

//console.log(product(8,9)); //- error : functions expressions can't be hoisted - it's also called anonymoyus function
var product = function(x,y){
    return x*y;
}

console.log(product(6,7));//42

// named function expression
var factorial = function ComputeFcatorial(x){
    if (x<=1){
        return 1;
    }
    return x*ComputeFcatorial(x-1);
}

console.log(factorial(5)); //120
//console.log(ComputeFcatorial(5)); //ComputeFcatorial can be accessed only inside the function but not outside.


//self invoking functions / immediate invoking function exp

var result = (function ComputeFcatorial(x){
    if (x<=1){
        return 1;
    }
    return x*ComputeFcatorial(x-1);
})(4)

console.log(result);