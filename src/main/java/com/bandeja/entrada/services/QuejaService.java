package com.bandeja.entrada.services;

import com.bandeja.entrada.entities.GdoTraTareadoc;
import com.bandeja.entrada.entities.SiriException;

import java.util.List;

public interface QuejaService {
    List<GdoTraTareadoc> listarQuejas();

    public List<GdoTraTareadoc> listarQuejas2();
}
