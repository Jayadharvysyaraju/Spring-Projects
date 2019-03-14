var jay = "jayadhar";
console.log(jay);
var Greeting = /** @class */ (function () {
    function Greeting() {
    }
    Greeting.prototype.greet = function (a, b) {
        return a * b;
    };
    return Greeting;
}());
var obj = new Greeting();
var x = obj.greet(5, 3);
console.log(x);
var raj = 1;
//raj ="jay"; - syntax error - type inference
var str = '1';
var str2 = str; //str is now of type number - type assrertion
console.log(str2);
var global_num = 12; //global variable 
var Numbers = /** @class */ (function () {
    function Numbers() {
        this.num_val = 13; //class variable 
    }
    Numbers.prototype.storeNum = function () {
        var local_num = 14; //local variable 
    };
    Numbers.sval = 10; //static field 
    return Numbers;
}());
console.log("Global num: " + global_num);
console.log(Numbers.sval); //static variable  
var obj1 = new Numbers();
console.log("class num: " + obj1.num_val);
var num = -2;
var result = num > 0 ? "positive" : "non-positive";
console.log(result);
var num = 12;
console.log(typeof num); //type of returns the data type of the operand
// instance of used to test if an object is of a specified type or not.
var j;
var n = "a b c";
for (j in n) {
    console.log(j); //prints index
    console.log(n[j]); //prints elements
}
