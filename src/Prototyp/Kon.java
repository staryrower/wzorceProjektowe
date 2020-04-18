/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototyp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author katar
 */
public class Kon implements Zwierzeta{
    
    public Kon(){
        
        System.out.println("Koń jest tworzony");
    }
    
    public Zwierzeta zrobKopie(){
        
        System.out.println("Powstaje koń");
        
        Kon konObject = null;
        
        try {
            konObject= (Kon) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        
        return konObject;
    }
    
    
    public String toString(){
        return "Jaki koń jest każdy widzi";
    }
    
}
