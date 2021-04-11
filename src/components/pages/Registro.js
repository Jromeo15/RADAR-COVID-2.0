import '../../App.css';
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


                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Registro</h2></div>
                    <p className="spacer"></p>

                </div>
                <div className="registro">
                    <div className="insertar">
                        <fieldset>
                            <div className={"fieldfondo"}>
                        <p></p>
                        <p>Introduce tu DNI <input type placeholder="Introduzca su DNI"></input></p>
                        <p className={"margen2"}>Crea tu contraseña <input type placeholder="Introduzca una contraseña"></input></p>
                        <p className={"margen3"}>Repite tu contraseña <input type placeholder="Reintroduzca su contraseña"></input></p>
                        <p className={"margen4"}>*Correo electrónico <input type placeholder="Introduzca su email"></input></p>
                        <p></p>

                        <p>He <Link to="./TyC">leido</Link> y acepto los términos y condiciones de servicio <input type="checkbox"></input></p>
                        <Link to="/MenuPrincipal">
                            <button className="boton">REGISTRARME</button>
                        </Link>
                        <p></p>
                        <p>
                            <div className="asterisco">*Escriba su correo solo si quiere recibir información y avisos en
                                su email.
                            </div>
                        </p>
                            </div>
                        </fieldset>
                    </div>
                </div>

            </div>
        </div>
    );
}

export default Registro;
