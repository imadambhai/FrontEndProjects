import { useState } from "react"
const Statearray=()=>{
    let [arr]=useState(["Hi","Hello","Bye"])

    return(
        <div>
           {
            arr.map((x)=>{
                return(
                    <h1>
                        {x}
                    </h1>
                )
            })
           }
        </div>
    )
}
export default Statearray