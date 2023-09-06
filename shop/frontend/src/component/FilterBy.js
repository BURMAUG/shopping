// the is going to make certain URL requests
// const TOMATO = '';
// const NOTEBOOK = '';
// const TEXTBOOK = '';
// const STRAWBERRY = '';
// const PEPPER = '';
import Tomato from "./TomatoButton";
import PepperButton from "./PepperButton";

const FilterBy = () =>{
    return (
        <div>
            <h5>
                Filter By: <Tomato/> <PepperButton/>
            </h5>
        </div>
    );
}
export default FilterBy;