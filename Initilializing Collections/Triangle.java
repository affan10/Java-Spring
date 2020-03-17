package springpractice;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author affan
 */
public class Triangle {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    public void draw() {
        for (Point point: points) {
            System.out.println("Point A = (" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
