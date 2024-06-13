package com.deivy.webApp.controller;

import com.deivy.webApp.model.Evolutivo;
import com.deivy.webApp.repository.EvolutivoRepository;
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
@RequestMapping("/evolutivo")
public class EvolutivoController {
    @Autowired
    EvolutivoRepository evolutivoRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Evolutivo>> getAll(){
        try {
            List<Evolutivo> reglaList = new ArrayList<Evolutivo>(evolutivoRepository.findAll());
            return new ResponseEntity<>(reglaList, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
