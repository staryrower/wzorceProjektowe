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
public class Singelton {
    private static Singelton instance = null;
    public String name;
    
    private Singelton()
    {
        System.out.println("Singelton create");
    }
    
    public static synchronized Singelton getInstance()
    {
        if(instance == null)
            instance = new Singelton();
        
        return instance;
    }
    
}
