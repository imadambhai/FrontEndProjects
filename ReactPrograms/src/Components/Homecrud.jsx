import React from "react"
import { Link } from "react-router-dom"
import style from "./crud.module.css"

const Homecrud = () => {
    return (
        <section id={style.nav}>
            <Link to="/">CREATE-USERS</Link>
            <Link to="/user">USERS</Link>
        </section>
    )
}
export default Homecrud