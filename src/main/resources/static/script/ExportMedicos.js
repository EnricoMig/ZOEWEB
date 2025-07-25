async function carregarMedicos() {
    try {
        const response = await fetch('/api/medico');
        if (!response.ok) throw new Error('Erro ao buscar médicos');

        const medicos = await response.json();
        const container = document.getElementById('medicos-container');

        if (!medicos || medicos.length === 0) {
            container.innerHTML = `<p>Nenhum médico cadastrado.</p>`;
            return;
        }

        let tabela = `
            <table class="tabela-funcionarios">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>CRM</th>
                        <th>UF</th>
                        <th>Data de Nascimento</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
        `;

        medicos.forEach(m => {
            // Se endereco for null, evita erro
            const uf = m.endereco?.uf ?? '-';

            // Converte "1980-03-15" para "15/03/1980"
            const dataNasc = formatarDataBR(m.dataNascimento);

            tabela += `
                <tr>
                    <td data-label="Nome">${m.nomeCompleto ?? '-'}</td>
                    <td data-label="CRM">${m.crm ?? '-'}</td>
                    <td data-label="UF">${uf}</td>
                    <td data-label="Nascimento">${dataNasc}</td>
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
        console.error("Erro ao carregar médicos:", error);
        document.getElementById('medicos-container').innerHTML =
            `<p>Erro ao carregar médicos. Verifique o servidor.</p>`;
    }
}

// Converte "YYYY-MM-DD" -> "DD/MM/YYYY"
function formatarDataBR(dataISO) {
    if (!dataISO) return "-";
    const partes = dataISO.split("-");
    if (partes.length !== 3) return dataISO; // se não for ISO, retorna original
    return `${partes[2]}/${partes[1]}/${partes[0]}`;
}

// Chama automaticamente ao carregar a página
document.addEventListener('DOMContentLoaded', carregarMedicos);