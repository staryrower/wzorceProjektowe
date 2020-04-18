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
public abstract class Pizza {
    
    boolean poPierwszymWyborze = false;
    
    final void robPizze(){
        walkujCiasto();
        
        if(klientChceMieso()){
            
            dodajMieso();
            
            poPierwszymWyborze = true;
            
        }
        
        if(klientChceSer()){
            if(poPierwszymWyborze) {System.out.println("\n");}
            dodajSer();
            poPierwszymWyborze=true;
        }
        
         if(klientChceSos()){
            if(poPierwszymWyborze) {System.out.println("\n");}
          
            dodajSos();
            
            poPierwszymWyborze=true;
        }
         
          if(klientChceWarzywa()){
            if(poPierwszymWyborze) {System.out.println("\n");}
            dodajWarzywa();
            
            poPierwszymWyborze=true;
        }
        
          upieczPizze();
        
    }
    
    
    
    public void walkujCiasto(){
        
        System.out.println("Ciasto jest wałkowane");
    }
    abstract void dodajMieso();
    abstract void dodajSer();
   
     abstract void dodajSos();
     
     abstract void dodajWarzywa();
    boolean klientChceMieso(){
        
        return true;
    }
    
      boolean klientChceSer(){
        
        return true;
    }
      
       boolean klientChceSos(){
        
        return true;
    }
       
          boolean klientChceWarzywa(){
        
        return true;
    }
          
     
          public void upieczPizze(){
              
              System.out.println("Pizza się piecze");
          }
}
