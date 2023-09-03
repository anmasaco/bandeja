package com.bandeja.entrada.repository;


import com.bandeja.entrada.entities.GdoTraTareadoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClaseQuejaRepository extends JpaRepository<GdoTraTareadoc, Long> {
    //List<GdoTraTareadoc> findByCodigo(String codigo);
    Page<GdoTraTareadoc> findAll(Pageable pageable);


    @Query(nativeQuery = true, value = "select o.*, d.codigo codigoDocumental, d.detido from gdo_tra_tareadocs o, gdo_documental d where o.idtido = d.idtido and o.idtido not in (139,141) and o.numter='012025' and o.numrad='1997003209-010-000' and o.anulada=0 and o.cladoc=2 and o.tipmed not in (13,18,23) and o.codtra in (select t.codtra from GDO_TRAMITE t) order by o.fecrad desc")
    List<GdoTraTareadoc> findAllNative();
}