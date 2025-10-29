// Call the dataTables jQuery plugin
$(document).ready(function() {
    // acá podrías inicializar algo si hace falta
});

async function registrarUsuario(){
    let datos = {};
    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.telefono = document.getElementById('txtTelefono').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirPassword = document.getElementById('txtRepetirPassword').value;
    if (repetirPassword != datos.password) {
        alert('La contraseña no coincide');
        return;
    }

    const request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    const usuarios = await request.json();
    console.log("Respuesta del servidor:", usuarios);
}
