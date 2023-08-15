import axios from "axios";

export default {
    getFoodByName(searchName)
    {
        const food = "?foodByName=" + searchName;
       const url = `meals/food/foodByName/${food}`;
       return axios.get(url)
    },

    superSearch(searchName){
        const search = "?foodByName=" + searchName;
        const url = `meals/food/supersearch/${search}`;
        return axios.get(url)
    }
}