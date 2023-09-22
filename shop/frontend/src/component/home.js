import {useEffect, useState} from "react";
import 'react-toastify/dist/ReactToastify.css';
import Pepper from "./button/Pepper";
import Notebook from "./button/Notebook";
import Tomato from "./button/Tomato";
import Strawberry from "./button/Strawberry";

const API = "http://localhost:8081/"
function Home(){
    const [item, setItem] = useState([]);

    const fetcher = ()=> {
        fetch(API, {
            method: "GET",
            mode: 'cors',
            headers: {"Content-Type": "application/json"},
        }).then(res => res.json())
            .then(data => {
                console.log(data)
                setItem(data)
            })
            .catch(console.error)
    }

    useEffect(() => {
        fetcher();
    }, []);

    return (
        <>
            <div className="all-content">
                    {
                        item.map((data, index) => {
                            if(data.type.toLowerCase() === "pepper")
                                return <Pepper/>
                            else if(data.type.toLowerCase() === "notebook")
                                 return <Notebook />
                            else if(data.type.toLowerCase() === "tomato")
                               return <Tomato />
                            else if(data.type.toLowerCase() === "strawberry")
                                return <Strawberry />
                            else
                               return <Tomato/>
                        })
                    }
            </div>
        </>
    );
}
export default Home;
