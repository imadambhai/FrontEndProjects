function genotp()
{
var result=Math.random()*(9999-1000)+1000;

var OTP=Math.floor(result)
console.log(OTP)
var name=document.getElementById("input").value
document.getElementById("Output").textContent="Hello!" +name+ " Your OTP is : "+OTP
}