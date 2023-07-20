import { Component } from "react";

class Stateclass extends Component{
    constructor(){
        super()
        this.state={
            data:"Gokul"
        }
    }
    changeData=()=>{
        this.setState({
            data:"Adam"
        })
    }
    render(){
        return(
            <div>
                <h1>{this.state.data}</h1>
                <button onClick={this.changeData}>Change</button>
            </div>
        )
    }
}
export default Stateclass