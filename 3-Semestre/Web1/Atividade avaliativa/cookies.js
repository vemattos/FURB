//Vinicius Mattos
function salvarNome() {
  let nome = document.getElementById("nomeId").value;
  document.cookie = "nome=" + nome;
  exibirMensagem(nome);
}

function exibirMensagem(nome) {
  let mensagem = document.getElementById("mensagem");
  mensagem.textContent = "Seja bem-vindo " + nome;
}

window.onload = function() {
  let cookies = document.cookie.split("; ");
  let nomeSalvo;
  for (let i = 0; i < cookies.length; i++) {
      let cookie = cookies[i].split("=");  //cookie dividido entre "id" e valor
      if (cookie[0] === "nome") {
          nomeSalvo = cookie[1];
          break;
      }
  }
  if (nomeSalvo) {
    exibirMensagem(nomeSalvo);
  }
};