/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kompozyt;

/**
 *
 * @author katar
 */
public abstract class KsiazkaKomponent {
    
    public void add(KsiazkaKomponent newKsiazkaKomponent){
        throw new UnsupportedOperationException();
    }
    public void remove(KsiazkaKomponent newKsiazkaKomponent){
        throw new UnsupportedOperationException();
    }
    public KsiazkaKomponent getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }
    public String getKsiazkaNazwa(){
        throw new UnsupportedOperationException();
    }
    
    public String getAutorNazwa(){
        throw new UnsupportedOperationException();
    
    }
    
    public int getRokWydania(){
        throw new UnsupportedOperationException();
    }
    
    public void pokazInfoKsiazka(){
        throw new UnsupportedOperationException();
    }
    
}
