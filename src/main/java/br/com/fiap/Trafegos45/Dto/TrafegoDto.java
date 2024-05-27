package br.com.fiap.Trafegos45.Dto;

import br.com.fiap.Trafegos45.model.StatusTrafego;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TrafegoDto {
    private Long numeroTrafego;
    private String nomeLocal;
    private LocalDate dataOcorrido;
    private StatusTrafego statusTrafego;

}
