import Count from "./Count"
import Button from "./Button"
import { useCallback, useState } from "react"

const Main=()=>{
    let [age,setAge] = useState(25)
    let [salary,setSalary] = useState(25000)

    let increAge=useCallback(()=>{
        setAge(age+1)
    },[age])

    let increSalary=useCallback(()=>{
        setSalary(salary+5000)
    },[salary])
    return(
        <div>
            <Count data={age}>Age</Count>
            <Button Func={increAge}>IncreAge</Button>
            <Count data={salary}>Salary</Count>
            <Button Func={increSalary}>IncreSalary</Button>
        </div>
    )
}
export default Main

