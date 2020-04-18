/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budowniczy;

/**
 *
 * @author katar
 */
public class Klient {
    
    public static void main(String[] args){
        
        AutoBudowniczy autoBudowniczy = new AutoWyscigowe();
        AutoDyrektor autoDyrektor = new AutoDyrektor(autoBudowniczy);
        
        autoDyrektor.stworzAuto();
        
        Auto auto = autoDyrektor.getAuto();
        System.out.println(auto);
    }
    
}
