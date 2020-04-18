/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stan;

/**
 *
 * @author katar
 */
public class BankomatMaszyna {
    
    BankomatStan jestKarta;
    BankomatStan brakKarty;
    BankomatStan pinPoprawny;
    BankomatStan brakPieniedzy;
    
    
    BankomatStan bankomatStan;
    
    int pieniadzeWBankomacie =2000;
    
    boolean wprowadzonoPoprawnyPin = false;
    
    
    public BankomatMaszyna(){
        
        jestKarta = new JestKarta(this);
        brakKarty = new BrakKarty(this);
        pinPoprawny = new PinPoprawny(this);
        brakPieniedzy = new BrakPieniedzy(this);
        
        
        bankomatStan = brakKarty;
        
        
        if(pieniadzeWBankomacie<0){
            bankomatStan=brakPieniedzy;
        }
        
        
    }
    
    void setBankomatStan(BankomatStan newBankomatStan){
        
        bankomatStan=newBankomatStan;
    }
            
    
 public void setPieniadzeWBankomacie(int newPieniadzeWBankomacie){
     pieniadzeWBankomacie=newPieniadzeWBankomacie;
 }
 
 
 public void wlozKarte(){
     bankomatStan.wlozKarte();
 }
            
public void wyjmijKarte(){
    bankomatStan.wyjmijKarte();
}

public void wprowadzPin(int pinWprowadzony){
    bankomatStan.wprowadzPin(pinWprowadzony);
    

}

public void wyplacGotowke(int gotowkaDoWydania){
    bankomatStan.wyplacGotowke(gotowkaDoWydania);
}

public BankomatStan getTakKartaStan(){
    return jestKarta;
}

public BankomatStan getNieKartaStan(){
    return brakKarty;
}
public BankomatStan getJestPin(){
    return pinPoprawny;
}    

public BankomatStan getBrakGotowkiStan(){
    return brakPieniedzy;
}
}
