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
import Iniciosesion from "./Iniciosesion";

function App() {
  return (
      <Router>

          <Switch>

            <Route path="/" exact component={Iniciosesion} />
            <Route path="/Registro" component={Registro} />
            <Route path="/MenuPrincipal" component={MenuPrincipal} />
            <Route path="/Notificaciones" component={Notificaciones} />


          </Switch>

      </Router>




  );
}

export default App;
