/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import com.mvc.Employee;
import com.mvc.Hello;
import com.mvc.HelloAnotation;
import com.mvc.TestAnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




/**
 *
 * @author HP
 */
public class SpringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       context.registerShutdownHook();
        Hello hello = (Hello)context.getBean("hello");
       hello.setMessage("Hi... in your new Spring project Test");
        System.out.println(hello.getMessage());
        
         
       Hello hello3 = (Hello)context.getBean("hello");
       hello.setMessage("Hi... in your new Spring project Test2");
        System.out.println(hello3.getMessage());
        
        ApplicationContext context1 = new AnnotationConfigApplicationContext(HelloAnotation.class);
        Hello hello1 = (Hello)context1.getBean("hello");
        hello1.setMessage("Hello it is Annotation base Beans");
        System.out.println(hello1.getMessage());
//        
//        ApplicationContext context2 = new AnnotationConfigApplicationContext(TestAnotation.class);
//        Hello hello2 = (Hello)context2.getBean("anot");
//        hello2.setMessage("it's review testing Annotation");
//        System.out.println(hello2.getMessage());
        
//    ApplicationContext context3 = new ClassPathXmlApplicationContext("beans.xml");
//        Employee emp = (Employee)context3.getBean("e2");
//        emp.show();
   }
    
    
}
