package controller.SQLserver;

import java.util.List;

import javax.persistence.EntityManager;

import model.SQLserver.*;

public class SalmentaDao {

	private EntityManager entityManager;

    /**
     * Devuelve todos los usuarios de la base de datos.
     */
    @SuppressWarnings("unchecked")
    public List<Salmenta> getAll() {
    	return entityManager.createQuery("from Salmenta").getResultList();
    }
    
    public Salmenta getById(long id) {
        return entityManager.find(Salmenta.class, id);
    }

    /**
     * Actualiza el us...uario proporcionado
     */
    public void update(Salmenta film) {
        entityManager.merge(film);
        return;
    }
}
