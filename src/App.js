import logo from './logo.svg';
import React from "react";
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
}
from "react-router-dom";
import Registro from "./Registro";
import MenuPrincipal from "./MenuPrincipal";
import Alerta from "./Alerta";
import Iniciosesion from "./Iniciosesion";
import TyC from "./TyC";
import Reporte from './Reporte';
import Notificaciones from "./Notificaciones";
import MenuPrincipalMinisterio from "./MenuPrincipalMinisterio";
import ValidarReporte from "./ValidarReporte";
import AlertaMinisterio from "./AlertaMinisterio";

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
