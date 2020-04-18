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
public class AsystentParkowania extends Dodatki{

    public AsystentParkowania(Samochod newSamochod) {
        super(newSamochod);
        
         System.out.println("Dodano Asystenta parkowania");
    }
           
    
    public String getDodatek(){
        return tempSamochod.getDodatek() + ", Asystent parkowania";
    }
    public double getCena(){
        return tempSamochod.getCena() + 1000;
    }
    
}
