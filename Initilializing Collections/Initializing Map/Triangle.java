package springpractice;

import java.util.List;
import java.util.Map;

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
    private Map<Integer, Point> pointsMap;

    public Map<Integer, Point> getPointsMap() {
        return pointsMap;
    }

    public void setPointsMap(Map<Integer, Point> pointsMap) {
        this.pointsMap = pointsMap;
    }
    
    public void draw() {
        for (int pointNumber: pointsMap.keySet()) {
            System.out.println("Point = (" + pointsMap.get(pointNumber).getX() + ", " + pointsMap.get(pointNumber).getY() + ")");
        }
    }
}
