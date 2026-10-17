package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {

    @JsonProperty("isbn")
    @NotBlank(message = "Isbn nao pode ser branco ou nulo")
    private String isbn;

    @JsonProperty ("titulo")
    @NotBlank(message = "Titulo nao pode ser branco ou nulo")
    private  String titulo;

    @JsonProperty("edicao")
    @NotNull (message = "Edicao nao pode ser nula")
    @Positive (message = "Edicao nao pode ser negativa")
    private Integer edicao;

    @JsonProperty("ano")
    @NotNull(message = "Ano nao pode ser nulo")    
    @Positive (message = "Ano nao pode ser negativo")
    private Integer ano;

    @JsonProperty("autorId")
    @NotNull (message = "Id do autor obrigatorio")
    private Long autorId;
}