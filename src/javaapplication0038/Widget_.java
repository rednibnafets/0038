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
    
    private int width ;
    private final int minWidth = 1 ;
    private final int maxWidth = 99 ;

    private int length ;
    private final int minLength = 100 ;
    private final int maxLength = 990 ;
    
    // default constructor        
    public Widget_()
    {
        width = 1 ;
        length = 100 ;
    }
            
    public Widget_(int newWidth, int newLength)
    {
        this.width = newWidth ;
        this.length = newLength ;
    }    
    
    public int getLength()
    {
        return this.length ;
    }
    
    public int getWidth()
    {
        return this.width ;
    }
    
    public int increaseWidth(int increment)
    {
        if ( ( this.width + increment ) > maxWidth ) 
        {
            // do nothing
        }  
        else if ( ( this.width + increment ) <= maxWidth )
        {
             this.width += increment ;        
        }

        return this.width ;
    }
    
    public int decreaseWidth(int decrement)
    {
        if ( ( this.width + decrement ) >= minWidth ) 
        {
            this.width -= decrement ;   
        }  
        else if ( ( this.width + decrement ) < minWidth )
        {
            // do nothing
        }

        return this.width ;
    }

    
    public int increaseLength(int increment)
    {
        if ( ( this.length + increment ) > maxLength ) 
        {
            // do nothing
        }  
        else if ( ( this.length + increment ) <= maxLength )
        {
             this.length += increment ;        
        }

        return this.length ;
    }
    
    public int decreaseLength(int decrement)
    {
        if ( ( this.length + decrement ) >= minLength ) 
        {
            this.length -= decrement ;   
        }  
        else if ( ( this.length + decrement ) < minLength )
        {
            // do nothing
        }

        return this.length ;
    }    
    
    public Widget_ print()
    {
        System.out.println(" Widget width: " + this.width) ;
        System.out.println(" Widget length: " + this.length) ;
        return this;
    }
    
}
