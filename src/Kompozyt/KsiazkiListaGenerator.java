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
public class KsiazkiListaGenerator {
    public static void main(String[] args){
        
        KsiazkaKomponent kryminal = new KsiazkaGrupa("Kryminał","");
        KsiazkaKomponent historyczna = new KsiazkaGrupa("Historyczne","");
        KsiazkaKomponent obyczajowa = new KsiazkaGrupa("Obyczajowe","");
        
        
        KsiazkaKomponent wszystkieKsiazki = new KsiazkaGrupa("Lista ksiązek", "Wszystkei dostępne książki");
        wszystkieKsiazki.add(kryminal);
        kryminal.add(new Ksiazka("Inicjały Zbrodni", "Agata Christie", 2018));
        kryminal.add(new Ksiazka("Pogromca Lwów", "Camilla Lackberg", 2008));
        
        kryminal.add(obyczajowa);
        obyczajowa.add(new Ksiazka("Kotka i Generał","Nino Haratischwili",2016));
        
        wszystkieKsiazki.add(historyczna);
        historyczna.add(new Ksiazka("Zima Świata", "Ken Follett",2006));
        
        Ksiegarnia kasia = new Ksiegarnia(wszystkieKsiazki);
        
        kasia.getKsiazkaLista();
        
        
        
        
    }
    
}
