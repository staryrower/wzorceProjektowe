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
public class Statek extends Pojazd{
    
     public void hamuj(){
        System.out.println("hamuję");
    }
    
    public Statek(){
        super();
        
        setKolor("Biały");
        
        plywanieTypy = new ToPlywa();
        
    }
    
}
