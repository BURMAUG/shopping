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

    const handleDelete = (id, type) => {
        return fetch(API + `api/v1/fruit/${type}/${id}`,{
            method: 'DELETE',
            mode: 'cors',
            headers: {"Content-Type" : "application/json"}
        }).then(res => res.json())
            .then(data => setItem(data))
            .catch(console.error)
    };
    const pepper = (type) => {
        return (
                <div className="pepper-content" key={type.pepperID}>
                    <div className="pepper-view">
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
                            <button className="btn-delete" onClick={() => handleDelete(type.pepperID, type.type.toLowerCase()) }>Delete</button>
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
    const textbook = (type) => {
        return (
            <div key={type.textbookID}>

            </div>
        );
    };
    const tomato = (type) => {
        return (
            <div className="tomato-content">
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
                        <button className="btn-delete" onClick={() => handleDelete(type.pepperID, type.type.toLowerCase()) }>Delete</button>
                    </div>
                </div>
            </div>
        )
    };
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
                            else if(data.type.toLowerCase() === "tomato")
                                return tomato(data)
                            else if(data.type.toLowerCase() === "strawberry")
                                return strawberry(data)
                            else
                                return textbook(data)
                        })
                    }
            </div>
        </>
    );
}
export default Home;