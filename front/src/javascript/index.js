$.get("http://localhost:1234/api/productos");



let numeroAleatorio;
let intentosJugador1 = 0;
let intentosJugador2 = 0;
let puntosJugador1 = 0; // Puntos acumulados para el Jugador 1
let puntosJugador2 = 0; // Puntos acumulados para el Jugador 2
let jugadorActual = 1; // 1 para Jugador 1, 2 para Jugador 2
let maxIntentos = 10;
let partidas = 1; // Contador de partidas, comienza en 1

function iniciarJuego() {
    //
    numeroAleatorio = Math.floor(Math.random() * 100) + 1;
    console.log("Número aleatorio generado: " + numeroAleatorio); 

    // Reiniciar los intentos
    intentosJugador1 = 0;
    intentosJugador2 = 0;
    jugadorActual = 1; // Comienza con el Jugador 1
    $("#jugador2").removeClass("activePlayer2");
    $("#jugador1").addClass("activePlayer1");

     // No se reinician los puntos, ya que son acumulables
    actualizarIntentos();
    actualizarIntentos();
    // Limpiar el resultado de la partida anterior
    document.getElementById('resultado').innerHTML = "";  
    // Actualizar la partida
    document.getElementById('partida').value = partidas; 
}

function actualizarIntentos() {
    document.getElementById('intentosJugador1').innerText = intentosJugador1;
    document.getElementById('intentosJugador2').innerText = intentosJugador2;
}
function actualizarPuntos() {
    
}

function actualizarPartida() {
    document.getElementById('numero').value = "";
    if (partidas < 10) {
        partidas++;  
    } else {
        document.getElementById('numero').setAttribute('disabled', 'true');  // Deshabilitar campo de entrada
        let resultadoField = document.getElementById('resultado');
        if (puntosJugador1 > puntosJugador2) {
            resultadoField.innerHTML = "Jugador 1 ha ganado";
        } else if (puntosJugador2 > puntosJugador1) {
            resultadoField.innerHTML = "Jugador 2 ha ganado";
        } else {
            resultadoField.innerHTML = "¡Empate!";
        }
    }
}

function enviar() {
    let numeroIngresado = document.getElementById('numero').value;
    let resultadoField = document.getElementById('resultado');

    if (numeroIngresado === "") {
        alert("Por favor, ingrese un número.");
        return;
    }

    // Convertir el número ingresado a un entero
    numeroIngresado = parseInt(numeroIngresado);

    if (isNaN(numeroIngresado)) {
        alert("Por favor, ingrese un número válido.");
        return;
    }

    // Verificar si el jugador actual ha alcanzado el máximo de intentos
    if (jugadorActual === 1) {
        if (intentosJugador1 >= maxIntentos) {
            resultadoField.innerHTML = "Jugador 1 ha alcanzado el máximo de intentos.";
            document.getElementById('numero').value = "";
             return;// No hacer nada más si se alcanzó el máximo de intentos
        }
        intentosJugador1++;
    } 
    if (jugadorActual === 2){
        if (intentosJugador2 >= maxIntentos) {
            resultadoField.innerHTML = "Jugador 2 ha alcanzado el máximo de intentos.";
            actualizarPartida ()
            actualizarIntentos();
            return; // No hacer nada más si se alcanzó el máximo de intentos
        }
        intentosJugador2++;
    }


    // Actualizar los intentos de cada jugador
            actualizarIntentos();

    // Lógica del juego: comparar el número ingresado con el número aleatorio
    if (numeroIngresado < numeroAleatorio) {
        resultadoField.innerHTML = "Es mayor que " + numeroIngresado;
    } else if (numeroIngresado > numeroAleatorio) {
        resultadoField.innerHTML = "Es menor que " + numeroIngresado;
    } else {

        let puntosGanados = maxIntentos - (jugadorActual === 1 ? intentosJugador1 : intentosJugador2) + 1;

        if (jugadorActual === 1) {
            puntosJugador1 += puntosGanados; // Aumentar los puntos del Jugador 1
        } else {
            puntosJugador2 += puntosGanados; // Aumentar los puntos del Jugador 2
        }
        resultadoField.innerHTML = "¡Felicidades! jugador " + jugadorActual + " Has adivinado el número " + numeroAleatorio;
        
        // Actualizar los puntos de ambos jugadores
        actualizarPuntos();
        actualizarPartida ();
        
        
        setTimeout(() => {
            iniciarJuego();  // Reiniciar el juego después de 2 segundos
        }, 4000); // Esperar 4 segundos antes de reiniciar

        return; // Finaliza el juego si el número es adivinado
    }

    // Cambiar al siguiente jugador después de cada intento
    //jugadorActual = (jugadorActual === 1) ? 2 : 1;
    if (jugadorActual === 1) {
        jugadorActual = 2;
        $("#jugador1").removeClass("activePlayer1");
        $("#jugador2").addClass("activePlayer2");
    } else {
        jugadorActual = 1;
        $("#jugador2").removeClass("activePlayer2");
        $("#jugador1").addClass("activePlayer1");
    }

}

function abandonar() {
    let resultadoField = document.getElementById('resultado');
    resultadoField.innerHTML = "El jugador " + jugadorActual + " abandonado el juego. El número era " + numeroAleatorio;
    setTimeout(iniciarJuego, 6000); // Reiniciar el juego después de abandonar
}

window.onload = iniciarJuego;  // Iniciar juego al cargar la página

