/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springpractice;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author affan
 */
public class DrawEvent extends ApplicationEvent {
    
    public DrawEvent(Object sourceClassOfEvent) {
        super(sourceClassOfEvent);
    }
    
    @Override
    public String toString() {
        return "Draw Event Ocurred!";
    }
    
}
