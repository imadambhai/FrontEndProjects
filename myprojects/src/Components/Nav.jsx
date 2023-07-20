import style from "./nav.module.css"
import Logo from "./Logo"
import Menu from "./Menu"
import Button from "./Button"


const Nav=()=>{
   return(
       <div id={style.navbar}>
        <article>
            <div className={style.Logo}><Logo/></div>
            <div className={style.Menu}><Menu/></div>
            <div className={style.Button}><Button/></div>
        </article>
        <img src="" alt="" />
        
           
       </div>

   )
}
export default Nav