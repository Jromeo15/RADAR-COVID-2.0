import logo from './logo.svg';
import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Registro from "./Registro";
import MenuPrincipalMinisterio from "./MenuPrincipal";

function AlertaMinisterio() {
    return (

        <div className="AlertaMinisterio">
            <div className="fondo">
                <head>
                    <title>Radar Covid</title>
                </head>

                <body>
                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Validar un reporte</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="registro">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <Link to="/MenuPrincipal"><button class="botonM">Menu principal</button></Link>
                        <p className="spacer"></p>
                        <div className="cuadro">
                            <p>¿Qué desea realizar con el reporte? </p>
                            <p className="spacer"></p>
                            <span className="cuadrov"><Link to="/MenuPrincipalMinisterio">VALIDAR</Link></span>  <span className="cuadror"><Link to="/ValidarReporte">DESCARTAR</Link></span>
                            <p className="spacer"></p>
                        </div>
                        <p className="spacer"></p>

                    </div>
                </div>

                </body>
            </div>
        </div>
    );
}

export default AlertaMinisterio;
