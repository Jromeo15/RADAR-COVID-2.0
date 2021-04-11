import Ministerio from '../../images/Ministerio.png'
import '../../App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";
import Iniciosesion from "./Iniciosesion";


function MenuPrincipalMinisterio() {
    return (
        <div className="MenuPrincipalMinisterio">
            <div className="fondo">


                <header className="App-header">

                <div className="title">
                    <div className="titulo"><h1>Radar COVID</h1></div>
                    <p className="spacer"></p>
                    <div className="titulillo"><h2>Menú pricipal</h2></div>
                    <p className="spacer"></p>

                </div>
                </header>

                <p></p>
                <img src ={Ministerio} alt={"Logo"} className={"ministerio"}/>

                <p></p>
                <div className="registro">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <Link to="./ValidarReporte"><button className="boton">VALIDAR REPORTE</button></Link>
                        <p className="spacer"></p>
                        <Link to="/"><button className="boton">INICIO</button></Link>
                    </div>

                </div>

            </div>
        </div>
    );
}

export default MenuPrincipalMinisterio;