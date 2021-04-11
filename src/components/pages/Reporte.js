
import '../../App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Registro from "./Registro";
import Alerta from "./Alerta";

function Reporte() {
    return (


        <div className="Reporte">

            <div className="fondo">
                <head>

                    <title>Radar Covid</title>


                </head>

                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Reporte</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="reporte">
                    <nav className="menuCSS3">
                        <ul>
                            <li><Link to="/">Inicio</Link></li>
                            <li><Link to="/MenuPrincipal">Menú Principal</Link></li>
                            <li><Link to="/Notificaciones">Notificaciones</Link></li>
                        </ul>
                    </nav>

                    <div className="insertar">
                        <p></p>
                        <p>Escriba aquí cualquier información que quiera aportar al reporte.</p>
                        <p></p>
                        <p className="spacer"></p>
                        <textarea name="Resumen" rows="5" cols="150"></textarea>
                        <p className="spacer"></p>
                        <p className="spacer"></p>
                        <Link to="/Alerta">
                            <button className="boton">ENVIAR</button>
                        </Link>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Reporte;
