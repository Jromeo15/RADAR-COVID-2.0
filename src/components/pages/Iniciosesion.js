
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
        <div className="registro">
          <div className="insertar">
            <p className="spacer"></p>
            <p>DNI <input type={"text"}></input></p>
            <p>Contraseña <input type></input></p>
            <Link to ="./MenuPrincipal">
              <button className="boton">INICIAR SESIÓN</button>
            </Link>
            <p>--------------------------------------------------------------------------------------------------------------</p>
            <p className="spacer"></p>
            <p>¿No tienes cuenta? <Link to ="./Registro">Regístrate</Link></p>

          </div>
        </div>
      </header>
    </div>
  );
}

export default Iniciosesion;
