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
public class AutoDyrektor {
    
    private AutoBudowniczy  autoBudowniczy;
    
    public AutoDyrektor(AutoBudowniczy autoBudowniczy){
        this.autoBudowniczy= autoBudowniczy;
        
    }
    
    public void stworzAuto(){
        autoBudowniczy.buildOpony();
        autoBudowniczy.buildSilnik();
    }
    
    public Auto getAuto(){
        return this.autoBudowniczy.getAuto();
    }
}
