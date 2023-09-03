package com.bandeja.entrada.services.impl;

import com.bandeja.entrada.entities.AppUser;
import com.bandeja.entrada.entities.GdoTraTareadoc;
import com.bandeja.entrada.entities.SiriException;
import com.bandeja.entrada.repository.ClaseQuejaRepository;
import com.bandeja.entrada.repository.GdoTraTareadocRepository;
import com.bandeja.entrada.services.QuejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuejaServiceImpl implements QuejaService {

    @Autowired
    ClaseQuejaRepository repository;

    @Autowired
    GdoTraTareadocRepository gdoTraTareadocRepository;

    @Override
    public List<GdoTraTareadoc> listarQuejas() {
        Page<GdoTraTareadoc> page = repository.findAll(PageRequest.of(0, 10)); // 0 es la primera página y 10 es el número de registros
        return page.getContent();
    }

    public List<GdoTraTareadoc> listarQuejas2(){
        return  repository.findAllNative();
    }
}
