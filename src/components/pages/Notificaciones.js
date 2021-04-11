
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
                    <div className="registro">
                        <div class="insertar">
                        <p class="spacer"></p>
                        <Link to="/MenuPrincipal"><button class="botonM">Menu principal</button></Link>
                            <p class="spacer"></p>
                        <p>Bandeja de entrada de notificaciones sobre contactos con positivos:</p>
                    <div class="cuadro">
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    </div>
                    </div>
                    </div>
                </div>

        </div>
);
}

export default Notificaciones;