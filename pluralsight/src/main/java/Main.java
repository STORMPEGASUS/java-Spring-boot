import com.maven.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //SpeakerService service = new SpeakerServiceImpl();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //using spring bean
        SpeakerService service = context.getBean("speakerService",SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstname());

    }
}