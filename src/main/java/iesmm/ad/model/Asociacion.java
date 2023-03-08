package iesmm.ad.t3_02.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "asociacion")
public class Asociacion {
    private String expediente;
    private String denominacion;
    private String patronimico;
    private String nif;
    private String fines;
    private String actividades;
    private String fecha_registro;
    private String fecha_constitucion;
    private String sede;
    private String domicilio;
    private String cp;
    private String cprovincia;
    private String provincia;
    private String localidad;
    private String clocalidad;
    private String mail;
    private String telefono;
    private String fax;
    private String web;

    public Asociacion() {
    }

    public Asociacion(String expediente, String denominacion, String patronimico, String nif, String fines, String actividades, String fecha_registro, String fecha_constitucion, String sede, String domicilio, String cp, String cprovincia, String provincia, String localidad, String clocalidad, String mail, String telefono, String fax, String web) {
        this.expediente = expediente;
        this.denominacion = denominacion;
        this.patronimico = patronimico;
        this.nif = nif;
        this.fines = fines;
        this.actividades = actividades;
        this.fecha_registro = fecha_registro;
        this.fecha_constitucion = fecha_constitucion;
        this.sede = sede;
        this.domicilio = domicilio;
        this.cp = cp;
        this.cprovincia = cprovincia;
        this.provincia = provincia;
        this.localidad = localidad;
        this.clocalidad = clocalidad;
        this.mail = mail;
        this.telefono = telefono;
        this.fax = fax;
        this.web = web;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getPatronimico() {
        return patronimico;
    }

    public void setPatronimico(String patronimico) {
        this.patronimico = patronimico;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getFines() {
        return fines;
    }

    public void setFines(String fines) {
        this.fines = fines;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFecha_constitucion() {
        return fecha_constitucion;
    }

    public void setFecha_constitucion(String fecha_constitucion) {
        this.fecha_constitucion = fecha_constitucion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCprovincia() {
        return cprovincia;
    }

    public void setCprovincia(String cprovincia) {
        this.cprovincia = cprovincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getClocalidad() {
        return clocalidad;
    }

    public void setClocalidad(String clocalidad) {
        this.clocalidad = clocalidad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
