/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototyp;

/**
 *
 * @author katar
 */
public class testKlonowania {
    
    public static void main(String[] args) {
        FabrykaKlonowania tworca = new FabrykaKlonowania();
        
        Kon marcin = new Kon();
        Kon sklonowanyKon = (Kon) tworca.getClone(marcin);
        
        System.out.println(marcin);
        System.out.println(sklonowanyKon);
        System.out.println("Marcin Hashcode: " +System.identityHashCode(System.identityHashCode(marcin)));
        System.out.println("SklonowanyKoń Hashcode: " +System.identityHashCode(System.identityHashCode(sklonowanyKon)));
        
    }
   
    
}
