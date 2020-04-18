/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obserwator;

/**
 *
 * @author katar
 */
public class User implements Observer{
    
    private String name;
    private int newArticle;
    
    public User(String name) {
        this.name = name;
        newArticle = 0;
    }
    
    @Override
    
    public void update(){
        newArticle++;
        System.out.println("Cześć " + name + "Jest nowy artykuł na blogu " + newArticle + " artykułów do przeczytania");
    }
    
    
    
}
