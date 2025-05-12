//Tutorial utilizado para resolução do exercício: https://youtu.be/37vxWr0WgQk
function consultarCEP() {
    let cep = document.getElementById('cep').value;

    fetch('https://viacep.com.br/ws/' + cep + '/json/') // Questão 1 - URL do serviço que o client está chamado
    // Questão 2 - Esse serviço tem como parâmetro a URL + CEP do serviço chamado, ele é usado para especificar quais dados serão acessados
    .then(response => {
        if (!response.ok) {
            throw new Error("Não foi possível encontrar o CEP")
        }
        return response.json(); // Questão 3 - Serviço retorna um JSON
    })
    .then(data => {
        if (!data.erro) {
          document.getElementById('logradouro').value = data.logradouro;
          document.getElementById('bairro').value = data.bairro;
          document.getElementById('cidade').value = data.localidade;
          document.getElementById('estado').value = data.uf;
        } else {
          alert('CEP não encontrado.');
        }
      })
    .catch(error => console.error(error));
  
    //Questão 4 - O serviço REST utilizado é o GET, pois ele recupera dados do servidor
}


















































/*.then(response => response.json()) // Converte a resposta para JSON
      .then(data => {
        if (!data.erro) {
          document.getElementById('logradouro').value = data.logradouro;
          document.getElementById('bairro').value = data.bairro;
          document.getElementById('cidade').value = data.localidade;
          document.getElementById('estado').value = data.uf;
          document.getElementById('complemento').value = data.complemento;
        } else {
          alert('CEP não encontrado.');
        }
      })
      .catch(error => console.error('Erro ao consultar o CEP:', error)); */