
//tuple - collection of values of varied types
var mytuple = [10,"Hello"]; //create a  tuple 
console.log(mytuple[0]) 
console.log(mytuple[1])


//Union - the ability to combine one or two types
var val:string|number 
val = 12 
console.log("numeric value of val "+val) 
val = "This is a string" 
console.log("string value of val "+val)


//interface

interface IPerson { 
    firstName:string, 
    lastName:string, 
    sayHi: ()=>string 
 } 
 
 var customer:IPerson = { 
    firstName:"Tom",
    lastName:"Hanks", 
    sayHi: ():string =>{return "Hi there"} 
 } 
 
 console.log("Customer Object ") 
 console.log(customer.firstName) 
 console.log(customer.lastName) 
 console.log(customer.sayHi())  
 
 var employee:IPerson = { 
    firstName:"Jim",
    lastName:"Blakes", 
    sayHi: ():string =>{return "Hello!!!"} 
 } 
   
 console.log("Employee  Object ") 
 console.log(employee.firstName);
 console.log(employee.lastName);


//Index based

 interface namelist { 
    [index:number]:string 
 } 
 
 //var list2:namelist = ["John",1,"Bran"] //Error. 1 is not type string  
 interface ages { 
    [index:string]:number 
 } 
 
 var agelist:ages; 
 agelist["John"] = 15   // Ok 
 //agelist[2] = "nine"   // Error

 
 
 //Multiple Inheritance
 interface IParent1 { 
    v1:number 
 } 
 
 interface IParent2 { 
    v2:number 
 } 
 
 interface Child extends IParent1, IParent2 { } 
 var Iobj:Child = { v1:12, v2:23} 
 console.log("value 1: "+this.v1+" value 2: "+this.v2)