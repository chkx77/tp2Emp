package com.example.demo.Controller;

import com.example.demo.Entity.Empleado;
import com.example.demo.Service.EmpleadoService;
import com.example.demo.Service.Implem.EmpleadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tp2/v1")
public class EmpleadoController {

    @Autowired
    EmpleadoServiceImpl empleadoService;

    @RequestMapping(value = "/empleado", method = RequestMethod.GET)
    public String getEmpleados() {
        return "Esta es la lista de empleados";
    }

    @RequestMapping(value = "/empleado/{id}", method = RequestMethod.GET)
    public String getEmpleado(Long id) {
        return "Este es el empleado con id " + id;
    }

    @RequestMapping(value = "/empleado", method = RequestMethod.POST)
    public String addEmpleado(@RequestBody Empleado empleado) {
        this.empleadoService.addEmpleado(empleado.toDTO());
        return "Empleado añadido con id " + empleado.getId() + "";
    }

    @RequestMapping(value = "/empleado/{id}", method = RequestMethod.PUT)
    public String updateEmpleado(Long id) {
        return "Empleado con id " + id + " actualizado";
    }

    @RequestMapping(value = "/empleado/{id}", method = RequestMethod.DELETE)
    public String deleteEmpleado(Long id) {
        return "Empleado con id " + id + " eliminado";
    }

}
