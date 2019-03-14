
var jay:string ="jayadhar";
console.log(jay);

class Greeting { 
    greet(a:number,b:number):number { 

      return a*b;
    } 
 } 
var obj : Greeting = new Greeting(); 
 var x:number = obj.greet(5,3);
 console.log(x);

var raj= 1;
 //raj ="jay"; - syntax error - type inference

var str = '1' 
var str2:number = <number> <any> str   //str is now of type number - type assrertion
console.log(str2)

var global_num = 12          //global variable 
class Numbers { 
   num_val = 13;             //class variable 
   static sval = 10;         //static field 
   
   storeNum():void { 
      var local_num = 14;    //local variable 
   } 
} 
console.log("Global num: "+global_num)  
console.log(Numbers.sval)   //static variable  
var obj1 = new Numbers(); 
console.log("class num: "+obj1.num_val) 

var num:number = -2 
var result = num > 0 ?"positive":"non-positive" 
console.log(result)

var num = 12 
console.log(typeof num);  //type of returns the data type of the operand

// instance of used to test if an object is of a specified type or not.
class Person{ } 
var obj = new Person() 
var isPerson = obj instanceof Person; 
console.log(" obj is an instance of Person " + isPerson);

var j:any; 
var n:any = "a b c" 

for(j in n) {
   console.log(j) //prints index
   console.log(n[j])  //prints elements
}