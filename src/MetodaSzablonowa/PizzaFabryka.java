/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodaSzablonowa;

/**
 *
 * @author katar
 */
public class PizzaFabryka {
    
    
    public static void main(String[] args) {
        
        Pizza klient1 = new FarmerskaPizza();
        
        klient1.robPizze();
        
        System.out.println();
        
        Pizza klient2 = new WegetarianskaPizza();
        
        klient2.robPizze();
    }
}
