package dao;

import javax.persistence.EntityManager;
import com.entity.Librarian;
import exception.LibrarianException;
import util.EMutil;

public class LibrarianDaoImpl implements LibrarianDAO {

	@Override
	public String addLibrarian(Librarian librarian) {
		
		String message="not added";
		
		EntityManager em=EMutil.getEM();
		
		em.getTransaction().begin();
		em.persist(librarian);
		message="librarian added";
		em.getTransaction().commit();
		em.close();

		return message;
	}

	@Override
	public String removeLibrarian(int id) {
		String msg="Not Removed";
		
		EntityManager em=EMutil.getEM();
		Librarian lib=em.find(Librarian.class, id);
		
		if(lib==null) {
			msg="Librarian not found with this id";
		}else {
			em.getTransaction().begin();
			em.remove(lib);
			msg="Librarian removed";
			em.getTransaction().commit();
		}
		
		em.close();

		return msg;
	}

	@Override
	public Librarian librarianByID(int id) throws LibrarianException {
		Librarian librarian=null;
		
		EntityManager em=EMutil.getEM();
		librarian=em.find(Librarian.class, id);
		
		if(librarian==null) {
			em.close();
			throw new LibrarianException("Librarian not found");
		}

		em.close();
		return librarian;
	}

}
