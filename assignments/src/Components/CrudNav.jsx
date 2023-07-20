import CreateUsers from "./CreateUsers"
import crud from "./crudnav.module.css"


const CrudNav=()=>{
    return(
        <section id={crud.Nav}>
            <article>
                <a href="">Create User</a>
                <a href="">Users Details</a>
            </article>
        </section>
    )
}
export default CrudNav