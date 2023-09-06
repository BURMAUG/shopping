import {useEffect, useState} from "react";
import FilterBy from "./nav/FilterBy";

const API = "http://localhost:8081/"
function Home(){
    const [item, setItem] = useState([]);

    useEffect(() => {
        fetch(API, {
            method: "GET",
            headers: {"Content-Type" : "application/json"},
        }).then(res => res.json())
            .then(data => {
                console.log(data)
                setItem(data)
            })
            .catch(console.error)

    }, []);

    const pepper = (type) => {
        return (
                <div className="pepper-content" key={type.pepperID}>
                    <div className="tomato-view">
                        <img src="../../public/AdobeStock_604610658_Preview.png"  alt="bell pepper"/>
                    </div>
                    <h2>{type.type}</h2>
                    <div>
                        <p>Price: ${type.price}</p>
                        <p>Weight: {type.weight}lbs</p>
                        <p>Type {type.type}</p>
                        <p>Description: {type.description}</p>
                        <div className="btn">
                            <button className="btn-update">Update</button>
                            <button className="btn-delete">Delete</button>
                        </div>
                    </div>
                </div>
            );
    };
    const notebook = (type) => {
        return(
            <div key={type.noteBookID}>
                <h2>{type.type}</h2>
                <div>
                    <p>Page Count: {type.pageCount}</p>
                    <p>Price: ${type.noteBookPrice}</p>
                    <p>Type: {type.type}</p>
                    <div className="btn">
                        <button className="btn-update">Update</button>
                        <button className="btn-delete">Delete</button>
                    </div>
                </div>
            </div>
        )
    };
    const textbook = (type) => {};
    const tomato = (type) => {};
    const strawberry = (type) => {};

    return (
        <>
            <FilterBy/>
            <div className="all-content">
                    {
                        // eslint-disable-next-line array-callback-return
                        item.map((data) => {
                            if(data.type.toLowerCase() === "pepper")
                                return pepper(data)
                            else if(data.type.toLowerCase() === "notebook")
                                return notebook(data)
                            else
                            return (<></>)
                        })
                    }
            </div>
        </>
    );
}
export default Home;