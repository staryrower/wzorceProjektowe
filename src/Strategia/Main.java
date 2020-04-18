/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategia;

/**
 *
 * @author katar
 */
public class Main {
    public static void main(String[] args){
        Pojazd ford = new Auto();
        Pojazd titanic = new Statek();
        
        System.out.println("Auto: " +ford.probujPlywac());
        
        System.out.println("Statek: " +titanic.probujPlywac());
    }
    
}
