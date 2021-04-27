/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es5;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gabbo
 */
public class Consumatore implements Runnable{

    
    
    public Consumatore()
    {
        
    }
    
    synchronized public void run()
    {      
        int i = 0;
        
        
        while(main.STOP)      
        {
            for(i = 0; i < main.Buffer.size(); i++)
            {
               
                try {
                    System.out.println("Consumatore: " + Thread.currentThread().getName() + " Lettura Dato: " + main.Buffer.take());  //Stampa il numero letto
                } catch (InterruptedException ex) {
                    Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                try 
                {
                    Thread.sleep(3000);     //Aspetta dei secondi per dare tempo al produttore di riempire il buffer
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(Consumatore.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
 }

