import './App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import MenuPrincipal from "./MenuPrincipal";
import TyC from "./TyC";

function Registro() {
    return (
        <div className="Registro">

            <div className="fondo">
                <head>

                    <title>Radar Covid</title>

                </head>

                <body>
                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Registro</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="registro">
                    <div className="insertar">
                        <p>Introduce tu DNI <input type></input></p>
                        <p>Crea tu contraseña <input type></input></p>
                        <p>repite tu contraseña <input type></input></p>
                        <p>*Correo electrónico <input type></input></p>
                        <p></p>
                        <p></p>
                        <p>He <Link to="./TyC">leido</Link> y acepto los términos y condiciones de servicio <input type="checkbox"></input></p>
                        <Link to="./MenuPrincipal">
                            <button className="boton">REGISTRARME</button>
                        </Link>
                        <p></p>
                        <p>
                            <div className="asterisco">*Escriba su correo solo si quiere recibir información y avisos en
                                su email
                            </div>
                        </p>
                    </div>
                </div>
                </body>
            </div>
        </div>
    );
}

export default Registro;
