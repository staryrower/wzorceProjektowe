/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

/**
 *
 * @author katar
 */
public class ZrobAuto {
    
    public static void main(String[] args){
        
        Samochod basicSamochod = new AsystentParkowania(new Klimatyzacja(new Konfigurator()));
        
        
        System.out.println("Dodatki: " +basicSamochod.getDodatek());
        System.out.println("Cena: " +basicSamochod.getCena());
    }
    
}
