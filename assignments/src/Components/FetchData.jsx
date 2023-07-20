import { useEffect,useState } from "react"
import axios from "axios"

const FetchData=()=>{
    let [content , setContent]=useState("")
    let [id,setId]=useState(0)
    useEffect(()=>{
        axios.get(`https://jsonplaceholder.typicode.com/posts/${id}`)
        .then((resp)=>{
            setContent(resp.data)
        })
        .catch(()=>{
            console.log("No data")
        })
    },[id])
    let idData=(e)=>{
        setId(e.target.value)
    }
    return(
        <div>
            <input type="text" value={id} onChange={idData} /><br />
            <h1>{content.id}</h1>
            <h1>{content.title}</h1>
        </div>
    )
    }
export default FetchData