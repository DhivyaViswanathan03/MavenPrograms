package in.ineuron.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="student")
public class Student {
	
	private Logger logger=LoggerFactory.getLogger(Student.class);
	
	static {
		System.out.println("Student is loading..");
	}
	public Student() {
		System.out.println("Student Zero Param is called..");
	}
	
	@Autowired
	//@Qualifier(value="java")
	@Qualifier("courseId")
	private ICourse course;

	public ICourse getCourse() {
		return course;
	}

	public void setCourse(ICourse course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
	public String CourseDetail() {
		logger.debug("Entering into CourseDetails::");
		return course.CourseDetails();
	}

}
