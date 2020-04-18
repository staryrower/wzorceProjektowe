/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kompozyt;

/**
 *
 * @author katar
 */
public class Ksiazka extends KsiazkaKomponent{
    
    String ksiazkaNazwa;
    String autorNazwa;
    int rokWydania;
    
    public Ksiazka(String newKsiazkaNazwa, String newAutorNazwa, int newRokWydania){
        ksiazkaNazwa=newKsiazkaNazwa;
        autorNazwa=newAutorNazwa;
        rokWydania=newRokWydania;
        
        
    }
    
    
    public String getKsiazkaNazwa() {
        return ksiazkaNazwa;
    }
    
    public String getAutorNazwa(){
        return autorNazwa;
    }
    public int getRokWydania(){
        return rokWydania;
    }
    
    
     public void pokazKsiazkaInfo(){
         System.out.println(getKsiazkaNazwa() + " została napisana przez" + getAutorNazwa() +" w " + getRokWydania());
     }
}
