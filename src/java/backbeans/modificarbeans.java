/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backbeans;

import ejb.pasajesDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import modelo.Pasajes;

/**
 *
 * @author ANDIISLAS
 */
@Named(value = "modificarbeans")
@SessionScoped
public class modificarbeans implements Serializable {
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
private Pasajes pas;

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



    
    public modificarbeans() {
    }
   
    
    public String BuscaIdIntancia(int codPas){
        
      pas=pserv.BuscarIdObjeto(codPas);
      
      this.codPas=pas.getCodPas();
      this.nomApePas=pas.getNomApePas();
      this.dni=pas.getDni();
      this.destVue=pas.getDestVue();
      this.canPas=pas.getCanPas();
      this.fecSal=pas.getFecSal();
      this.costoPas=pas.getCostoPas();
      this.estadoPas=pas.getEstadoPas();
      this.escalaVue=pas.getEscalaVue();
      this.ubicacionAs=pas.getUbicacionAs();
      this.comentario=pas.getComentario();
      
     return "modificaciones";
}
    
    public void editarInstancia(){
        //pas = new Empleados();
        pas.setNomApePas(this.nomApePas);
        pas.setDni(this.dni);
        pas.setDestVue(this.destVue);
        pas.setCanPas(this.canPas);
        pas.setFecSal(this.fecSal);
        pas.setCostoPas(this.costoPas);
        pas.setEstadoPas(this.estadoPas);
        pas.setEscalaVue(this.escalaVue);
        pas.setUbicacionAs(this.ubicacionAs);
        pas.setComentario(this.comentario);
        
        pserv.ModificarObjeto(pas);
        
    }
}
