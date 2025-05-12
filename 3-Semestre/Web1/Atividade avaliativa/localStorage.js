//Vinicius Mattos
function adicionarLinha() {
  let tabela = document.getElementById("tabela").getElementsByTagName('tbody')[0];
  let novaLinha = tabela.insertRow();
  let celulaId = novaLinha.insertCell(0);
  celulaId.textContent = "Linha " + (tabela.rows.length + 1);
}

function salvarLinhas() {
  let linhasTabela = [];
  let tabela = document.getElementById("tabela").getElementsByTagName('tbody')[0];
  for (let i = 0; i < tabela.rows.length; i++) {
    linhasTabela.push("Linha " + (i + 1));
  }
  localStorage.setItem("tabelaLinhas", JSON.stringify(linhasTabela));
}

window.onload = function() {
  let linhasArmazenadas = localStorage.getItem("tabelaLinhas");
  if (linhasArmazenadas) {
    let linhasTabela = JSON.parse(linhasArmazenadas);
    let tabela = document.getElementById("tabela").getElementsByTagName('tbody')[0];
    for (let i = 0; i < linhasTabela.length; i++) {
      let novaLinha = tabela.insertRow();
      let celulaId = novaLinha.insertCell(0);
      celulaId.textContent = linhasTabela[i];
    }
  }
};
