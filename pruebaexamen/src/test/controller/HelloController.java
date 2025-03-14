package com.PruebaExamenDocker.es;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola desde Docker y Springboot";
    }

    @PostMapping("/crear")
    public String crearRecurso(@RequestBody String mensaje) {
        return "Recurso creado con mensaje: " + mensaje;
    }

    @PutMapping("/actualizar/{id}")
    public String actualizarRecurso(@PathVariable int id, @RequestBody String nuevoMensaje) {
        return "Recurso con ID " + id + " actualizado con mensaje: " + nuevoMensaje;
    }
}
