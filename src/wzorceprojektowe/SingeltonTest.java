/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorceprojektowe;

/**
 *
 * @author katar
 */
public class SingeltonTest {
    
    public static void main(String[] args)
    {
        Singelton test1 = Singelton.getInstance();
        Singelton test2 = Singelton.getInstance();
        
        test1.name = "Rower";
        test2.name="Samochód";
        
        System.out.println(test1.name);
        System.out.println(test2.name);
    }
    
}
