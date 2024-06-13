package com.deivy.webApp.controller;

import com.deivy.webApp.model.Calidad;
import com.deivy.webApp.repository.CalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/calidad")
public class CalidadController {
    @Autowired
    CalidadRepository calidadRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Calidad>> getAllSupplies(){
        try {
            List<Calidad> calidadList = new ArrayList<Calidad>(calidadRepository.findAll());
            return new ResponseEntity<>(calidadList, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
