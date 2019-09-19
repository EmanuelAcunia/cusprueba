/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ANDIISLAS
 */
@Entity
@Table(name = "pasajes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasajes.findAll", query = "SELECT p FROM Pasajes p")
    , @NamedQuery(name = "Pasajes.findByCodPas", query = "SELECT p FROM Pasajes p WHERE p.codPas = :codPas")
    , @NamedQuery(name = "Pasajes.findByNomApePas", query = "SELECT p FROM Pasajes p WHERE p.nomApePas = :nomApePas")
    , @NamedQuery(name = "Pasajes.findByDni", query = "SELECT p FROM Pasajes p WHERE p.dni = :dni")
    , @NamedQuery(name = "Pasajes.findByDestVue", query = "SELECT p FROM Pasajes p WHERE p.destVue = :destVue")
    , @NamedQuery(name = "Pasajes.findByCanPas", query = "SELECT p FROM Pasajes p WHERE p.canPas = :canPas")
    , @NamedQuery(name = "Pasajes.findByFecSal", query = "SELECT p FROM Pasajes p WHERE p.fecSal = :fecSal")
    , @NamedQuery(name = "Pasajes.findByCostoPas", query = "SELECT p FROM Pasajes p WHERE p.costoPas = :costoPas")
    , @NamedQuery(name = "Pasajes.findByEstadoPas", query = "SELECT p FROM Pasajes p WHERE p.estadoPas = :estadoPas")
    , @NamedQuery(name = "Pasajes.findByEscalaVue", query = "SELECT p FROM Pasajes p WHERE p.escalaVue = :escalaVue")
    , @NamedQuery(name = "Pasajes.findByUbicacionAs", query = "SELECT p FROM Pasajes p WHERE p.ubicacionAs = :ubicacionAs")
    , @NamedQuery(name = "Pasajes.findByComentario", query = "SELECT p FROM Pasajes p WHERE p.comentario = :comentario")})
public class Pasajes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codPas")
    private Integer codPas;
    @Size(max = 50)
    @Column(name = "NomApePas")
    private String nomApePas;
    @Size(max = 50)
    @Column(name = "dni")
    private String dni;
    @Size(max = 50)
    @Column(name = "DestVue")
    private String destVue;
    @Column(name = "canPas")
    private Integer canPas;
    @Column(name = "FecSal")
    @Temporal(TemporalType.DATE)
    private Date fecSal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CostoPas")
    private Float costoPas;
    @Column(name = "EstadoPas")
    private Character estadoPas;
    @Column(name = "EscalaVue")
    private Boolean escalaVue;
    @Size(max = 50)
    @Column(name = "UbicacionAs")
    private String ubicacionAs;
    @Size(max = 200)
    @Column(name = "Comentario")
    private String comentario;

    public Pasajes() {
    }

    public Pasajes(Integer codPas) {
        this.codPas = codPas;
    }

    public Integer getCodPas() {
        return codPas;
    }

    public void setCodPas(Integer codPas) {
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

    public Integer getCanPas() {
        return canPas;
    }

    public void setCanPas(Integer canPas) {
        this.canPas = canPas;
    }

    public Date getFecSal() {
        return fecSal;
    }

    public void setFecSal(Date fecSal) {
        this.fecSal = fecSal;
    }

    public Float getCostoPas() {
        return costoPas;
    }

    public void setCostoPas(Float costoPas) {
        this.costoPas = costoPas;
    }

    public Character getEstadoPas() {
        return estadoPas;
    }

    public void setEstadoPas(Character estadoPas) {
        this.estadoPas = estadoPas;
    }

    public Boolean getEscalaVue() {
        return escalaVue;
    }

    public void setEscalaVue(Boolean escalaVue) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPas != null ? codPas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasajes)) {
            return false;
        }
        Pasajes other = (Pasajes) object;
        if ((this.codPas == null && other.codPas != null) || (this.codPas != null && !this.codPas.equals(other.codPas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pasajes[ codPas=" + codPas + " ]";
    }
    
}
