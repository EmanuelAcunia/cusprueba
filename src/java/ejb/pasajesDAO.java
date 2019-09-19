/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.Pasajes;

/**
 *
 * @author ANDIISLAS
 */
@Stateless
public class pasajesDAO {
@PersistenceContext(name = "agencia_de_viajesPU")
private EntityManager em;


public void crearObjeto(Pasajes x) {
        em.persist(x);
    }

    public void ModificarObjeto(Pasajes x){
    em.merge(x);
    }
    
    public void borrarObjeto(Pasajes x){
    em.remove(em.merge(x));
    }
    
    public Pasajes BuscarIdObjeto(int id){
        Query q=em.createNamedQuery("Pasajes.findByCodPas");
        q.setParameter("codPas",id);
        return (Pasajes)q.getSingleResult();
    
    }
    
    public List<Pasajes> listarObjetos() {
        Query q = em.createNamedQuery("Pasajes.findAll");
        return (List<Pasajes>) q.getResultList();
    }
    
}
