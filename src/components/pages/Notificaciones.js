
import '../../App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Iniciosesion from "./Iniciosesion";


function Notificaciones() {
    return (
        <div className="Notificaciones">

                <div className="fondo">
                    <head>

                    <title>Radar Covid</title>

                    </head>

                    <div className="title">
                    <div class="titulo"><h1>Radar COVID</h1></div>
                <p class="spacer"></p>
                    <div class="titulillo"><h2>Notificaciones</h2></div>
                <p class="spacer"></p>

                    </div>
                    <nav className="menuCSS3">
                        <ul>
                            <li><Link to="/">Inicio</Link></li>
                            <li><Link to="/MenuPrincipal">Menú Principal</Link></li>
                            <li><Link to="/Reporte">Reporte</Link></li>
                        </ul>
                    </nav>
                    <div className="registro">
                        <div class="insertar">
                        <p class="spacer"></p>
                        <p>Bandeja de entrada de notificaciones sobre contactos con positivos:</p>
                    <div class="cuadronotf">
                        <p className="notf">-Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                        <p className="notf">-Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                        <p className="notf">-Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                    </div>
                    <p></p>
                    </div>
                    </div>
                </div>

        </div>
);
}

export default Notificaciones;