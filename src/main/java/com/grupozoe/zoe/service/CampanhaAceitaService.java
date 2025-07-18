package com.grupozoe.zoe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupozoe.zoe.model.CampanhaAceita;
import com.grupozoe.zoe.model.CampanhaOfertada;
import com.grupozoe.zoe.model.Medico;
import com.grupozoe.zoe.repository.CampanhaOfertadaRepository;
import com.grupozoe.zoe.repository.MedicoRepository;
import com.grupozoe.zoe.repository.CampanhaAceitaRepository;

@Service
public class CampanhaAceitaService {

    @Autowired
    private CampanhaOfertadaRepository campanhaRepo;

    @Autowired
    private MedicoRepository medicoRepo;

    @Autowired
    private CampanhaAceitaRepository aceitaRepo;

    public CampanhaAceita aceitarCampanha(String campanhaId, String medicoId) {

        // ✅ Busca a campanha ofertada
        CampanhaOfertada campanha = campanhaRepo.findById(campanhaId)
                .orElseThrow(() -> new RuntimeException("Campanha não encontrada"));

        // ✅ Busca o médico
        Medico medico = medicoRepo.findById(medicoId)
                .orElseThrow(() -> new RuntimeException("Médico não encontrado"));

        // ✅ Constrói a campanha aceita com todos os dados necessários
        CampanhaAceita aceita = new CampanhaAceita();

        // === Dados do Médico ===
        aceita.setNomeCompleto(medico.getNomeCompleto());
        aceita.setCrm(medico.getCrm());
        aceita.setCpf(medico.getCpf());
        aceita.setEndereco(medico.getEndereco());
        aceita.setTelefone(medico.getTelefone());
        aceita.setDataNascimento(medico.getDataNascimento());

        // === Dados da Campanha Ofertada ===
        aceita.setSolicitanteNome(campanha.getSolicitanteNome());
        aceita.setSolicitanteEmail(campanha.getSolicitanteEmail());
        aceita.setEmpresa(campanha.getEmpresa());
        aceita.setFilial(campanha.getFilial());
        aceita.setEnderecoCompleto(campanha.getEnderecoCompleto());
        aceita.setResponsavelFilial(campanha.getResponsavelFilial());
        aceita.setHorarioFilial(campanha.getHorarioFilial());
        aceita.setMesProgramacao(campanha.getMesProgramacao());
        aceita.setExamesPrevistos(campanha.getExamesPrevistos());
        aceita.setMateriaisNecessarios(campanha.getMateriaisNecessarios());
        aceita.setObservacoes(campanha.getObservacoes());
        aceita.setDataInicio(campanha.getDataInicio());
        aceita.setDataFim(campanha.getDataFim());
        aceita.setHorarioAtendimento(campanha.getHorarioAtendimento());
        aceita.setCondicoesAdicionais(campanha.getCondicoesAdicionais());

        // Opcional: salvar a data em que foi aceita (não está na model, mas pode ser útil)
        // aceita.setDataAceite(LocalDate.now());

        // ✅ Salva no banco como um snapshot único
        return aceitaRepo.save(aceita);
    }
}
