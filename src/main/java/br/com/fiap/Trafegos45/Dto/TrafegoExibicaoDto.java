package br.com.fiap.Trafegos45.Dto;

import br.com.fiap.Trafegos45.model.StatusTrafego;
import br.com.fiap.Trafegos45.model.Trafego;
import java.time.LocalDate;

public record TrafegoExibicaoDto(
        Long numeroTrafego,
        String nomeLocal,
        LocalDate dataOcorrido,
        StatusTrafego statusTrafego
        ) {
    public TrafegoExibicaoDto(Trafego trafego){
        this(
                trafego.getNumeroTrafego(),
                trafego.getNomeLocal(),
                trafego.getDataOcorrido(),
                trafego.getStatusTrafego()
        );
    }

}
