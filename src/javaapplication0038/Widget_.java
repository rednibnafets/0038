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
    
    private int w ;
    
    public Widget_()
    {
        w = 0 ;
    }
    
    public Widget_ setW(int newW)
    {
        this.w = newW ;
        return this ;
    }
    
    public Widget_ print()
    {
        System.out.println(w) ;
        return this;
    }
    
}
