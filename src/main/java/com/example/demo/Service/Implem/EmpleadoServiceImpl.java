package com.example.demo.Service.Implem;

import com.example.demo.DTO.empleadoDTO;
import com.example.demo.Entity.Empleado;
import com.example.demo.Repository.EmpleadoRepository;
import com.example.demo.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    EmpleadoRepository repository;


    @Override
    public empleadoDTO getEmpleado(Long id) {
        return null;
    }

    @Override
    public List<empleadoDTO> getEmpleados() {
        return List.of();
    }

    @Override
    public Long addEmpleado(empleadoDTO empleado) {
        return null;
    }

    @Override
    public void deleteEmpleado(Long id) {

    }
}
