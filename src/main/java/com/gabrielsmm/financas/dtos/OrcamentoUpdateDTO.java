package com.gabrielsmm.financas.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrcamentoUpdateDTO {

    private String nome;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    private Double valor;

}
