package in.ineuron.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="dotnet")
public class DotNetCourse implements ICourse {
	
	private Logger logger=LoggerFactory.getLogger(Student.class);
	static {
		System.out.println("DotNetCourse is loading..");
	}
	public DotNetCourse() {
		System.out.println("DotNetCourse Zero Param is called..");
	}

	@Override
	public String CourseDetails() {
		logger.info("Entering into dotnet course::");
		return "DOTNET course..";
	}

}
