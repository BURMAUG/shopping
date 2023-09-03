import {useEffect, useState} from "react";

const API = "http://localhost:8081/"
function Home(){
    const [item, setItem] = useState([]);
    useEffect(() => {
        fetch(API, {
            method: "GET",
            headers: {"Content-Type" : "application/json"},
            // body: JSON.stringify(API)
        }).then(res => res.json())
            .then(data => {
                console.log(data)
                setItem(data)
            })
            .catch(console.error)

    }, []);

    return (
        <></>
    );
}
export default Home;