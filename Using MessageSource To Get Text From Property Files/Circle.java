/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpractice;

import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/**
 *
 * @author affan
 */
public class Circle implements Shape {
    private Point center;
    @Autowired
    private MessageSource messageSource;

    public Point getCenter() {
        return center;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(this.messageSource.getMessage("drawPoint", new Object[] {center.getX(), center.getY()}, "No Key drawPoint Found", null));
    }
    
    @PostConstruct
    public void initializeCircle() {
        System.out.println("Circle Initialized!");
    }
    
    @PreDestroy
    public void destroyCircle() {
        System.out.println("Circle Destroyed!");
    }
}
