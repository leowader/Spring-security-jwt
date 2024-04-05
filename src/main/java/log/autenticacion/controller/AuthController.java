package log.autenticacion.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/login")
    public Map<String,String> login( ){
      Map<String, String> res= new HashMap<>();//objeto string
        String name="leowader";
        res.put("mensaje",  "bienvenido "+name);
        return res;
    }
    @PostMapping("/register")
    public String register (){
        return "register funcionando";
    }
}
