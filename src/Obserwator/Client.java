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
public class Client {
    
    public static void main(String[] args) {
        Blog blog = new Blog();
        
        User user = new User ("Marian");
        blog.register(user);
        
        
        
        
        blog.publishNewArticle();
        System.out.println("-----------");
        
//        User user2 = new User("Zbyszek");
//        blog.register(user2);
//        blog.publishNewArticle();
//        System.out.println("-----------");
//        
//        blog.unregister(user);
//        blog.publishNewArticle();
//        System.out.println("-----------");
                
    }
    
}
