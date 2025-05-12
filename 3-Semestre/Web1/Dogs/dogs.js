function resetar() {
    window.location.reload();
}
const username = sessionStorage.getItem('username');
if (username) {
    document.getElementById('username').textContent = username;
} 

function scrollToSection(sectionId) {
    const section = document.getElementById(sectionId);
    section.scrollIntoView({ behavior: 'smooth' });
}

document.addEventListener('DOMContentLoaded', function() {
    const lanchesForm = document.getElementById('lanches-form');
    const lanchesList = document.getElementById('lanches-list');
    let idCounter = 0;

    lanchesForm.addEventListener('submit', function(event) {
        event.preventDefault();
        const nome = document.getElementById('nome').value;
        const descricao = document.getElementById('descricao').value;
        const preco = document.getElementById('preco').value;

        const lancheItem = `
            <div class="lanche-item" id="lanche-${idCounter}">
                <div>${nome}</div>
                <div><a>${descricao}</a></div>
                <div>Preço: R$ ${preco}</div>
                <div class="btn-container">
                    <button class="btn-editar" data-id="${idCounter}">Editar</button>
                    <button class="btn-excluir" data-id="${idCounter}">Excluir</button>
                </div>
            </div>
        `;

        lanchesList.insertAdjacentHTML('beforeend', lancheItem);

        idCounter++;
        lanchesForm.reset();
    });

    document.addEventListener('click', function(event) {
        const target = event.target;
        if (target.classList.contains('btn-excluir')) {
            const lancheId = target.dataset.id;
            document.getElementById(`lanche-${lancheId}`).remove();
        } else if (target.classList.contains('btn-editar')) {
            const lancheId = target.dataset.id;
            const lancheItem = document.getElementById(`lanche-${lancheId}`);
            const nome = lancheItem.childNodes[0].textContent.trim();
            const descricao = lancheItem.childNodes[1].textContent.trim();
            const preco = lancheItem.childNodes[2].textContent.replace('Preço: R$ ', '');
            
            const novoNome = prompt('Novo nome:', nome);
            const novaDescricao = prompt('Nova descrição:', descricao);
            const novoPreco = prompt('Novo preço:', preco);
    
            if (novoNome && novaDescricao && novoPreco) {
                lancheItem.innerHTML = `
                    <div>${novoNome}</div>
                    <div><a>${novaDescricao}</a></div>
                    <div>Preço: R$ ${novoPreco}</div>
                    <div class="btn-container">
                        <button class="btn-editar" data-id="${lancheId}">Editar</button>
                        <button class="btn-excluir" data-id="${lancheId}">Excluir</button>
                    </div>
                `;
            }
        }
    });
});
