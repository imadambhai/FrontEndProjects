import { useState } from "react"
const Array=()=>{
    let arr=[{name:"HTML"},{name:"CSS"},{name:"JavaScript"}]
    let [data,setdata]=useState(arr)

    return(
        <div>
           {
            data.map((x)=>{
                return(
                    <h1>
                        {x.name}
                    </h1>
                )
            })
           }
        </div>
    )
}
export default Array