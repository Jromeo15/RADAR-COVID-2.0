
import '../../App.css';
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

                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Validar un reporte</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="registro">
                    <div className="insertar">
                        <nav className="menuCSS3">
                            <ul>
                                <li><Link to="/">Inicio</Link></li>
                                <li><Link to="/MenuPrincipalMinisterio">Menú Principal</Link></li>
                            </ul>
                        </nav>
                        <p></p>
                        <div className="cuadro">
                            <p className={"negro"}>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt
                                ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation
                                ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
                                reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur
                                sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id
                                est laborum.</p>
                        </div>
                        <p className="spacer"></p>
                        <div className="cuadro">
                            <p className={"negro"}>¿Qué desea realizar con el reporte? </p>
                            <p className="spacer"></p>
                            <span className="cuadrov"><Link to="/ValidarReporte">VALIDAR</Link></span>  <span className="cuadror"><Link to="/ValidarReporte">DESCARTAR</Link></span>
                            <p className="spacer"></p>
                        </div>
                        <p className="spacer"></p>

                    </div>
                </div>


            </div>
        </div>
    );
}

export default AlertaMinisterio;
