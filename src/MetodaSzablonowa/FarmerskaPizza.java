/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodaSzablonowa;

/**
 *
 * @author katar
 */
public class FarmerskaPizza extends Pizza {
    
    String[] miesoDoWyboru={"Szynka","Salami","Kurczak","Wołowina"};
    String[] serDoWyboru={"Mozzarella"};
    String[] sosDoWyboru={"Pomidorowy"};
    String[] warzywaDoWyboru={"Pomidor","Kukurydza","Pieczarki"};

    @Override
    void dodajMieso() {
        
        System.out.print("Dodano mięso: ");
        for(String mieso : miesoDoWyboru){
            System.out.print(mieso + " ");
        }
    }

    @Override
    void dodajSer() {
         System.out.print("Dodano ser: ");
        for(String ser : serDoWyboru){
            System.out.print(ser + " ");
        }
    }

    @Override
    void dodajSos() {
         System.out.print("Dodano sos: ");
        for(String sos : sosDoWyboru){
            System.out.print(sos + " ");
        }
    }

    @Override
    void dodajWarzywa() {
        
         System.out.print("Dodano warzywa: ");
        for(String warzywa : warzywaDoWyboru){
            System.out.print(warzywa + " ");
        }
    }
    
 
    
}
