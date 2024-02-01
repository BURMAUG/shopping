const FETCH_DRINK_API = 'http://localhost:8081/api/v2/drink/';

export const fetchDrinksData = () =>
    fetch(FETCH_DRINK_API, {
        method: 'GET',
        mode: 'cors',
        headers: {'Content-Type' : 'application/json'}
    });

export const addADrink = drink =>
    fetch(FETCH_DRINK_API+`${drink}`, {
        method: 'POST',
        mode: 'cors',
        headers: {'Content-Type': 'application/json'}
    });