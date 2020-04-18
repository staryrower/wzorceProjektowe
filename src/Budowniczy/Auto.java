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
public class Auto {
    
    private Opony opony;
    private Silnik silnik;
    
    public Opony getOpony(){
        return opony;
    }
    public void setOpony(Opony opony){
        this.opony=opony;
    }
    public Silnik getSilnik(){
        return silnik;
        
    }
    public void setSilnik(Silnik silnik){
        this.silnik=silnik;
    }
    
    @Override
    
    public String toString(){
        return "Auto [opony=" + opony +",silnik=" + silnik +"]";
    }
    
}
