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
abstract class Dodatki implements Samochod{
    
    protected Samochod tempSamochod;
    
    public Dodatki(Samochod newSamochod){
        tempSamochod = newSamochod;
    }
    
    public String getDodatek(){
        return tempSamochod.getDodatek();
    }
    public double getCena(){
        return tempSamochod.getCena();
    }
    
}
