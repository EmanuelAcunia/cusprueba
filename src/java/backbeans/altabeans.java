/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backbeans;

import ejb.pasajesDAO;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import modelo.Pasajes;

/**
 *
 * @author ANDIISLAS
 */
@Named(value = "altabeans")
@RequestScoped
public class altabeans {
@EJB
private pasajesDAO pserv;
private Pasajes x;    

private int codPas;
private String nomApePas;
private String dni;
private String destVue;
private int canPas;
private Date fecSal;
private float costoPas;
private char estadoPas;
private boolean escalaVue;
private String ubicacionAs;
private String comentario;

   

    public int getCodPas() {
        return codPas;
    }

    public void setCodPas(int codPas) {
        this.codPas = codPas;
    }

    public String getNomApePas() {
        return nomApePas;
    }

    public void setNomApePas(String nomApePas) {
        this.nomApePas = nomApePas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDestVue() {
        return destVue;
    }

    public void setDestVue(String destVue) {
        this.destVue = destVue;
    }

    public int getCanPas() {
        return canPas;
    }

    public void setCanPas(int canPas) {
        this.canPas = canPas;
    }

    public Date getFecSal() {
        return fecSal;
    }

    public void setFecSal(Date fecSal) {
        this.fecSal = fecSal;
    }

    public float getCostoPas() {
        return costoPas;
    }

    public void setCostoPas(float costoPas) {
        this.costoPas = costoPas;
    }

    public char getEstadoPas() {
        return estadoPas;
    }

    public void setEstadoPas(char estadoPas) {
        this.estadoPas = estadoPas;
    }

    public boolean isEscalaVue() {
        return escalaVue;
    }

    public void setEscalaVue(boolean escalaVue) {
        this.escalaVue = escalaVue;
    }

    public String getUbicacionAs() {
        return ubicacionAs;
    }

    public void setUbicacionAs(String ubicacionAs) {
        this.ubicacionAs = ubicacionAs;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public altabeans() {
    }
    
    
    public void agregarInstancia(){
        this.x = new Pasajes();
        x.setNomApePas(nomApePas);
        x.setDni(dni);
        x.setDestVue(destVue);
        x.setCanPas(canPas);
        x.setFecSal(fecSal);
        x.setCostoPas(costoPas);
        x.setEstadoPas(estadoPas);
        x.setEscalaVue(escalaVue);
        x.setUbicacionAs(ubicacionAs);
        x.setComentario(comentario);
        pserv.crearObjeto(x);
        
    }
}
