import CrudNav from "./Components/CrudNav"
import React from "react"
import CreateUser from "./Components/Createuser"
import {BrowserRouter,Routes,Route} from "react-router-dom"
import Users from "./Components/Users"
import EditUsers from "./Components/EditUsers"

const App=()=>{
   
    return(
        <div>
        <BrowserRouter>
            <CrudNav></CrudNav>
                <Routes>
                    <Route element={<CreateUser/>} path="/"/>
                    <Route element={<Users/>} path="/users"/>
                    <Route element={<EditUsers/>} path="/users"/>
                
                </Routes>

        </BrowserRouter>
             
        </div>
    )
}
export default App