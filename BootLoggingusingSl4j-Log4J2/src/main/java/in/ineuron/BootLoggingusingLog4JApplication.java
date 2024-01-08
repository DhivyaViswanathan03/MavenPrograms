package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import in.ineuron.component.Student;

@SpringBootApplication
@ImportResource(locations = "applicationContext.xml")
public class BootLoggingusingLog4JApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootLoggingusingLog4JApplication.class, args);
		Student std=context.getBean(Student.class);
		System.out.println(std.CourseDetail());
		context.close();
	}

}
