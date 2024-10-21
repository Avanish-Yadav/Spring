package ava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
//        Action ram=new Ram();
//        ram.eat();
//        ram.sleep();
//        
//        Shyam sh=new Shyam();
//        sh.eat();
//        sh.sleep();
        
        ApplicationContext context= new ClassPathXmlApplicationContext("ava/config.xml");
        System.out.println(context);
        
        Shyam sh=context.getBean("person",Shyam.class);
         sh.eat();
         sh.sleep();
    }
}
