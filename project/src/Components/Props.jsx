const Props=(x)=>{
    console.log(x)
    return(
        <div>
            <h1> Structure of webpage is <u>{x.abc[0].name}</u></h1>
            <h1>Design is: {x.abc[1].name}</h1>
            <h1>Fuctionality is: {x.abc[2].name}</h1>
        </div>
    )
}
export default Props