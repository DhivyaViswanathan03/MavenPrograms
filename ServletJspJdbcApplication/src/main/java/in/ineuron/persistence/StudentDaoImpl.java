package in.ineuron.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import in.ineuron.model.StudentBo;
import in.ineuron.util.HibernateUtil;

public class StudentDaoImpl implements IStudentDao {
	Session session = HibernateUtil.getSession();

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<StudentBo> getAllStudents() {
		
		Query<StudentBo> query = session.createQuery("FROM StudentBo");
		List<StudentBo> studentBO = query.getResultList();
		return studentBO;
		
	}

	
	

}
