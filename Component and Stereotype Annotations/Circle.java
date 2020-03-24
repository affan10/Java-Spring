/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpractice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 *
 * @author affan
 */

@Component
// You can use @Service, @Repository and @Controller Annotations inplace of @Component if needed
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...\nCenter Point = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
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
