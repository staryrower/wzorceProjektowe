/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

/**
 *
 * @author katar
 */
public class Konfigurator implements Samochod {

    @Override
    public String getDodatek() {
        return "Sedan";
    }

    @Override
    public double getCena() {
       return 50000;
    }
    
}
