import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean == bean2);

        Cat beanCat = applicationContext.getBean("cat", Cat.class);
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(beanCat == beanCat2);
    }
}