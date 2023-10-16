import {useEffect, useState} from "react";

const Bread = () =>{
    const [bread, setBread] = useState([])

    function fetchData(){
        fetch("http://localhost:8081/api/v2/bread/",{
            method: 'GET',
            mode: 'cors',
            headers: {'Content-Type': 'application/json'}
        }).then(res => res.json())
            .then(resData => setBread(resData))
            .catch(err => console.log(err))
    }

    useEffect(() => {
        fetchData();
    }, []);

    return(
        <div className='bread-cnt'>
            {
                bread.map((item, index) =>
                    <div key={index}>
                        <p>bread id: {item.breadID}</p>
                        <p>brand: {item.brand}</p>
                        <p>sliced: {item.isSliced}</p>
                    </div>
                )
            }
        </div>
    )
}
export default Bread;