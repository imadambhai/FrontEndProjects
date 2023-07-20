import CrudNav from "./CrudNav"
import crud from "./crudnav.module.css"
import { useEffect,useState } from "react"
import { Link } from "react-router-dom"
import axios from "axios"



const Users=()=>{
    let[content,setContent]=useState([])
    useEffect(()=>{
        axios.get("http://localhost:3000/users")
        .then((res)=>{
            setContent(res.data)
        })
    },[])
    return(
        <div id={crud.userPage}>
            {content.map((x)=>{
                return(
                    <div id={crud.userDetails}>
                        <form action="">
                            <tr>
                                <td> <label htmlFor="">Name</label></td>
                                <td> <h2></h2></td>
                            </tr>
                            <tr>
                                <td> <label htmlFor="">Company</label></td>
                                <td><h2></h2></td>
                            </tr>
                            <tr>
                                <td> <label htmlFor="">Salary</label></td>
                                <td><h2></h2></td>
                            </tr>
                            <button>Edit</button>
                            <button>Delete</button>

                        </form>
        </div>
                )
            })}
        </div>
    )
}
export default Users