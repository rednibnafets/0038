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
    
    private ArrayList< Widget_ > lw ;
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
    
    // calculate the total area of all Widget_
    public int sumOfAreas()
    {
         int area = 0 ;
         for ( Widget_ w : lw )
         {
            area += ( w.getLength() * w.getWidth() ) ;
         }
         
         return area ;
    }
    
}
