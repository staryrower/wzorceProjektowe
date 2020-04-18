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
public class TestBankomat {
    
    public static void main(String[] args){
        
        BankomatMaszyna bankomatMaszyna = new BankomatMaszyna();
        
        
        bankomatMaszyna.wlozKarte();
        bankomatMaszyna.wyjmijKarte();
        bankomatMaszyna.wlozKarte();
        bankomatMaszyna.wprowadzPin(1234);
        bankomatMaszyna.wyplacGotowke(2000);
        bankomatMaszyna.wlozKarte();
        bankomatMaszyna.wprowadzPin(1234);
    }
    
}
