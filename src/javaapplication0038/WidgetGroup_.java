/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication0038;

import java.util.ArrayList;

/**
 *
 * @author stefan
 */
public class WidgetGroup_ {
    
    private ArrayList< Widget_ > lw ;   // list of Widget_s
    //private final double pi = 3.1415624 ; 
    
    public WidgetGroup_ () 
    {
         lw = new ArrayList<>() ;   
    }
    
    public WidgetGroup_ addWidget(Widget_ newWidget) 
    {
        lw.add(newWidget) ;
        return this ;
    }
    
    public WidgetGroup_ displayAll()
    {
        for (Widget_ w : lw) {
            System.out.println("------------------------------------------");
            System.out.println( "length of Widget_ :" + w.getLength() );
            System.out.println( "width of Widget_ :" + w.getWidth() );           
            System.out.println("------------------------------------------");

        }
        
        return this ;
    }
    
    // calculate the total area of all Widget_
    public int sumOfAreas()
    {
         int totalArea = 0 ;
         for ( Widget_ w : lw )
         {
            totalArea += ( w.getLength() * w.getWidth() ) ;
         }
         
         return totalArea ;
    }
    
    // calculate the total area of all Widget_
    public int sumOfLength()
    {
         int totalLength = 0 ;
         for ( Widget_ w : lw )
         {
            totalLength += w.getLength() ;
         }
         
         return totalLength ;
    }    
}
