package in.ineuron.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="java")
public class JavaCourse implements ICourse {
	private Logger logger=LoggerFactory.getLogger(Student.class);
	
	static {
		System.out.println("JavaCourse is loading..");
	}
	public JavaCourse() {
		System.out.println("JavaCourse Zero Param is called..");
	}
	

	@Override
	public String CourseDetails() {
		logger.info("Entering into java course::");
		return "JAVA course..";

	}

}
