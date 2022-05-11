import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat1 = (Cat) applicationContext.getBean("Cat");
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println("HelloWorlr имеет одну ссылку: = "+ (bean==bean2) + " Кошки имеют разные: = "+ (cat1==cat2));

    }
}