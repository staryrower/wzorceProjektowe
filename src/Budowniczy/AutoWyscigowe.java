/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budowniczy;

/**
 *
 * @author katar
 */
public class AutoWyscigowe implements AutoBudowniczy {
    
    private Auto auto;
    
    public AutoWyscigowe(){
        this.auto = new Auto();
    }

    @Override
    
    public void buildSilnik(){
        Silnik silnik = new Silnik();
        silnik.setTyp("benzyna");
        
        auto.setSilnik(silnik);
    }
    
    @Override
    
    public void buildOpony(){
        Opony opony = new Opony();
        opony.setWytrzymalosc(5);
        opony.setTyp("letnie");
        
        auto.setOpony(opony);
    }
    
    @Override
    public Auto getAuto(){
        return auto;
    }
   
}
