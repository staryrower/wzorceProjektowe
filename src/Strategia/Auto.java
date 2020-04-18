/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategia;

/**
 *
 * @author katar
 */
public class Auto extends Pojazd{
    
    public void hamuj(){
        System.out.println("hamuję");
    }
    
    public Auto(){
        super();
        setKolor("Czarny");
        
        plywanieTypy = new ToNiePlywa();
    }
    
 
}
