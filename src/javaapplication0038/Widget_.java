/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication0038;

/**
 *
 * @author stefan
 */
public class Widget_ {
    
    private int radius ;
    private final int minRadius = 1 ;
    private final int maxRadius = 99 ;
    
    public Widget_()
    {
        radius = 1 ;
    }
    
    public int increaseRadius(int increment)
    {
        if ( ( this.radius + increment ) > maxRadius ) 
        {
            // do nothing
        }  
        else if ( ( this.radius + increment ) <= maxRadius )
        {
             this.radius += increment ;        
        }

        return this.radius ;
    }
    
    public Widget_ print()
    {
        System.out.println(" Widget radius: " + this.radius) ;
        return this;
    }
    
}
