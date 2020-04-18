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
public class WegetarianskaPizza extends Pizza{
    
    String[] sosDoWyboru={"Pomidorowy"};
    String[] warzywaDoWyboru={"Pomidor","Kukurydza","Pieczarki"};
    
    
     boolean klientChceMieso(){return false;}
     boolean klientChceSer(){return false;}
     
      public void dodajWarzywa() {
        
         System.out.print("Dodano warzywa: ");
        for(String warzywa : warzywaDoWyboru){
            System.out.print(warzywa + " ");
        }
    }
     
     public void dodajSos() {
       System.out.print("Dodano sos: ");
        for(String sos : sosDoWyboru){
            System.out.print(sos + " ");
    }
  
    }
      
    

   
    void dodajMieso() {
        
    
    }

    
    void dodajSer() {
         
        }

   
   
   
    
    
    
}
