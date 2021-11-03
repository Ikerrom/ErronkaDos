package controller.SQLserver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.SQLserver.*;

public class FakturaDao {
	@PersistenceContext
    private EntityManager entityManager;

    /**
     * Devuelve todos los usuarios de la base de datos.
     */
    @SuppressWarnings("unchecked")
    public List<Faktura> getAll() {
    	return entityManager.createQuery("from Faktura").getResultList();
    }
}
