package com.bandeja.entrada.entities;

import java.io.Serializable;

import javax.persistence.*;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the GDO_TRA_TAREADOCS database table.
 *
 */

@Entity
/*@NamedNativeQueries({

        @NamedNativeQuery(
                name = "GdoTraTareadoc.verificarPendiente",
                query = "select min(derivado) as derivado, numrad, coddoc, fecrad, nomdoc, contenttype from gdo_tra_tareadocs o where o.numpro=? and o.idtido in (114,169,86915,92991,103315) and o.anulada=0 and  cladoc=1 and derivado > ? and o.numter=? and rownum = 1  group by numrad,coddoc, fecrad, nomdoc, contenttype", resultClass=GdoTraTareadoc.class),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.verificarPruebaEnvio",
                query = "select o.CODDOC from gdo_tra_tareadocs o where o.numter=? and o.numpro=? and o.anulada=0 and o.idtido in (139,141) and o.numrada = ?", resultClass=GdoTraTareadoc.class),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.verificarDiaHabil",
                query = "select fecha from gdo_grl_festivos o where trunc(o.fecha)=?"),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.obtenerNumter",
                query = "Select NUMTER from entidad_vigilada e where  e.tipo_entidad = ? and e.cod_entidad = ? and e.FK_ESTENTIDA = 1"),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.verificarAdjuntos",
                query = "SELECT gtt.coddoc FROM GDO_TRA_TAREADOCS gtt, GDO_TRA_DOC_ADJUNTO ggf WHERE gtt.numrad=? and gtt.coddoc=ggf.coddoc"),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.obtenerDerivadosAnexos",
                query = "SELECT CODDOC, DESANEXOS FROM GDO_TRA_TAREADOCS WHERE numrad=? ", resultClass=GdoTraTareadoc.class),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.obtenerDatosArchivo",
                query = "SELECT CODDOC, NOMDOC, CONTENTTYPE FROM GDO_TRA_TAREADOCS WHERE numrad=? ", resultClass=GdoTraTareadoc.class),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.listarRequerimientosPolizas",
                query = "select o.*, d.codigo codigoDocumental, d.detido from gdo_tra_tareadocs o, gdo_documental d "+
                        "where o.idtido = d.idtido and o.anulada=0 and o.cladoc=2 "+
                        "and o.tipmed not in (13,18,23) "+
                        "and o.derivado = 0 "+
                        "and o.idtido = 125 "+
                        "and o.CODTRA IN (?, ?) "+
                        "order by o.fecrad desc", resultClass=GdoTraTareadoc.class),

        @NamedNativeQuery(
                name = "GdoTraTareadoc.peObtenerListado",
                query = "select o.*, d.codigo codigoDocumental, d.detido "
                        + " from gdo_tra_tareadocs o, gdo_documental d "
                        + " where o.idtido = d.idtido "
                        + " and o.numter=? "
                        + " and trunc(o.fecrad) between ? and ? "
                        + " and o.anulada=0 "
                        + " and o.cladoc=2 "
                        + " and o.tipmed not in (13,18,23) "
                        + " order by o.fecrad desc", resultClass=GdoTraTareadoc.class),
        @NamedNativeQuery(
                name = "GdoTraTareadoc.peVerificarAcuse",
                query = "select derivado, numrad, coddoc "
                        + " from gdo_tra_tareadocs o "
                        + " where o.numter=? "
                        + " and o.numpro=? "
                        + " and o.anulada=0 "
                        + " and o.idtido in (139,141) "
                        + " and o.numrada = ? "
                        + " order by derivado", resultClass=GdoTraTareadoc.class)
})*/

@Table(name="GDO_TRA_TAREADOCS")
public class GdoTraTareadoc implements Serializable {
    private static final long serialVersionUID = 201508180945L;

    @Id
    private long coddoc;

    private String anexos;

    private BigDecimal anulada;

    private BigDecimal caso;

    private BigDecimal cladoc;

    @Column(name="CLASIFICADO_TRD")
    private BigDecimal clasificadoTrd;

    private BigDecimal coddep;

    private BigDecimal coddepdo;

    private BigDecimal coddepe;

    private BigDecimal coddepini;

    private BigDecimal codfile;

    @Column(name="CODFILE_INI")
    private BigDecimal codfileIni;

    @Column(name="CODFUN_FIRMA")
    private String codfunFirma;

    private String codfunc;

    private String codfunscan;

    private BigDecimal codmod;

    private BigDecimal codmun;

    private BigDecimal codpais;

    private BigDecimal codpro;

    private BigDecimal codseg;

    private BigDecimal codtpl;

    private BigDecimal codtra;

    @Column(name="COMENT_ANULA")
    private String comentAnula;

    private String contenttype;

    private BigDecimal derivado;

    private String desanexos;

    private String destra;

    private BigDecimal diastra;

    private String dirrem;

    @Column(name="DOC_UID")
    private String docUid;

    @Lob
    private byte[] documento;

    private BigDecimal duplicado;

    private String emailrem;

    private BigDecimal expter;

    private Timestamp feccorreo;

    @Temporal(TemporalType.DATE)
    private Date fecplan;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECRAD")
    private Date fecrad;

    private Timestamp fecrefexterna;

    private Timestamp fecter;

    private BigDecimal idscan;

    private BigDecimal idtido;

    private String nomdoc;

    private String nomrem;

    private String nomter;

    private String numdoc;

    private String numdoca;

    private BigDecimal numdocrem;

    private BigDecimal numfolios;

    private BigDecimal numplanilla;

    private BigDecimal numpro;

    private String numrad;

    private String numrada;

    private String numter;

    private String numterrem;

    private String refexterna;

    private BigDecimal secuendiaria;

    private BigDecimal suspendida;

    private String telrem;

    @Column(name="TIP_DOC_REM")
    private BigDecimal tipDocRem;

    @Transient
    private BigDecimal tipdocter;

    @Transient
    private BigDecimal tipmed;

    @Transient
    private BigDecimal ucmdid;

    @Column(name = "codigoDocumental")
    private String codigoDocumental;

    @Column(name = "detido")
    private String detido;

    private String codigoTramite;

    @Transient
    private boolean conRespuesta;

    @Transient
    private boolean conAdjuntos;

    @Transient
    private String extensionDoc;

    @Transient
    private String numradRespuesta;

    @Transient
    private Timestamp fecRespuesta;

    @Transient
    private List<AnexoTO> derivadosAnexos;

    @Transient
    private boolean finalizado;

    @Transient
    private Date fechaVencimiento;

    @Transient
    private String nombreArchivoRespuesta;

    @Transient
    private String tipoContenidoArchivoRespuesta;

    public GdoTraTareadoc() {
    }

    public long getCoddoc() {
        return this.coddoc;
    }

    public void setCoddoc(long coddoc) {
        this.coddoc = coddoc;
    }

    public String getAnexos() {
        return this.anexos;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public BigDecimal getAnulada() {
        return this.anulada;
    }

    public void setAnulada(BigDecimal anulada) {
        this.anulada = anulada;
    }

    public BigDecimal getCaso() {
        return this.caso;
    }

    public void setCaso(BigDecimal caso) {
        this.caso = caso;
    }

    public BigDecimal getCladoc() {
        return this.cladoc;
    }

    public void setCladoc(BigDecimal cladoc) {
        this.cladoc = cladoc;
    }

    public BigDecimal getClasificadoTrd() {
        return this.clasificadoTrd;
    }

    public void setClasificadoTrd(BigDecimal clasificadoTrd) {
        this.clasificadoTrd = clasificadoTrd;
    }

    public BigDecimal getCoddep() {
        return this.coddep;
    }

    public void setCoddep(BigDecimal coddep) {
        this.coddep = coddep;
    }

    public BigDecimal getCoddepdo() {
        return this.coddepdo;
    }

    public void setCoddepdo(BigDecimal coddepdo) {
        this.coddepdo = coddepdo;
    }

    public BigDecimal getCoddepe() {
        return this.coddepe;
    }

    public void setCoddepe(BigDecimal coddepe) {
        this.coddepe = coddepe;
    }

    public BigDecimal getCoddepini() {
        return this.coddepini;
    }

    public void setCoddepini(BigDecimal coddepini) {
        this.coddepini = coddepini;
    }

    public BigDecimal getCodfile() {
        return this.codfile;
    }

    public void setCodfile(BigDecimal codfile) {
        this.codfile = codfile;
    }

    public BigDecimal getCodfileIni() {
        return this.codfileIni;
    }

    public void setCodfileIni(BigDecimal codfileIni) {
        this.codfileIni = codfileIni;
    }

    public String getCodfunFirma() {
        return this.codfunFirma;
    }

    public void setCodfunFirma(String codfunFirma) {
        this.codfunFirma = codfunFirma;
    }

    public String getCodfunc() {
        return this.codfunc;
    }

    public void setCodfunc(String codfunc) {
        this.codfunc = codfunc;
    }

    public String getCodfunscan() {
        return this.codfunscan;
    }

    public void setCodfunscan(String codfunscan) {
        this.codfunscan = codfunscan;
    }

    public BigDecimal getCodmod() {
        return this.codmod;
    }

    public void setCodmod(BigDecimal codmod) {
        this.codmod = codmod;
    }

    public BigDecimal getCodmun() {
        return this.codmun;
    }

    public void setCodmun(BigDecimal codmun) {
        this.codmun = codmun;
    }

    public BigDecimal getCodpais() {
        return this.codpais;
    }

    public void setCodpais(BigDecimal codpais) {
        this.codpais = codpais;
    }

    public BigDecimal getCodpro() {
        return this.codpro;
    }

    public void setCodpro(BigDecimal codpro) {
        this.codpro = codpro;
    }

    public BigDecimal getCodseg() {
        return this.codseg;
    }

    public void setCodseg(BigDecimal codseg) {
        this.codseg = codseg;
    }

    public BigDecimal getCodtpl() {
        return this.codtpl;
    }

    public void setCodtpl(BigDecimal codtpl) {
        this.codtpl = codtpl;
    }

    public BigDecimal getCodtra() {
        return this.codtra;
    }

    public void setCodtra(BigDecimal codtra) {
        this.codtra = codtra;
    }

    public String getComentAnula() {
        return this.comentAnula;
    }

    public void setComentAnula(String comentAnula) {
        this.comentAnula = comentAnula;
    }

    public String getContenttype() {
        return this.contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public BigDecimal getDerivado() {
        return this.derivado;
    }

    public void setDerivado(BigDecimal derivado) {
        this.derivado = derivado;
    }

    public String getDesanexos() {
        return this.desanexos;
    }

    public void setDesanexos(String desanexos) {
        this.desanexos = desanexos;
    }

    public String getDestra() {
        return this.destra;
    }

    public void setDestra(String destra) {
        this.destra = destra;
    }

    public BigDecimal getDiastra() {
        return this.diastra;
    }

    public void setDiastra(BigDecimal diastra) {
        this.diastra = diastra;
    }

    public String getDirrem() {
        return this.dirrem;
    }

    public void setDirrem(String dirrem) {
        this.dirrem = dirrem;
    }

    public String getDocUid() {
        return this.docUid;
    }

    public void setDocUid(String docUid) {
        this.docUid = docUid;
    }

    public byte[] getDocumento() {
        return this.documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    public BigDecimal getDuplicado() {
        return this.duplicado;
    }

    public void setDuplicado(BigDecimal duplicado) {
        this.duplicado = duplicado;
    }

    public String getEmailrem() {
        return this.emailrem;
    }

    public void setEmailrem(String emailrem) {
        this.emailrem = emailrem;
    }

    public BigDecimal getExpter() {
        return this.expter;
    }

    public void setExpter(BigDecimal expter) {
        this.expter = expter;
    }

    public Timestamp getFeccorreo() {
        return this.feccorreo;
    }

    public void setFeccorreo(Timestamp feccorreo) {
        this.feccorreo = feccorreo;
    }

    public Date getFecplan() {
        return this.fecplan;
    }

    public void setFecplan(Date fecplan) {
        this.fecplan = fecplan;
    }

    public Date getFecrad() {
        return this.fecrad;
    }

    public String getFecradF() {
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy");
        return dt1.format(this.fecrad);
    }

    public void setFecrad(Date fecrad) {
        this.fecrad = fecrad;
    }

    public Timestamp getFecrefexterna() {
        return this.fecrefexterna;
    }

    public void setFecrefexterna(Timestamp fecrefexterna) {
        this.fecrefexterna = fecrefexterna;
    }

    public Timestamp getFecter() {
        return this.fecter;
    }

    public void setFecter(Timestamp fecter) {
        this.fecter = fecter;
    }

    public BigDecimal getIdscan() {
        return this.idscan;
    }

    public void setIdscan(BigDecimal idscan) {
        this.idscan = idscan;
    }

    public BigDecimal getIdtido() {
        return this.idtido;
    }

    public void setIdtido(BigDecimal idtido) {
        this.idtido = idtido;
    }

    public String getNomdoc() {
        return this.nomdoc;
    }

    public void setNomdoc(String nomdoc) {
        this.nomdoc = nomdoc;
    }

    public String getNomrem() {
        return this.nomrem;
    }

    public void setNomrem(String nomrem) {
        this.nomrem = nomrem;
    }

    public String getNomter() {
        return this.nomter;
    }

    public void setNomter(String nomter) {
        this.nomter = nomter;
    }

    public String getNumdoc() {
        return this.numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public String getNumdoca() {
        return this.numdoca;
    }

    public void setNumdoca(String numdoca) {
        this.numdoca = numdoca;
    }

    public BigDecimal getNumdocrem() {
        return this.numdocrem;
    }

    public void setNumdocrem(BigDecimal numdocrem) {
        this.numdocrem = numdocrem;
    }

    public BigDecimal getNumfolios() {
        return this.numfolios;
    }

    public void setNumfolios(BigDecimal numfolios) {
        this.numfolios = numfolios;
    }

    public BigDecimal getNumplanilla() {
        return this.numplanilla;
    }

    public void setNumplanilla(BigDecimal numplanilla) {
        this.numplanilla = numplanilla;
    }

    public BigDecimal getNumpro() {
        return this.numpro;
    }

    public void setNumpro(BigDecimal numpro) {
        this.numpro = numpro;
    }

    public String getNumrad() {
        return this.numrad;
    }

    public void setNumrad(String numrad) {
        this.numrad = numrad;
    }

    public String getNumrada() {
        return this.numrada;
    }

    public void setNumrada(String numrada) {
        this.numrada = numrada;
    }

    public String getNumter() {
        return this.numter;
    }

    public void setNumter(String numter) {
        this.numter = numter;
    }

    public String getNumterrem() {
        return this.numterrem;
    }

    public void setNumterrem(String numterrem) {
        this.numterrem = numterrem;
    }

    public String getRefexterna() {
        return this.refexterna;
    }

    public void setRefexterna(String refexterna) {
        this.refexterna = refexterna;
    }

    public BigDecimal getSecuendiaria() {
        return this.secuendiaria;
    }

    public void setSecuendiaria(BigDecimal secuendiaria) {
        this.secuendiaria = secuendiaria;
    }

    public BigDecimal getSuspendida() {
        return this.suspendida;
    }

    public void setSuspendida(BigDecimal suspendida) {
        this.suspendida = suspendida;
    }

    public String getTelrem() {
        return this.telrem;
    }

    public void setTelrem(String telrem) {
        this.telrem = telrem;
    }

    public BigDecimal getTipDocRem() {
        return this.tipDocRem;
    }

    public void setTipDocRem(BigDecimal tipDocRem) {
        this.tipDocRem = tipDocRem;
    }

    public BigDecimal getTipdocter() {
        return this.tipdocter;
    }

    public void setTipdocter(BigDecimal tipdocter) {
        this.tipdocter = tipdocter;
    }

    public BigDecimal getTipmed() {
        return this.tipmed;
    }

    public void setTipmed(BigDecimal tipmed) {
        this.tipmed = tipmed;
    }

    public BigDecimal getUcmdid() {
        return this.ucmdid;
    }

    public void setUcmdid(BigDecimal ucmdid) {
        this.ucmdid = ucmdid;
    }

    public boolean isConRespuesta() {
        return conRespuesta;
    }

    public void setConRespuesta(boolean conRespuesta) {
        this.conRespuesta = conRespuesta;
    }

    public String getNumradRespuesta() {
        return numradRespuesta;
    }

    public void setNumradRespuesta(String numradRespuesta) {
        this.numradRespuesta = numradRespuesta;
    }

    public boolean isConAdjuntos() {
        return conAdjuntos;
    }

    public void setConAdjuntos(boolean conAnexos) {
        this.conAdjuntos = conAnexos;
    }

    public String getExtensionDoc() {
        return extensionDoc;
    }

    public void setExtensionDoc(String extensionDoc) {
        this.extensionDoc = extensionDoc;
    }

    public List<AnexoTO> getDerivadosAnexos() {
        return derivadosAnexos;
    }

    public void setDerivadosAnexos(List<AnexoTO> derivadosAnexos) {
        this.derivadosAnexos = derivadosAnexos;
    }

    public String getCodigoDocumental() {
        return codigoDocumental;
    }

    public void setCodigoDocumental(String codigoDocumental) {
        this.codigoDocumental = codigoDocumental;
    }

    public String getDetido() {
        return detido;
    }

    public void setDetido(String detido) {
        this.detido = detido;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "GdoTraTareadoc [numrad=" + numrad + ", conRespuesta="
                + conRespuesta + ", finalizado=" + finalizado + "]";
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getFechaVencimientoF() {
        String fechaVencimientoF = "";
        if(fecter!=null){
            SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMM-yyyy");
            fechaVencimientoF = dt1.format(fecter);
        }
        return fechaVencimientoF;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Timestamp getFecRespuesta() {
        return fecRespuesta;
    }

    public void setFecRespuesta(Timestamp fecRespuesta) {
        this.fecRespuesta = fecRespuesta;
    }

    public String getNombreArchivoRespuesta() {
        return nombreArchivoRespuesta;
    }

    public void setNombreArchivoRespuesta(String nombreArchivoRespuesta) {
        this.nombreArchivoRespuesta = nombreArchivoRespuesta;
    }

    public String getTipoContenidoArchivoRespuesta() {
        return tipoContenidoArchivoRespuesta;
    }

    public void setTipoContenidoArchivoRespuesta(String tipoContenidoArchivoRespuesta) {
        this.tipoContenidoArchivoRespuesta = tipoContenidoArchivoRespuesta;
    }

    public String getCodigoTramite() {
        return codigoTramite;
    }

    public void setCodigoTramite(String codigoTramite) {
        this.codigoTramite = codigoTramite;
    }
}
