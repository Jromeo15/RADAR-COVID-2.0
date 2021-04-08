import logo from './logo.svg';
import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Registro from "./Registro";

function Iniciosesion() {
    return (


        <div className="Iniciosesion">

            <div className="fondo">
                <head>

                    <title>Radar Covid</title>

                </head>

                <body>

                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className=titulillo><h2>Menú pricipal</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="registro">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <a href="notificaciones.html">
                            <button className="boton">NOTIFICACIONES</button>
                        </a>
                        <p className="spacer"></p>
                        <a href="enviarUnReporte.html">
                            <button className="boton">ENVIAR UN REPORTE</button>
                        </a>
                        <p className="spacer"></p>
                        <a href="iniciosesion.html">
                            <button className="boton">INICIO</button>
                        </a>

                    </div>
                </div>
                </body>
            </div>
        </div>
    );
}

export default Iniciosesion;
