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
public class Ksiegarnia {
    
    KsiazkaKomponent ksiazkaLista;
    public Ksiegarnia(KsiazkaKomponent newKsiazkaLista){
        ksiazkaLista = newKsiazkaLista;
    }
    
    
    public void getKsiazkaLista(){
        ksiazkaLista.pokazInfoKsiazka();
    }
}
