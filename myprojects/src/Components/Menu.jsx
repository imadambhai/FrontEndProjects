import style from "./nav.module.css"
import {link} from "react-router-dom"
const Menu=()=>{
    return(
        <div id={style.MenuBlock}>
            <ol>
                <li><link href="">Explore Work</link></li>
                <li><link href="">Hire Talents</link></li>
                <li><link href="">Dev board</link></li>
                <li><link href="">Challenges</link></li>
            </ol>
           
        </div>
    )
}
export default Menu