/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author affan
 */
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("circleRelated")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...\nCenter Point = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }
    
}
