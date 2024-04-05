package log.autenticacion.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor//codigo limpio
@NoArgsConstructor
public class LoginRequest {
    String username;
    String password;

}
