
var text = "string string string Aman\
stringstring string stringAman string";
var myName = "Aman";
var hits = []

for (var i = 0; i <= text.length; i++){
    if (text[i] === myName[0]){
        for(var x = i; x < (i + myName.length); x++){
           hits.push(text[x]); 
        };
    };
};

if (hits === 0){
    console.log("Your name wasn't found!");
}
else{
    console.log(hits);   
}

