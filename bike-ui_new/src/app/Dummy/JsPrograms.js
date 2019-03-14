
// count
var str = "abcddeabcfghhhea"
var arr = str.split("");
uniqueCount = ["a","b","c","d","d","e","a","b","c","f","g","h","h","h","e","a"];
var  count = {};
uniqueCount.forEach(function(i)
 { 
count[i] = (count[i]||0) + 1;
});
console.log(count); // {a: 3,b: 2,c: 2,d: 2,e: 2,f: 1,g: 1,h: 3}
console.log(Object.keys(count),Object.values(count));//(8) ["a", "b", "c", "d", "e", "f", "g", "h"] (8) [3, 2, 2, 2, 2, 1, 1, 3]
 
var keys = Object.keys(count);
var values = Object.values(count);
var finalArr = [];

for(var i=0;i<keys.length;i++)
{
finalArr.push(keys[i]+''+values[i]);
}
console.log(finalArr);//["a3", "b2", "c2", "d2", "e2", "f1", "g1", "h3"]

//fib series
function fibSeries(n){
	let arr=[0,1];
	for(let i=0;i<n-2;i++){
	arr.push(arr[i]+arr[i+1]);
	}
	console.log(arr);//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
	}
    fibSeries(10);
   
    
//highest order    
var n =  6784359;
var digits = (n.toString()).split("");
console.log(digits);
var sorted=digits.sort((a, b) => (b-a));
console.log(sorted);
var joined=sorted.join("");
console.log(joined);


// highest repeating element
a=['pear', 'apple', 'orange', 'apple'];
b={};
max='', maxi=0;
for(let i of a) {
  if(b[i]) b[i]++; 
  else b[i]=1;
  if(maxi < b[i]) { max=i; maxi=b[i] }
}
console.log(max+ maxi )
console.log(b);

//next prime no.

function nextPrime(n){
	let m=n+1;
	for(let i=2;i<m-1;i++){
        if(m%i ==0){
            m++;
            continue;
        }
	}
	console.log(m+'is next prime number');
	}
    var myNextPrimeNumber = new nextPrime(7);
    

    function primenumber(){
        let n= 97;
        let isprime=true ;

        if(n<=1){
            isprime = false;
        }

        for (let i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
            }
        }
        console.log(isprime);
    }
    primenumber();


    var fibo = function(computed, number) {
        if (number < 3) {
         return 1;
         }
         // If fibonacci for this this position is calculated just return.
         // This is called memoization (Dynamic Programming)
         if (computed[number]) {
         return computed[number]
         } else {
         computed[number -1] = fibo(computed, number - 1);
         computed[number -2] = fibo(computed, number - 2);
         return computed[number -1] + computed[number -2];
         }
        }

        console.log(fibo({},7))


//dynamic add arguments
        function add() {
            var sum = 0;
            
            function add() {
                for (var i=0; i<arguments.length; i++) {
                    sum += Number(arguments[i]);
                }
                return add;
            }
            add.valueOf = function valueOf(){
                return sum;
            };
            return add.apply(null,arguments);
        }
        console.log("sum of one param"+add(2)); 
        console.log("sum of two params"+add(2)(3));
        console.log("sum of four params"+add(1,2)(5)(6)(5));