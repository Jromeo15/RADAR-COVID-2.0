import logo from './logo.svg';
import './App.css';
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


    <div className="Alerta">

      <div id=fondo>
        <head>
          
          <title>Radar Covid</title>
          <meta charset="UTF-8">
          <!-- Enlace a la hoja de estilos que da un formato básico de la página -->
          <link rel="stylesheet" type="text/css" href="boceto.css">

        </head>

        <body>
        
        
        
          <div id=title>
            <div class=titulo><h1>Radar COVID</h1></div>
            <p class="spacer"></p>
            <div class=titulillo><h2>Enviar un reporte</h2></div>
            <p class="spacer"></p>
            
          </div>
          <div id=registro>
            <div class=insertar>
              <p class="spacer"></p>
              <a href="menuPrincipal.html"><button class="botonM">Menu principal</button></a>
              <p class="spacer"></p>
              <div class=cuadro>
              <p>Atención, está a punto de enviar un informe al Ministerio de Sanidad. Sus datos serán enviados al servidor. ¿Está seguro de que desea continuar? </p>
              <p class="spacer"></p>
              <span class=cuadrov><a href="menuPrincipal.html">SÍ</a></span>  <span class=cuadror><a href="enviarUnReporte.html">NO</a></span>
              <p class="spacer"></p>
              </div>
              <p class="spacer"></p>
            
            </div>
          </div>

        </body>
      </div>  
    </div>      

     
  );
}

export default Iniciosesion;
