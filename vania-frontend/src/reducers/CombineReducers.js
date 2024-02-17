import { combineReducers } from 'redux'
import {menuCategoryReducer} from "./MenuCategoryReducer";
import {menuReducer} from "./MenuReducer";


export const reducers = combineReducers({
    menuCategoryReducer,
    menuReducer,
});