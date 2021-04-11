
import '../../App.css';
import {
  BrowserRouter as Router,
  Route,
  Link
}
from "react-router-dom";
import Registro from "./Registro";
import MenuPrincipal from "./MenuPrincipal";

function Iniciosesion() {
  return (


    <div className="Iniciosesion">

      <header className="App-header">
        <div className="title">
          <div className="titulo"><h1>Radar COVID</h1></div>
          <p className="spacer"></p>
          <div className="titulillo"><h2>Iniciar Sesión</h2></div>
          <p className="spacer"></p>

        </div>
      </header>
        <div className="registro">
          <div className="insertar">
            <fieldset>
              <div className={"fieldfondo"}>
            <p className="spacer"></p>
            <p>DNI <input type={"text"} placeholder="Introduzca su DNI" ></input></p>
            <p className={"margen1"}>Contraseña <input placeholder="Introduzca su contraseña"></input></p>
            <Link to ="./MenuPrincipal">
              <button className="boton">INICIAR SESIÓN</button>
            </Link>
            <p className="spacer"></p>

            <Link to ="./MenuPrincipalMinisterio">
              <button className="boton">INICIAR SESIÓN MINISTERIO</button>
            </Link>
            <p>-----------------------------------------------------------------------------------------------------------------------</p>
            <p className="spacer"></p>
            <p>¿No tienes cuenta? <Link to ="./Registro">Regístrate</Link></p>
              </div>
            </fieldset>
          </div>
        </div>

    </div>
  );
}

export default Iniciosesion;
