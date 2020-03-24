/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author affan
 */
public class SpringPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("project.xml");
        Shape shape = (Shape) context.getBean("Triangle");
        shape.draw();
        shape = (Shape) context.getBean("Circle");
        shape.draw();
    }
    
}
