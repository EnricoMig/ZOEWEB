package com.grupozoe.zoe.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grupozoe.zoe.model.CampanhaAceita;
import com.grupozoe.zoe.model.CampanhaOfertada;
import com.grupozoe.zoe.model.Endereco;
import com.grupozoe.zoe.model.Medico;
import com.grupozoe.zoe.repository.CampanhaAceitaRepository;
import com.grupozoe.zoe.repository.CampanhaOfertadaRepository;
import com.grupozoe.zoe.repository.MedicoRepository;

@Service
public class CampanhaAceitaService {

    private final CampanhaAceitaRepository aceitaRepo;
    private final CampanhaOfertadaRepository ofertadaRepo;
    private final MedicoRepository medicoRepo;

    public CampanhaAceitaService(
        CampanhaAceitaRepository aceitaRepo,
        CampanhaOfertadaRepository ofertadaRepo,
        MedicoRepository medicoRepo
    ) {
        this.aceitaRepo = aceitaRepo;
        this.ofertadaRepo = ofertadaRepo;
        this.medicoRepo = medicoRepo;
    }

    @Transactional
    public void registrarAceiteUnico(String campanhaID,String medicoID){
        CampanhaOfertada camp = ofertadaRepo.findById(campanhaID).orElseThrow(()->new IllegalArgumentException("Campanha não encontrada: "+campanhaID));
        Medico m = medicoRepo.findById(medicoID).orElseThrow(()->new IllegalArgumentException("Médico não encontrada: "+medicoID));
        
        Endereco endereco = new Endereco();
        CampanhaAceita ca = new CampanhaAceita();
        ca.setDataAceita(LocalDate.now());

        ca.setMedicoID(m.getId());
        ca.setNomeCompleto(m.getNomeCompleto());
        ca.setCrm(m.getCrm());
        ca.setCpf(m.getCpf());
        ca.setRg(m.getRg());
        ca.setTelefone(m.getTelefone());
        ca.setDataNascimento(m.getDataNascimento());
        

        endereco.setCidade(m.getEndereco().getCidade());
        endereco.setLogradouro(m.getEndereco().getLogradouro());
        endereco.setBairro(m.getEndereco().getBairro());
        endereco.setCep(m.getEndereco().getCep());
        endereco.setNumero(m.getEndereco().getNumero());
        endereco.setUf(m.getEndereco().getUf());
        ca.setEndereco(endereco);

        ca.setOfertadaID(camp.getId());
        ca.setSolicitanteNome(camp.getSolicitanteNome());
        ca.setSolicitanteEmail(camp.getSolicitanteEmail());
        ca.setEmpresa(camp.getEmpresa());
        ca.setFilial(camp.getFilial());
        ca.setEnderecoCompleto(camp.getEnderecoCompleto());
        ca.setResponsavelFilial(camp.getResponsavelFilial());
        ca.setHorarioFilial(camp.getHorarioFilial());
        ca.setMesProgramacao(camp.getMesProgramacao());
        ca.setExamesPrevistos(camp.getExamesPrevistos());
        ca.setMateriaisNecessarios(camp.getMateriaisNecessarios());
        ca.setObservacoes(camp.getObservacoes());

        aceitaRepo.save(ca);

        System.out.printf("Médico %s aceitou campanha %s%n", medicoID, campanhaID);
        System.out.println(ca.toString());
    }

    public List<CampanhaAceita> listarAceites() {
        return aceitaRepo.findAll(); // retorna lista completa
    }
}
