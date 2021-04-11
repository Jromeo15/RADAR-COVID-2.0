import logo from './logo.svg';
import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import MenuPrincipalMinisterio from "./MenuPrincipalMinisterio";

function ValidarReporte() {
    return (
        <div className="MenuPrincipalMinisterio">
            <div className="fondo">
                <div className="titulo"><h1>Radar COVID</h1></div>
                <p className="spacer"></p>
                <div className="titulillo"><h2>Menú pricipal</h2></div>
                <p className="spacer"></p>
            </div>
        </div>
    );
}

export default ValidarReporte;