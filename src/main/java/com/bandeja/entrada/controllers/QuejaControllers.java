package com.bandeja.entrada.controllers;


import com.bandeja.entrada.entities.GdoTraTareadoc;
import com.bandeja.entrada.services.QuejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quejas")
public class QuejaControllers {

    @Autowired
    QuejaService service;

    @GetMapping("/list-all")
    public ResponseEntity<List<GdoTraTareadoc>> test() {
        return ResponseEntity.ok(service.listarQuejas());
    }

    @GetMapping("/list-all-2")
    public ResponseEntity<List<GdoTraTareadoc>> test2() {
        return ResponseEntity.ok(service.listarQuejas2());
    }

}
