/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpractice;

/**
 *
 * @author affan
 */
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle...\nCenter Point = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
    }
    
}
