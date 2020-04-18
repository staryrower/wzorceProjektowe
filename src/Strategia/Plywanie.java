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
public interface Plywanie {
    
    String plyn(); 
    
}

class ToPlywa implements Plywanie{

    
    public String plyn() {
        return "Pływam";
    }
}   
class ToNiePlywa implements Plywanie{

    
    public String plyn() {
        return "Nie potrafię pływać";
    }    
    
}

