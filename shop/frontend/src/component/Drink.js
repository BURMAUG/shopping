import {useEffect, useState} from "react";

const Drink = () =>{
    const [item, setItem] = useState([])
    function fetchDrink(){
        fetch("http://localhost:8081/api/v2/drink/",{
            method: "GET",
            headers: {"Content-Type": "application/json"}
        }).then(res => res.json())
            .then(resData =>{
                console.log(resData);
                setItem(resData);
            })
            .catch(console.error);
    }

    useEffect(() => {
        fetchDrink();
    }, []);
    return(
        <div className="drinks">
            {
                item.map((data, index) =>
                    <div key={index}>
                        <h1>Brand: {data.brand}</h1>
                        <p>manufacturer: {data.manufacturer}</p>
                        <p>Price: ${data.price}</p>
                    </div>
                )
            }
        </div>
    )
}
export default Drink;