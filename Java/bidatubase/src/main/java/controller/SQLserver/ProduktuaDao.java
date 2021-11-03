package controller.SQLserver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.SQLserver.*;

public class ProduktuaDao {
	@PersistenceContext
    private EntityManager entityManager;

    /**
     * Devuelve todos los usuarios de la base de datos.
     */
    @SuppressWarnings("unchecked")
    public List<Produktua> getAll() {
    	return entityManager.createQuery("from Produktua").getResultList();
    }
}
