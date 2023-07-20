import { useState } from "react"
const State=()=>{
    let [data,setData]=useState("I am hungry")

    let btn=()=>{
        setData("I am full")
    }
    return(
        <div>
            {data}
            <button onClick={btn}>Food</button>
        </div>
    )
}
export default State