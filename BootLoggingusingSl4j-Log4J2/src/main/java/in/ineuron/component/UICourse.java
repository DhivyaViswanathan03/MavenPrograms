package in.ineuron.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="UI")
public class UICourse implements ICourse {
	private Logger logger=LoggerFactory.getLogger(Student.class);
	static {
		System.out.println("UICourse is loading..");
	}
	public UICourse() {
		System.out.println("UICourse Zero Param is called..");
	}
	

	@Override
	public String CourseDetails() {
		logger.info("Entering into UI course::");
		return "UI course..";

	}

}
