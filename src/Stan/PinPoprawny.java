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
public class PinPoprawny implements BankomatStan{
    
    
    BankomatMaszyna bankomatMaszyna;
    
    public PinPoprawny(BankomatMaszyna newBankomatMaszyna){
        
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
        System.out.println("Pin już wprowadzono");
    }

    @Override
    public void wyplacGotowke(int gotowkaDoWydania) {
        
        
        if(gotowkaDoWydania>bankomatMaszyna.pieniadzeWBankomacie){
            
            System.out.println("Nie ma tyle pieniędzy");
            System.out.println("Karta odrzucona");
        bankomatMaszyna.setBankomatStan(bankomatMaszyna.getNieKartaStan());
            
            
                    }else{
            
             System.out.println(gotowkaDoWydania + "Pieniądze do wypłaty");
             bankomatMaszyna.setPieniadzeWBankomacie(bankomatMaszyna.pieniadzeWBankomacie - gotowkaDoWydania);
            System.out.println("Karta odrzucona");
        bankomatMaszyna.setBankomatStan(bankomatMaszyna.getNieKartaStan());
        
        if(bankomatMaszyna.pieniadzeWBankomacie<=0){
            
             bankomatMaszyna.setBankomatStan(bankomatMaszyna.getBrakGotowkiStan());
        }
            
        }
    }
    
}
