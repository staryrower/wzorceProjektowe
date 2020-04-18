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
public class JestKarta implements BankomatStan{
    
    BankomatMaszyna bankomatMaszyna;
    
    public JestKarta(BankomatMaszyna newBankomatMaszyna){
        
        bankomatMaszyna = newBankomatMaszyna;
    }

    @Override
    public void wlozKarte() {
        
        
        System.out.println("Nie możesz włożyć więcej niż jedną kartę");
    }

    @Override
    public void wyjmijKarte() {
        System.out.println("Karta odrzucona");
        
        bankomatMaszyna.setBankomatStan(bankomatMaszyna.getNieKartaStan());
    }

    @Override
    public void wprowadzPin(int pinWprowadzony) {
        if(pinWprowadzony ==1234){
            
            System.out.println("Poprawny PIN");
            
            bankomatMaszyna.wprowadzonoPoprawnyPin = true;
        
        bankomatMaszyna.setBankomatStan(bankomatMaszyna.getJestPin());
            
        }else{
            
            System.out.println("Zły PIN");
            
            bankomatMaszyna.wprowadzonoPoprawnyPin = false;
            
                        System.out.println("Karta odrzucona");
                        
                        bankomatMaszyna.setBankomatStan(bankomatMaszyna.getNieKartaStan());
                        
              

            
        }
    }

    @Override
    public void wyplacGotowke(int gotowkaDoWydania) {
       
        System.out.println("Wprowadź PIN");
    }
    
    
    
}
