import '../../App.css';
import {
    BrowserRouter as Router,
    Route,
    Link
}
    from "react-router-dom";

var Doc;
var Pass;

function Iniciosesion() {
    function dni(e){
        Doc= e.target.value;
    }
    function pass(i){
        Pass=i.target.value;
    }
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
            <fieldset>
                <div className="registro">
                    <div className="insertar">
                        <p className="spacer"></p>
                        <p>DNI <input type={"text"} onChange={dni}></input></p>
                        <p className={"margen1"}>Contraseña <input type onChange={pass}></input></p>

                            <button className="boton" onClick={login}>INICIAR SESIÓN</button>

                        <p className="spacer"></p>


                        <p>--------------------------------------------------------------------------------------------------------------</p>
                        <p className="spacer"></p>
                        <p>¿No tienes cuenta? <Link to ="./Registro">Regístrate</Link></p>

                    </div>
                </div>
            </fieldset>
        </div>
    );
}
function login(){
    var DNI=Doc;
    var Password=Pass;
    if (DNI=="12345678A" && Password=="123") {
        window.open("/MenuPrincipal", "_self")
    }
    if(DNI=="87654321B" && Password=="321") {
        window.open("/MenuPrincipalMinisterio", "_self")
    }
}

export default Iniciosesion;

