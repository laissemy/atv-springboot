package biblioteca.biblioteca.Repository;

import biblioteca.biblioteca.Model.Livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface LivroRepository extends JpaRepository<Livro,Long>{   

    // buscas especificas
    List<Livro> findByIsbnContainingIgnoreCase(String isbn);
    List<Livro> findByTituloContainingIgnoreCase(String titulo);
    List<Livro> findByIsbnContainingIgnoreCaseAndTituloContainingIgnoreCase(String isbn, String titulo);

    boolean existsByIsbnAndIdNot(String isbn, Long id);    
    boolean existsByIsbn(String isbn);
}
