package com.clinica.modelo;
// Generated 10/12/2013 08:31:04 AM by Hibernate Tools 3.6.0



/**
 * Ingreso generated by hbm2java
 */
public class Ingreso  implements java.io.Serializable {


     private Integer id;
     private String concepto;
     private String tipoDeIngreso;
     private String monto;

    public Ingreso() {
    }

    public Ingreso(String concepto, String tipoDeIngreso) {
       this.concepto = concepto;
       this.tipoDeIngreso = tipoDeIngreso;
       this.monto = monto;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getConcepto() {
        return this.concepto;
    }
    
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public String getTipoDeIngreso() {
        return this.tipoDeIngreso;
    }
    
    public void setTipoDeIngreso(String tipoDeIngreso) {
        this.tipoDeIngreso = tipoDeIngreso;
    }
    public String getMonto() {
        return this.monto;
    }
    
    public void setMonto(String monto) {
        this.monto = monto;
    }




}


