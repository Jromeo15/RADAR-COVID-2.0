
import '../../App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Iniciosesion from "./Iniciosesion";


function MenuPrincipal() {
    return (
        <div className="MenuPrincipal">
            <div className="fondo">
                <head>

                    <title>Radar Covid</title>

                </head>

                <body>

                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Menú pricipal</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="registro">
                    <div className="insertar">
                        <p className="spacer"></p>
                    <Link to="./Notificaciones"><button className="boton">NOTIFICACIONES</button></Link>
                    <p className="spacer"></p>
                    <Link to="./Reporte"><button className="boton">ENVIAR UN REPORTE</button></Link>
                    <p className="spacer"></p>
                        <Link to="/"><button className="boton">INICIO</button></Link>
                    </div>

                </div>
                </body>
            </div>
        </div>
);
}

export default MenuPrincipal;