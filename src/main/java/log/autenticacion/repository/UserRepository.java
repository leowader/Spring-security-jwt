package log.autenticacion.repository;

import log.autenticacion.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario,Integer> {


    Optional<Usuario> findByUsername(String username );
}
