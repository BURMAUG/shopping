import {useState} from "react";

const API = 'http://localhost:8081/api/v1/fruit';
const Strawberry = () => {
    const [strawberry, setStrawberry] = useState([]);

    return (
        <div className="fruit-content content">

        </div>
    );
}
export default Strawberry;