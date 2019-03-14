
 var x =1;
for(let i=1;i<=4;i++){
    var str =""; 
    for(let j=1;j<=i;j++){  
       str =str+x;   
       x++; 
    }
    console.log(str);
}

var n=4;
for(let i=1;i<=n;i++){
    var str ="";
    for(let j=1;j<=n-i;j++){
       str =str+" ";
    }
    for(let k=1;k<=2*i-1;k++){
        str =str+"*";
     }
    console.log(str);
}

//pascal traiangle
for(let i=1;i<=n;i++){
    var str ="";
    var c=1;
    for(let j=1;j<=n-i;j++){
       str =str+" ";
    }
    for(let k=1;k<=i;k++){
        str =str+c+" ";
        c= c*(i-k)/k;
     }
    console.log(str);
}

for(let i=1;i<=n;i++){
    var str ="";
    for(let j=1;j<=n-i;j++){
       str =str+" ";
    }
    for(let k=1;k<=i;k++){
        str =str+k+" ";
     }
    console.log(str);
}


for(let i=1;i<=n;i++){
    var str ="";
    for(let j=n;j>=i;j--){
       str =str+j;
    }
    console.log(str);
}