function ch()
{
    var x=document.getElementById("Calc")
    console.log(x)
    x.style.backgroundColor="antiquewhite"
}
function add()
{
    var a=document.getElementById("Input1").value 
    var b=document.getElementById("Input2").value 
    var z=parseInt(a)+parseInt(b);
    document.getElementById("Result").value=z
  

}
function sub()
{
    var a=document.getElementById("Input1").value 
    var b=document.getElementById("Input2").value 
    var z=parseInt(a)-parseInt(b);
    document.getElementById("Result").value=z
}
function mul()
{
    var a=document.getElementById("Input1").value 
    var b=document.getElementById("Input2").value 
    var z=parseInt(a)*parseInt(b);
    document.getElementById("Result").value=z

}
function div()
{
    var a=document.getElementById("Input1").value 
    var b=document.getElementById("Input2").value 
    var z=parseInt(a)/parseInt(b);
    document.getElementById("Result").value=z
}
function clr()
{
    document.getElementById("Input1").value=null
    document.getElementById("Input2").value=null
    document.getElementById("Result").value=null

}


