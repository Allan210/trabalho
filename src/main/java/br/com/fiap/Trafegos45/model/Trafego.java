package br.com.fiap.Trafegos45.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_trafegos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Trafego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_trafego")
    private Long numeroTrafego;

    @NotBlank
    @Size(min = 3, max = 100)
    @Column(name = "nome_local")
    private String nomeLocal;

    @Column(name = "data_ocorrido")
    private LocalDate dataOcorrido;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status_trafego")
    private StatusTrafego statusTrafego;

    public void setNumeroTrafego(StatusTrafego statusTrafego) {
    }
}
