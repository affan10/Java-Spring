package springpractice;

import java.util.List;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author affan
 */
public class Triangle implements ApplicationContextAware, BeanNameAware {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private String beanName;
    private ApplicationContext context;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    public void draw() {
        System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.context = ac;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("Bean Name: " + beanName);
    }
}
