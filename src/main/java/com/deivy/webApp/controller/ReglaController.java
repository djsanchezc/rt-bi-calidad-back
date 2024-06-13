package com.deivy.webApp.controller;

import com.deivy.webApp.model.Regla;
import com.deivy.webApp.repository.ReglaRepository;
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
@RequestMapping("/regla")
public class ReglaController {
    @Autowired
    ReglaRepository reglaRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Regla>> getAll(){
        try {
            List<Regla> reglaList = new ArrayList<Regla>(reglaRepository.findAll());
            return new ResponseEntity<>(reglaList, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
