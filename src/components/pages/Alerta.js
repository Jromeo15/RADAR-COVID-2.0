
import '../../App.css';
import {
  BrowserRouter as Router,
  Route,
  Link
}
from "react-router-dom";
import Registro from "./Registro";
import MenuPrincipal from "./MenuPrincipal";

function Alerta() {
  return (


    <div className="Alerta">
        <div className="fondo">
<head>
	
	<title>Radar Covid</title>


</head>


	
	
   
		<div className="title">
			<div className="titulo"><h1>Radar COVID</h1></div>
			<p className="spacer"></p>
			<div className="titulillo"><h2>Enviar un reporte</h2></div>
			<p className="spacer"></p>
			
		</div>
		<div className="registro">
			<div className="insertar">
				<p className="spacer"></p>
				<Link to="/MenuPrincipal"><button class="botonM">Menu principal</button></Link>
				<p className="spacer"></p>
				<div className="cuadro">
				<p>Atención, está a punto de enviar un informe al Ministerio de Sanidad. Sus datos serán enviados al servidor. ¿Está seguro de que desea continuar? </p>
				<p className="spacer"></p>
				<span className="cuadrov"><Link to="/MenuPrincipal">SÍ</Link></span>  <span className="cuadror"><Link to="/Reporte">NO</Link></span>
				<p className="spacer"></p>
				</div>
				<p className="spacer"></p>
			
			</div>
		</div>


</div>
    </div>
  );
}

export default Alerta;
