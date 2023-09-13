import {useEffect, useState} from "react";
import {ToastContainer,toast} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import FilterBy from "./nav/FilterBy";

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

    const handleDelete = (id, type) => {
        if (window.confirm("Are you sure you wanna delete this item?")){
            return fetch(API + `api/v1/fruit/${type}/${id}`,{
                method: 'DELETE',
                mode: 'cors',
                headers: {"Content-Type" : "application/json"}
            }).then((res) =>{
                if (res.ok)
                    toast.success(`Successfully Deleted  ${type}`,{
                    position: toast.POSITION.TOP_CENTER});
                fetcher();
            })
                .catch(console.error)
        }
    }

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
                        <ToastContainer autoClose={1500}/>
                    </div>
                </div>
            );
    };
    const notebook = (type) => {
        return(
            <div className="notebook-content">
                <div key={type.noteBookID}>
                    <h2>{type.type}</h2>
                    <div>
                        <p>Page Count: {type.pageCount}</p>
                        <p>Price: ${type.noteBookPrice}</p>
                        <p>Type: {type.type}</p>
                        <div className="btn">
                            <button className="btn-update" >Update</button>
                            <button className="btn-delete" onClick={() => handleDelete(type.type.toLowerCase(), type.notebookId)}>Delete</button>
                        </div>
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