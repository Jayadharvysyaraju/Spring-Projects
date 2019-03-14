
//inheritance
class Shape { 
    Area:number 
    
    constructor(a:number) { 
       this.Area = a 
    } 
 } 
 
 class Circle extends Shape { 
    disp():void { 
       console.log("Area of the circle:  "+this.Area) 
    } 
 }
   
 var obj = new Circle(223); 
 obj.disp()

 

 //Method overriding
 class PrinterClass { 
    doPrint():void {
       console.log("doPrint() from Parent called…") 
    } 
 } 
 
 class StringPrinter extends PrinterClass { 
    doPrint():void { 
       super.doPrint() 
       console.log("doPrint() is printing a string…")
    } 
 } 
 
 var obj1 = new StringPrinter() 
 obj1.doPrint()



 //Duck typing

 interface IPoint { 
    x:number 
    y:number 
 } 
 function addPoints(p1:IPoint,p2:IPoint):IPoint { 
    var x = p1.x + p2.x 
    var y = p1.y + p2.y 
    return {x:x,y:y} 
 } 
 
 //Valid 
 var newPoint = addPoints({x:3,y:4},{x:5,y:1})  
 
 //Error 
 //var newPoint2 = addPoints({x:1},{x:4,y:3})  -->// compile errors