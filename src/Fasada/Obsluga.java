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
 class Obsluga {
    
     void wyslijInformacje(){
        System.out.println("Informacja wysłana do klienta");
    }
    
     boolean platnosc(){
        System.out.println("Płatność została sprawdzona");
        return true;
    }
    
     boolean autoryzacjaUzytkownika(){
        System.out.println("Użytkownik został sprawdzony");
        return true;
    }
    
     void harmonogramDostawy(){
        
        System.out.println("Dostawa została zaplanowana");
    }
}
