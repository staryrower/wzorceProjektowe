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
public class Pojazd {
    
    private String nazwa;
    private double wysokosc;
    private int waga;
    private String paliwo;
    private double predkoscMax;
    private String kolor;
    
    public Plywanie plywanieTypy;
    
    public void setNazwa(String newNazwa) {nazwa = newNazwa;}
    public String getNazwa() {return nazwa;}
    
    public void setWysokosc(double newWysokosc){wysokosc = newWysokosc;}
    public double getWysokosc()
    {return wysokosc;}
    
    public void setWaga (int newWaga) {
        if(newWaga >0 ){
            waga = newWaga;
        }
        else
            System.out.println("Waga musi być większa niż zero");
        
    }
    
    public double getWaga() {
        return waga;
        
    }
    
    public void setPaliwo (String newPaliwo)
    {
        paliwo = newPaliwo;
    }
    public String getPaliwo()
    {
        return paliwo;
    }
    
    public void setPredkoscMax(double newPredkoscMax){
        predkoscMax = newPredkoscMax;
        
    }
    
    public double getPredkoscMax()
    {
        return predkoscMax;
    }
    
    public void setKolor(String newKolor) {
        kolor = newKolor;
    }
    public String getKolor()
    {
        return kolor;
    }
    
    public String probujPlywac(){
        return plywanieTypy.plyn();
    }
    
    public void setMozePlywac(Plywanie newPlywanieTypy){
        
        plywanieTypy = newPlywanieTypy;
    }
    
   
}
