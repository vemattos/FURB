function login() {
    let nomeUsuario = document.getElementById("username").value;
    let senha = document.getElementById("password").value;
    
    let rememberMe = document.getElementById("remember").checked;
    if (rememberMe) {
        sessionStorage.setItem("username", nomeUsuario);
    }

    if (nomeUsuario === "adm" && senha === "123") {
        window.location.href = "dogs.html";
    } else {
        alert("Credenciais inválidas. Por favor, tente novamente.");
    }
}

document.getElementById("login").addEventListener("click", login);

window.onload = function() {
    let usernameSession = sessionStorage.getItem("username");
    if (usernameSession !== null) {
        document.getElementById("username").value = usernameSession;
    }
};

function recuperarSenha() {
    let nomeUsuario = document.getElementById("username").value;
    alert(nomeUsuario + " sua senha é: 123");
}

