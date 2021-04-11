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


        <div className="ValidarReporte">

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
                <div className="reporte">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <ul>
                            <Link to="/AlertaMinisterio"><button className="boton">Reporte 1</button></Link>
                            <p className="spacer"></p>
                            <Link to="/AlertaMinisterio"><button className="boton">Reporte 2</button></Link>
                            <p className="spacer"></p>
                            <Link to="/AlertaMinisterio"><button className="boton">Reporte 3</button></Link>

                        </ul>

                        <p className="spacer"></p>

                        <Link to="./MenuPrincipalMinisterio">
                            <button className="boton">Volver al Menu Principal</button>
                        </Link>
                    </div>
                </div>
                </body>
            </div>
        </div>
    );
}
export default ValidarReporte;