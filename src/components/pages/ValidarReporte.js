
import '../../App.css';
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
            <meta charSet="utf-8"></meta>

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
                <nav className="menuCSS3">
                    <ul>
                        <li><Link to="/">Inicio</Link></li>
                        <li><Link to="/MenuPrincipalMinisterio">Menú Principal</Link></li>
                    </ul>
                </nav>
                <div className="reporte">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <p>Haga click en un reporte para verlo. Posteriormente podrá validarlo o descartarlo.</p>
                        <ul>
                            <Link to="/AlertaMinisterio"><button className="boton">Reporte 1</button></Link>
                            <p className="spacer"></p>
                            <Link to="/AlertaMinisterio"><button className="boton">Reporte 2</button></Link>
                            <p className="spacer"></p>
                            <Link to="/AlertaMinisterio"><button className="boton">Reporte 3</button></Link>

                        </ul>

                        <p className="spacer"></p>


                    </div>
                </div>
            </div>
        </div>
    );
}
export default ValidarReporte;