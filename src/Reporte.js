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
                        <textarea name="Resumen" rows="4" cols="100"></textarea>
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
