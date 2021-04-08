import logo from './logo.svg';
import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Registro from "./Registro";

function Reporte() {
    return (


        <div className="Reporte">

            <div className="fondo">
                <head>

                    <title>Radar Covid</title>


                </head>

                <body>


                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Reporte</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="reporte">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                            labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco
                            laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in
                            voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
                            cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        <p className="spacer"></p>
                        <Link to="./MenuPrincipal">
                            <button className="boton">Volver al Menu Principal</button>
                        </Link>

                    </div>
                </div>
                </body>
            </div>
        </div>
    );
}

export default Reporte;
