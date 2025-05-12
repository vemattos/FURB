//Vinicius Mattos
function salvarNome() {
  let nome = document.getElementById("nomeId").value;
  sessionStorage.setItem("nome", nome);
  exibirMensagem(nome);
}

function exibirMensagem(nome) {
  let mensagem = document.getElementById("mensagem");
  mensagem.textContent = "Seja bem-vindo " + nome;
}

window.onload = function() {
  let nomeSalvo = sessionStorage.getItem("nome");
  if (nomeSalvo) {
    exibirMensagem(nomeSalvo);
  }
};