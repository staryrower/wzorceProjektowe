/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obserwator;

import java.util.ArrayList;

/**
 *
 * @author katar
 */
public class Blog implements Subject {
    
    private ArrayList<Observer> observerList;

    public Blog() {
        observerList = new ArrayList<>();
    }
    public void publishNewArticle(){
        System.out.println("Blog: Opublikowano nowy artykuł");
        notifyObservers();
    }
    
    

    @Override
    public void register(Observer o) {
       observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
       for(Observer o : observerList) {
           o.update();
       }
    }
    
}
