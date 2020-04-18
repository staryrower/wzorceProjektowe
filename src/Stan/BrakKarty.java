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
public class BrakKarty implements BankomatStan{
    
    
    BankomatMaszyna bankomatMaszyna;
    
    public BrakKarty(BankomatMaszyna newBankomatMaszyna){
        
        bankomatMaszyna = newBankomatMaszyna;
    }

    @Override
    public void wlozKarte() {
         System.out.println("Wprowadź PIN");
        
        bankomatMaszyna.setBankomatStan(bankomatMaszyna.getTakKartaStan());
    }

    @Override
    public void wyjmijKarte() {
        System.out.println("Wprowadź kartę");
    }

    @Override
    public void wprowadzPin(int pinWprowadzony) {
        
         System.out.println("Wprowadź kartę");
        
    }

    @Override
    public void wyplacGotowke(int gotowkaDoWydania) {
         System.out.println("Wprowadź kartę");
    }
    
}
