package com.example.demo.Service;

import com.example.demo.DTO.empleadoDTO;
import com.example.demo.Entity.Empleado;

import java.util.List;

public interface EmpleadoService {

    public empleadoDTO getEmpleado(Long id);

    public List<empleadoDTO> getEmpleados();

    public Long addEmpleado(empleadoDTO empleado);

    public void deleteEmpleado(Long id);

}
