import {useEffect, useState} from "react";
import {fetchDrinksData} from "../client";

const Drink = () =>{
    const [item, setItem] = useState([])
    function fetchDrink(){
      fetchDrinksData()
          .then(res => res.json())
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
                        <button className="btn btn-primary"> Delete</button>
                        <button className="btn btn-primary"> Update</button>
                    </div>
                )
            }
        </div>
    )
}
export default Drink;