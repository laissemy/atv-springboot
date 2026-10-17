package biblioteca.biblioteca.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@Data
@Table(name = "tb_livro")
@AllArgsConstructor
@NoArgsConstructor
public class Livro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "isbn", nullable = false, unique = true)
    @JsonProperty("isbn")
    private String isbn;

    @Column(name = "titulo", nullable = false)
    @JsonProperty("titulo")
    private String titulo;

    @Column(name = "ano", nullable = false)
    @JsonProperty("ano")
    private Integer ano ;

    @Column (name = "edicao", nullable = false)
    @JsonProperty("edicao")
    private Integer edicao;

    // autor
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "autor_id", nullable = false)
    @ToString.Exclude 
    @EqualsAndHashCode.Exclude
    private Autor autor;
}


