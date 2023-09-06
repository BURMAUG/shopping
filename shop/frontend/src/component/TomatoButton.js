import {useEffect, useState} from "react";

const TOMATO = 'http://localhost:8081/api/v1/fruit/tomatoes';
const Tomato = () => {
    const [data, setData] = useState([]);
    function fetchData(){
        fetch(TOMATO, {
            method: "GET",
            headers: {"Content-Type": "application/json"}
        }).then(res => res.json())
            .then(item => {
                console.log(item);
                setData(item);
            })
            .catch(console.error);
    }

    useEffect(() =>{
       fetchData();
    }, [])
    return(
        <>
            <button onClick={fetchData}>Tomato Only</button>
           <div>
               {
                   data.map((food) =>(
                       <div key={food.tomatoID}>
                           <h2 className="">{food.type}</h2>
                           <div className="content">
                               <p>Amount: {food.itemCount}lbs</p>
                               <p>Price: ${food.price}</p>
                               <p>Description: {food.description}</p>
                               <p>Type: {food.type}</p>
                           </div>
                       </div>
                   ))
               }
           </div>
        </>
    );
}
export default Tomato;