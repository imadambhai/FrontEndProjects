import Nav from "./Components/Nav"
import { BrowserRouter,Routes,Route } from "react-router-dom"
import Hire from "./Components/Hire"
import Dev from "./Components/Dev"
import Explore from "./Components/Explore"
import Challenge from "./Components/Challenge"

const App=()=>{
   return(
    <div>
        <BrowserRouter>
        <Nav/>
        <Routes>
            <Route element={<Hire/>} path="/a"></Route>
            <Route element={<Explore/>} path="/b"></Route>
            <Route element={<Dev/>} path="/c"></Route>
            <Route element={<Challenge/>} path="/c"></Route>
        </Routes>
        </BrowserRouter>

    </div>
   )
}
export default App