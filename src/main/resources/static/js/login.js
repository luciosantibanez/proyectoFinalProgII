// Call the dataTables jQuery plugin
$(document).ready(function() {

});

document.getElementById('btnLogin').addEventListener('click', iniciarSesion);

async function iniciarSesion(){
    console.log("Botón clickeado!");

    let datos = {
        email: document.getElementById('txtEmail').value,
        password: document.getElementById('txtPassword').value
    };

    console.log("Datos capturados:", datos);

    try {
        const request = await fetch('api/login', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
        });

        const respuesta = await request.text();
        console.log("Respuesta del servidor:", respuesta);

        if(respuesta === 'OK'){
        window.location.href='usuarios.html';

        }else{
        alert('Las credenciales son incorrectas. Intente de nuevo')}

    } catch (error) {
        console.error("Error en la request:", error);
    }
}
