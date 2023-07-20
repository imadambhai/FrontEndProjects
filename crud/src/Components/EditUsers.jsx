import axios from "axios";
import React,{useEffect, useState} from "react";
import { useParams } from "react-router-dom";


const EditUsers=()=>{

let [name,setName]=useState("")
let [salary,setSalary]=useState("")
let [Company,setCompany]=useState("")
let {index}=useParams()
console.log(index)
useEffect(()=>{
    axios.get("")
    .then((resp)=>{
        console.log(resp.data)
        setName(resp.data.name)
        setCompany(resp.data.Company)
        setSalary(resp.data.salary)
    })
},[])
return(
    <div>
        <table>
                <tr>
                    <td> <label htmlFor="">Name</label></td>
                    <td> <input type="text" /> </td>
                </tr>
                <tr>
                    <td> <label htmlFor="">Company</label></td>
                    <td><input type="text" /></td>
                </tr>
                <tr>
                    <td> <label htmlFor="">Salary</label></td>
                    <td><input type="text" /></td>
                </tr>
                <button>Update</button>

        </table>
    </div>
)
}

export default EditUsers