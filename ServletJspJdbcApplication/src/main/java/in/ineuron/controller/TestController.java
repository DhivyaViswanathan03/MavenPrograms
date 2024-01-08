package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.model.StudentBo;
import in.ineuron.model.StudentDto;
import in.ineuron.model.StudentVo;
import in.ineuron.service.IStudentService;
import in.ineuron.servicefactory.StudentServiceFactory;


@WebServlet("/search")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Request URI is:"+request.getRequestURI());
		System.out.println("Path Info is:"+request.getPathInfo());
		IStudentService studentService = StudentServiceFactory.getStudentService();
		List<StudentDto> students=studentService.getAllStudents();
		List<StudentVo> student=new ArrayList<>();
		for(StudentDto stud:students) {
			StudentVo vo=new StudentVo();
			vo.setId(stud.getId().toString());
			vo.setName(stud.getName());
			vo.setAge(stud.getAge().toString());
			vo.setAddress(stud.getAddress());
			student.add(vo);
		}
		
		System.out.println(student);
          request.setAttribute("student", student);
          RequestDispatcher rd = request.getRequestDispatcher("./display.jsp");
          rd.forward(request, response);
		
		
		
	}
	

}
