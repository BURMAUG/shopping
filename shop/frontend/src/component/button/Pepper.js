import {useEffect, useState} from "react";

const API = 'http://localhost:8081/api/v1/fruit/pepper';
function Pepper(){
    const [pepper, setPepper] = useState([]);

    function fetchData(){
        fetch(API, {
            method: "GET",
            headers: {"Content-Type" : "application/json"}
        }).then(res => res.json())
            .then(data => {
                console.log(data);
                setPepper(data);
            })
            .catch(console.error);
    }

    return (
        <>
            <div className="row">
                {
                    pepper.map((data, index) => (
                        <div className="pepper-content" key={index}>
                            <h2 className="header">{data.type}</h2>
                            <div>
                                <p>Price: ${data.price}</p>
                                <p>Weight: {data.weight}lbs</p>
                                <p>Type: {data.type}</p>
                                <p>Description: {data.description}</p>
                                <div className="btn">
                                    <button className="btn-update">Update</button>
                                    <button className="btn-delete">Delete</button>
                                </div>
                            </div>

                        </div>
                    ))
                }
            </div>
        </>
    )
}
export default Pepper;