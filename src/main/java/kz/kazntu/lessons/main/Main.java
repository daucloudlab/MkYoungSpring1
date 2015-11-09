package kz.kazntu.lessons.main;

import kz.kazntu.lessons.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml") ;
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloBean") ;
        helloWorld.printHello();
    }
}
