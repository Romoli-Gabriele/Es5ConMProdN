/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es5;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabbo
 */
public class Produttore implements Runnable{
    
    int datiGenerati = 10;
    
   
    public Produttore()
    {
        
    }
    
    public void run()
    {   
        int n = 0;
        int i = 0;

        Random rand = new Random();        
        
        while(main.STOP)           
        {
            
            if(main.Buffer.isEmpty())        
            {
                for(i = 0; i < datiGenerati; i++)
                {    
                    try {
                                          
                        n = rand.nextInt(50);                                          
                        main.Buffer.put(n);                                 
                        System.out.println("Produttore: Numero Generato: " + n);      
                                                                                       
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try 
            {
                Thread.sleep(5000);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Produttore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}