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
 class Paczkomat {
    
     boolean czyPelny() {
        System.out.println("Paczkomat nie jest pełny");
        return false;
        
    }
    
     boolean czyZepsuty() {
        System.out.println("Paczkomat nie jest zepsuty");
        return false;
    }
    
     void uzytkownik() {
        System.out.println("Dane użytkownika wprowadzone");
    }
    
     void otworz(){
        System.out.println("Paczkomat otwarty");
    }
    
}
