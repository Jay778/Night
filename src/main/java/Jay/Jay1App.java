package Jay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 94921 on 2019/2/28.
 */
public class Jay1App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/bean.xml");
        Jay1 jay1=(Jay1)context.getBean("JayId");
        System.out.print(jay1.getJay1());
    }
}
