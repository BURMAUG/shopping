import {useState} from "react";
import {toast, ToastContainer} from "react-toastify";

const AddTextbookItem = () =>{
    const [textbookData, setTextbookData] = useState({
        title: '',
        authorName: '',
        price: 0
    })
    const handleAddTxtPost = () => {
        fetch('http://localhost:8081/api/v1/books/textbook',{
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(textbookData)
        }).then(res => {
            if (res.ok) toast.success('Textbook Add!', {
                icon: '👏',
                style: {
                    borderRadius: '10px',
                    background: '#333',
                    color: '#fff',
                },
            })
        })
            .catch(err => {
                toast.error("bad things happened")
                console.error(err)
            })
    };
    const handleChange = (e) => {
        setTextbookData({...textbookData, [e.target.name]: e.target.value})
    };
    return(
        <div className="txtbk-cnt txt">
            <button onClick={handleAddTxtPost}>Add a new textbook</button>
            <ToastContainer autoClose={1200}/>
            <form>
                <input type='text' placeholder='Title' name='title' value={textbookData.title} onChange={handleChange} />
                <input type='text' placeholder='Author Name' name='authorName' value={textbookData.authorName} onChange={handleChange}/>
                <input type='text' placeholder='Price' name='price' required onClick={handleChange}/>
            </form>
        </div>
    )
}
export default AddTextbookItem;