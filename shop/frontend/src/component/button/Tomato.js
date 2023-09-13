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
        <div className="cnt">
            <button onClick={fetchData}>Tomato Only</button>
           <div className="row">
               {
                   data.map((food) =>(
                       <div className="tomato-cnt" key={food.tomatoID}>
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
        </div>
    );
}
export default Tomato;