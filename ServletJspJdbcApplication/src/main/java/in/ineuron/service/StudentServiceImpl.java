package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import in.ineuron.daoFactory.StudentDaoFactory;
import in.ineuron.model.StudentBo;
import in.ineuron.model.StudentDto;
import in.ineuron.persistence.IStudentDao;

public class StudentServiceImpl implements IStudentService{
   private  IStudentDao studentDao;

@Override
public List<StudentDto> getAllStudents() {
	studentDao=StudentDaoFactory.getStudentDao();
	List<StudentBo> students=studentDao.getAllStudents();
	List<StudentDto> dtoList=new ArrayList<StudentDto>();
	for(StudentBo student:students) {
		StudentDto dto=new StudentDto();
		dto.setId(student.getId());
		dto.setName(student.getName());
		dto.setAge(student.getAge());
		dto.setAddress(student.getAddress());
		dtoList.add(dto);
	}
	return dtoList;
}

	
}
