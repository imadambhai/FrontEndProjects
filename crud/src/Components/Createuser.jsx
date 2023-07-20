import CrudNav from "./CrudNav"
import crud from "./crudnav.module.css"


const CreateUser=()=>{
    return(
        <div id={crud.myform}>
            <form action="">
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
                <button>Submit</button>

            </form>
        </div>
    )
}
export default CreateUser