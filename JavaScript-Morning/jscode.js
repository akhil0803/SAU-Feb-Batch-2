let getResult=()=>{
    let str=document.getElementById("input").value
    let pattern=/\d/g
    if(pattern.test(str)){
        
        alert("Given String contains a number")
        return
        
    }
    let vowels="",consonants=""

    for(i of str){
        let v=i.toLowerCase()
        if(i==='a' || i==='e'|| i==='i' || i==='o' || i==='u') vowels+=i+' '
        else consonants+=i+' '
    }
    document.getElementById("length").innerHTML+=" "+str.length
    document.getElementById("upper").innerHTML+=" "+str.toUpperCase()
    document.getElementById("lower").innerHTML+=" "+str.toLowerCase()
    document.getElementById("vowels").innerHTML+=" "+vowels
    document.getElementById("consonants").innerHTML+=" "+consonants
    
    
}