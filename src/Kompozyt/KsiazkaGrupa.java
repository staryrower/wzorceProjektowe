/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kompozyt;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author katar
 */
public class KsiazkaGrupa  extends KsiazkaKomponent{
    
    ArrayList ksiazkaKomponenty = new ArrayList();
    
    
    String grupaNazwa;
    String grupaOpis;
    
    public KsiazkaGrupa(String newGrupaNazwa,String newGrupaOpis ){
        grupaNazwa= newGrupaNazwa;
        grupaOpis=newGrupaOpis;
    }
    
    public String getGrupaNazwa(){
        return grupaNazwa;
    }
    
    public String getGruapOpis(){
        return grupaOpis;
    }
    
    public void add(KsiazkaKomponent newKsiazkaKomponent){
        ksiazkaKomponenty.add(newKsiazkaKomponent);
    }
    public void remove(KsiazkaKomponent newKsiazkaKomponent){
        ksiazkaKomponenty.add(newKsiazkaKomponent);
    }
    
    public KsiazkaKomponent getKomponent(int komponentIndex){
        return(KsiazkaKomponent)ksiazkaKomponenty.get(komponentIndex);
    }
    
    public void pokazKsiazkaInfo(){
        System.out.println(getGrupaNazwa() + " " + getGruapOpis()+"\n");
        
        Iterator ksiazkaIterator = ksiazkaKomponenty.iterator();
        
        while(ksiazkaIterator.hasNext()){
            KsiazkaKomponent ksiazkaInfo=(KsiazkaKomponent) ksiazkaIterator.next();
            ksiazkaInfo.pokazInfoKsiazka();
        }
    }
    
    
   
    
}
