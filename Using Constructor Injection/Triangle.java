package springpractice;

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
    private String type;
    private int height;
    
    public Triangle(String type) {
        this.type = type;
    }
    
    public Triangle(int height) {
        this.height = height;
    }
    
    public Triangle(String type, int height) {
        this.type   = type;
        this.height = height;
    }
    
    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }
    
    public void draw() {
        System.out.println(getType() + " Triangle Drawn Of Height " + getHeight());
    }
}
