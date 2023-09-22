import {BrowserRouter, Link, Route, Routes} from "react-router-dom";
import Pepper from "../button/Pepper";
import Home from "../home";

function Nav(){
    return(
        <BrowserRouter>
            <Link to='/'>Home</Link>{' '}
            <Link to='/pepper'>Pepper</Link>{' '}
            <Link to='/book'>Books</Link>{' '}
            <Link to='/tomato'>Tomato</Link>{' '}
            <Link to='/strawberry'>Strawberry</Link>{' '}
            <Routes>
                <Route index path='/' Component={Home}/>
                <Route path='/pepper' Component={Pepper}/>
            </Routes>
        </BrowserRouter>
    )
}
export default Nav;