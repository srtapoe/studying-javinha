package br.com.studies.desafios.dto;

import jakarta.validation.constraints.*;

public record Usuario(
        @NotBlank(message = "O nome não pode ficar em branco")
        @Size(min = 10, message = "O nome deve ter no minimo 10 caracteres")
        String nome,

        @NotBlank(message = "O preenchimento do email eh obrigatorio")
        @Email(message = "Preencha com um email válido. Exemplo: email@gmail.com")
        String email,

        @Min(value = 18, message = "O usuario deve ter no minimo 18 anos")
        int idade,

        @Pattern(regexp = "\\d+,\\d+", message = "A altura deve estar no formato 'numero, virgula'")
        String altura) { }
