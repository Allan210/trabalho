package br.com.fiap.Trafegos45.service;

import br.com.fiap.Trafegos45.Dto.TrafegoDto;
import br.com.fiap.Trafegos45.Dto.TrafegoExibicaoDto;
import br.com.fiap.Trafegos45.exception.TrafegoNaoEncontradoException;
import br.com.fiap.Trafegos45.model.StatusTrafego;
import br.com.fiap.Trafegos45.model.Trafego;
import br.com.fiap.Trafegos45.repository.TrafegoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrafegoService {
    @Autowired
    public TrafegoRepository trafegoRepository;

    public TrafegoExibicaoDto criar(@Valid TrafegoDto trafegoDto){

        Trafego trafego = new Trafego();
        BeanUtils.copyProperties(trafegoDto, trafego);

        trafego.setNumeroTrafego(StatusTrafego.NORMAL);
        Trafego trafegoCriado = trafegoRepository.save(trafego);

        return new TrafegoExibicaoDto(trafegoCriado);

    }

    public TrafegoExibicaoDto buscarPorNumeroTrafego(Long numeroTrafego){
        Optional<Trafego> trafegoOptional = trafegoRepository.findById(numeroTrafego);

        if (trafegoOptional.isPresent()){
            return new TrafegoExibicaoDto(trafegoOptional.get());
        } else {
            throw new TrafegoNaoEncontradoException(String.format("Trafego %s não existe!", numeroTrafego));
        }
    }

    public List<TrafegoExibicaoDto> exibirTodosOsTrafegos(){
        return trafegoRepository
                .findAll()
                .stream()
                .map(TrafegoExibicaoDto::new)
                .toList();
    }
    public void excluir(Long numeroTrafego){

        Optional<Trafego> trafegoOptional = trafegoRepository.findById(numeroTrafego);

        if (trafegoOptional.isPresent()){
            trafegoRepository.delete(trafegoOptional.get());
        } else {
            throw new TrafegoNaoEncontradoException(String.format("Trafego não existe!", numeroTrafego));
        }
        Trafego trafego = new Trafego();

    }


    public TrafegoExibicaoDto atualizar(TrafegoDto pedidoDto){
        Trafego trafego = new Trafego();
        BeanUtils.copyProperties(pedidoDto, trafego);
        Trafego trafegoAtualizado = trafegoRepository.save(trafego);
        return new TrafegoExibicaoDto(trafegoAtualizado);
    }


}
