package log.autenticacion.services;

import log.autenticacion.model.*;
import log.autenticacion.repository.UserRepository;
import log.autenticacion.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServices {
    private final UserRepository userRepository;
    private final JwtService jwtservice;
    public AuthResponse login(LoginRequest request) {
        return  null;
    }

    public AuthResponse register(RegisterRequest request) {
        Usuario user = Usuario.builder().username(request.getUsername()   )
                .password(request.getPassword()).
                firstName(request.getFirstName())
                .lastName(request.getLastName())
                .country(request.getCountry())
                .role(Role.USER)
                .build();

        userRepository.save(user);
        return AuthResponse.builder().token(jwtservice.getToken(user)).message("registro correcto") .build();
    }
}
