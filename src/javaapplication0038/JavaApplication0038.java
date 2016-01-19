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
public class JavaApplication0038 {

    /**
     * @param args the command line arguments
     */
    private static final int maxW = 123 ;
    public static void main(String[] args) {

        ArrayList< Widget_ > widgetList = new ArrayList<>() ;
        
        for (int wcount = 0 ; wcount < maxW ; wcount++){
            Widget_ w = new Widget_() ;  
            widgetList.add(w) ;
        }

        for (Widget_ w : widgetList) {
            System.out.print("Value held in Widget_ :");
            w.print() ;

        }
    }
    
}
