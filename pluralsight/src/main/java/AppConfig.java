import com.maven.repository.SpeakerRepository;
import com.maven.repository.SpeakerRepositoryImpl;
import com.maven.service.SpeakerService;
import com.maven.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan({"com.maven"})
public class AppConfig {

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        return new SpeakerRepositoryImpl();
//    }

    //setter injection
//    @Bean(name = "speakerService")
//    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        service.setSpeakerRepository(getSpeakerRepository());
//        return service;
//    }

    //constructor  injection
//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        //        service.setSpeakerRepository(getSpeakerRepository());
//        return new SpeakerServiceImpl();
//    }
}
