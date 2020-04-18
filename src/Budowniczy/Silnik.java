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
public class Silnik {
    
    private String typ;
    
    public String getTyp(){
        return typ;
    }
    
    public void setTyp(String typ) {
        this.typ = typ;
    }
    
    @Override
    public String toString(){
        return "Silnik [typ=" + typ + "]";
    }
            
    
}
