package controller.SQLserver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.SQLserver.*;
@Repository
@Transactional
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
    
    public Produktua getById(long id) {
        return entityManager.find(Produktua.class, id);
    }

    /**
     * Actualiza el us...uario proporcionado
     */
    public void update(Produktua film) {
        entityManager.merge(film);
        return;
    }
    
    public void create(Produktua film) {
        entityManager.persist(film);
        return;
    }
}
