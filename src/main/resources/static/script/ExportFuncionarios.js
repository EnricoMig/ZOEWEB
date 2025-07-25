async function carregarFuncionarios() {
  try {
    const response = await fetch('/api/funcionario');
    if (!response.ok) throw new Error('Erro ao buscar funcionários');

    const funcionarios = await response.json();
    const container = document.querySelector('.dashboard-content');

    if (funcionarios.length === 0) {
      container.innerHTML = `<p>Nenhum funcionário listado.</p>`;
      return;
    }

    // Exibe como tabela
  let tabela = `
    <table class="tabela-funcionarios">
        <thead>
        <tr>
            <th>Nome</th>
            <th>Cargo</th>
            <th>Setor</th>
            <th>Ações</th>
        </tr>
        </thead>
        <tbody>
    `;

funcionarios.forEach(f => {
  tabela += `
    <tr>
      <td data-label="Nome">${f.nome}</td>
      <td data-label="Cargo">${f.cargo}</td>
      <td data-label="Setor">${f.setor}</td>
      <td data-label="Ações" class="acoes">
        <i class="fa-solid fa-eye" title="Visualizar"></i>
        <i class="fa-solid fa-pen-to-square" title="Editar"></i>
        <i class="fa-solid fa-trash" title="Excluir"></i>
      </td>
    </tr>
  `;
});

tabela += `</tbody></table>`;
container.innerHTML = tabela;


  } catch (error) {
    console.error(error);
    document.querySelector('.dashboard-content').innerHTML =
      `<p>Erro ao carregar funcionários.</p>`;
  }
}

document.addEventListener('DOMContentLoaded', carregarFuncionarios);