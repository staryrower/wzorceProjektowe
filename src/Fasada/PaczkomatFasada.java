/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fasada;

/**
 *
 * @author katar
 */
public class PaczkomatFasada {
    
    private Paczkomat paczkomat;
    private Obsluga obsluga;
    
    public PaczkomatFasada() {
        paczkomat = new Paczkomat();
        obsluga = new Obsluga(); 
    }
            
   public void odbiorPaczki() {
 
        
        paczkomat.uzytkownik();
        if(obsluga.autoryzacjaUzytkownika() && obsluga.platnosc()){
            paczkomat.otworz();
        }
    } 
}
