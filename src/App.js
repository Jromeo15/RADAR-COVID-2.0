import React from "react";
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
}
from "react-router-dom";
import Registro from "./components/pages/Registro";
import MenuPrincipal from "./components/pages/MenuPrincipal";
import Alerta from "./components/pages/Alerta";
import Iniciosesion from "./components/pages/Iniciosesion";
import TyC from "./components/pages/TyC";
import Reporte from './components/pages/Reporte';
import Notificaciones from "./components/pages/Notificaciones";
import MenuPrincipalMinisterio from "./components/pages/MenuPrincipalMinisterio";
import ValidarReporte from './components/pages/ValidarReporte';
import AlertaMinisterio from "./components/pages/AlertaMinisterio";

function App() {
  return (
      <Router>

          <Switch>

            <Route path="/" exact component={Iniciosesion} />
            <Route path="/Registro" component={Registro} />
            <Route path="/MenuPrincipal" component={MenuPrincipal} />
            <Route path="/Alerta" component={Alerta} />
            <Route path="/Notificaciones" component={Notificaciones} />
            <Route path="/Reporte" component={Reporte} />
            <Route path="/TyC" component={TyC} />
            <Route path="/MenuPrincipalMinisterio" component={MenuPrincipalMinisterio} />
            <Route path="/ValidarReporte" component={ValidarReporte} />
            <Route path="/AlertaMinisterio" component={AlertaMinisterio} />

          </Switch>

      </Router>




  );
}

export default App;
