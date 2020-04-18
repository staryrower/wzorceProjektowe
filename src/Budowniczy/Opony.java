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
public class Opony {
    private String typ;
    private int wytrzymalosc;
    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public int getWytrzymalosc(){
        return wytrzymalosc;
    }
    
    public void setWytrzymalosc(int wytrzymalosc){
        
       this.wytrzymalosc=wytrzymalosc;
    }
    
    @Override
    
    public String toString(){
        return "Opony [typ=" + typ + ", wytrzymalosc=" + wytrzymalosc + "]";
                
    }
    
    
}
