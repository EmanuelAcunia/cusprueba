/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backbeans;

import ejb.pasajesDAO;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import modelo.Pasajes;

/**
 *
 * @author ANDIISLAS
 */
@Named(value = "indexbeans")
@RequestScoped
public class indexbeans {
@EJB
private pasajesDAO pserv;
    

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


    public indexbeans() {
    }
    
     public boolean hayElementos(){ //este metodo no esta en usuario controller, lo tiene en el index
        return  pserv.listarObjetos().size()>0;
    }
    public List<Pasajes> getElementos(){
        return pserv.listarObjetos();
    }
    
    public List<Pasajes> ordenByNom(){ //este metodo tampoco esta
        return pserv.listarObjetos();
    }
}
