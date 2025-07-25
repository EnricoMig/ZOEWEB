    async function carregarCampanhasOfertadas() {
        try {
            const response = await fetch('/api/campanhaofertada');
            if (!response.ok) throw new Error('Erro ao buscar campanhas ofertadas');

            const campanhas = await response.json();
            const container = document.getElementById('campanhas-ofertadas');

            if (!campanhas || campanhas.length === 0) {
                container.innerHTML = `<p>Nenhuma campanha cadastrada.</p>`;
                return;
            }

            let cardsHTML = "";

            campanhas.forEach(c => {
                const periodo = `${formatarDataBR(c.dataInicio)} a ${formatarDataBR(c.dataFim)}`;

                cardsHTML += `
                    <div class="card-campanha" style="
                        background: #fff;
                        border: 1px solid #ddd;
                        border-radius: 8px;
                        padding: 1rem;
                        margin-bottom: 1rem;
                        box-shadow: 0 2px 6px rgba(0,0,0,0.05);
                    ">
                        <h3 style="margin:0 0 0.5rem 0; color:#6A1B9A;">
                            ${c.empresa} - ${c.filial}
                        </h3>
                        
                        <p><strong>Endereço:</strong> ${c.enderecoCompleto}</p>
                        
                        <p><strong>Período solicitado:</strong> ${periodo}</p>
                        <p><strong>Horário de Atendimento:</strong> ${c.horarioAtendimento}</p>
                        
                        <p><strong>Exames previstos:</strong> ${c.examesPrevistos}</p>
                        <div style="margin-top:0.8rem; display:flex; gap:0.5rem;">
                            <button class="btn-acao" style="background:#6A1B9A; color:white; padding:0.5rem 1rem; border:none; border-radius:6px; cursor:pointer;">
                                <i class="fa-solid fa-eye"></i> Visualizar
                            </button>
                            <button class="btn-acao" style="background:#AB47BC; color:white; padding:0.5rem 1rem; border:none; border-radius:6px; cursor:pointer;">
                                <i class="fa-solid fa-pen-to-square"></i> Editar
                            </button>
                            <button class="btn-acao" style="background:#d32f2f; color:white; padding:0.5rem 1rem; border:none; border-radius:6px; cursor:pointer;">
                                <i class="fa-solid fa-trash"></i> Excluir
                            </button>
                        </div>
                    </div>
                `;
            });

            container.innerHTML = cardsHTML;

        } catch (error) {
            console.error(error);
            document.getElementById('campanhas-ofertadas').innerHTML =
                `<p>Erro ao carregar campanhas ofertadas.</p>`;
        }
    }
    
    async function carregarCampanhasAceitas() {
        try {
            const response = await fetch('/api/campanhaaceita');
            if (!response.ok) throw new Error('Erro ao buscar campanhas aceitas');

            const campanhas = await response.json();
            const container = document.getElementById('campanhas-aceitas');

            if (!campanhas || campanhas.length === 0) {
                container.innerHTML = `<p>Nenhuma campanha aceita.</p>`;
                return;
            }

            let cardsHTML = "";

            campanhas.forEach(c => {
                const dataAceite = c.dataAceita ? formatarDiaMes(c.dataAceita) : "-";

       cardsHTML += `
                        <div class="card-campanha">
                            <strong style="font-size:1.1rem;">
                                ${c.empresa || "-"} - ${c.filial || "-"}
                            </strong><br>

                            <strong>ENDEREÇO:</strong> ${c.enderecoCompleto || '-'}<br>
                            <strong>DATA:</strong> ${dataAceite}<br>
                            <strong>HORÁRIO:</strong> ${c.horarioFilial || '-'} (com 1h de pausa não remunerada)<br>
                            <strong>VALOR HORA:</strong> R$160,00 + R$0,27 por página de impressão<br>

                            <span class="separator">--------------------------------------</span>

                            <strong>${c.nomeCompleto || '-'}</strong><br>
                            CRM: ${c.crm || '-'}</br>
                            CPF: ${c.cpf || '-'}</br>
                            RG: ${c.rg || '-'}</br>
                        </div>
                    `;

            });

            container.innerHTML = cardsHTML;

        } catch (error) {
            console.error(error);
            document.getElementById('campanhas-aceitas').innerHTML =
                `<p>Erro ao carregar campanhas aceitas.</p>`;
        }
    }

    // ===== Funções auxiliares =====
    function formatarDataBR(dataISO) {
        if (!dataISO) return "-";
        const [ano, mes, dia] = dataISO.split("-");
        return `${dia}/${mes}/${ano}`;
    }

    // Apenas dia/mês para o card simplificado
    function formatarDiaMes(dataISO) {
        if (!dataISO) return "-";
        const partes = dataISO.split("-");
        if (partes.length !== 3) return dataISO;
        return `${partes[2]}/${partes[1]}`;
    }

    // ===== Carregar automaticamente ao abrir =====
    document.addEventListener('DOMContentLoaded', () => {
        carregarCampanhasOfertadas();
        carregarCampanhasAceitas();
    });