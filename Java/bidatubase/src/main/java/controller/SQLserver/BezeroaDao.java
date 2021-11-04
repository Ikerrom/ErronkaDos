package controller.SQLserver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.SQLserver.*;

public class BezeroaDao {
	@PersistenceContext
    private EntityManager entityManager;

    /**
     * Devuelve todos los usuarios de la base de datos.
     */
    @SuppressWarnings("unchecked")
    public List<Bezeroa> getAll() {
    	return entityManager.createQuery("from Bezeroa").getResultList();
    }
    
    public Bezeroa getById(long id) {
        return entityManager.find(Bezeroa.class, id);
    }

    /**
     * Actualiza el us...uario proporcionado
     */
    public void update(Bezeroa film) {
        entityManager.merge(film);
        return;
    }
}
