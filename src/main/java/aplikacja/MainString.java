package aplikacja;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainString {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SmartHome home = context.getBean(SmartHome.class);
        home.uruchomSterowniki();

    }
}
