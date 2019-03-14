
//Closure

function outer() {
    var b = 10;
    var c = 100;
       function inner() {
            
             var a = 20; 
             console.log("a= " + a + " b= " + b);
             a++;
             b++;
             return a;
        }

       return inner;
    }
    var X = outer();  // outer() invoked the first time
    var Y = outer();  // outer() invoked the second time
    //end of outer() function executions
    
    console.log(X()); // X() invoked the first time
    

    var add = (function(){
        var counter=0;
        return function(){
            counter+=1; return counter;
        }
    })();

    console.log(add());
    console.log(add());

// call apply bind
var person = {
    firstName : "jayadhar",
    lastName : "Raj",
    fullName: function(city, country) {
        return this.firstName + " " + this.lastName + "," + city + "," + country;
    }
    }
    var person1 = {
    firstName:"John",
    lastName: "Doe",
    }

    // normal
    console.log(person.fullName("Oslo", "Norway"));

    //call
    console.log( person.fullName.call(person1, "Oslo", "Norway"));
    
    // apply
    console.log( person.fullName.apply(person1, ["Oslo", "Norway"]));

    //bind
    var x =  person.fullName.bind(person1);
    console.log(x("Oslo", "Norway"));