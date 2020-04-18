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
public class Klimatyzacja extends Dodatki{
    
    public Klimatyzacja(Samochod newSamochod){
        super(newSamochod);
        
        
        System.out.println("Dodano klimatyzację");
    }
    
    public String getDodatek(){
        return tempSamochod.getDodatek() + ", Klimatyzacja";
    }
    public double getCena(){
        return tempSamochod.getCena() + 2000;
    }
}
