function activate1()
{
alert("fuction1")
}
function activate2()
{
alert("fuction2")   
}
function activate3()
{
alert("fuction3")  
}
var btn=document.getElementById("btn")
btn.addEventListener("click",activate1)  
btn.addEventListener("click",activate2)
btn.addEventListener("click",activate3)