import { Link } from "react-router-dom"
import CreateUser from "./Createuser"
import crud from "./crudnav.module.css"


const CrudNav=()=>{
    return(
        <section id={crud.Nav}>
            <article>
                <Link to="/">Create user</Link>
                <Link to="/users">Users Details</Link>
            </article>
        </section>
    )
}
export default CrudNav