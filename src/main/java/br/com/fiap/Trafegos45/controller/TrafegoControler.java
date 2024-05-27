package br.com.fiap.Trafegos45.controller;

import br.com.fiap.Trafegos45.Dto.TrafegoDto;
import br.com.fiap.Trafegos45.Dto.TrafegoExibicaoDto;
import br.com.fiap.Trafegos45.service.TrafegoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/trafegos")
public class TrafegoControler {

    @Autowired
    private TrafegoService service;

    @PostMapping
    public TrafegoExibicaoDto criar(@RequestBody @Valid TrafegoDto trafegoDto){
        return service.criar(trafegoDto);
    }

    @GetMapping("{numeroPedido}")
    public ResponseEntity<TrafegoExibicaoDto> buscarPorNumeroTrafego(@PathVariable Long numeroTrafego){
        return ResponseEntity.ok(service.buscarPorNumeroTrafego(numeroTrafego));
    }

    @GetMapping
    public ResponseEntity<List<TrafegoExibicaoDto>> exibirTodosOsPedidos(){
        return ResponseEntity.ok(service.exibirTodosOsTrafegos());
    }

    @DeleteMapping("{numeroPedido}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long numeroTrafego){
        service.excluir(numeroTrafego);
    }

    @PutMapping
    public TrafegoExibicaoDto atualizar(@RequestBody TrafegoDto trafegoDto){return service.atualizar(trafegoDto);
    }

    }

