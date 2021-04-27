/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es5;
import java.util.concurrent.*;
/**
 *
 * @author gabbo
 */
public class main {
public static boolean STOP = true;
public static  LinkedBlockingQueue Buffer = new  LinkedBlockingQueue();
    
    public static void main(String[] args) throws InterruptedException
    {

        Produttore produttore1 = new Produttore();
        Produttore produttore2 = new Produttore();
        Consumatore consumatore1 = new Consumatore();
        Consumatore consumatore2 = new Consumatore();
        Consumatore consumatore3 = new Consumatore();
        
        Thread t1 = new Thread(consumatore1);
        Thread t2 = new Thread(consumatore2);
        Thread t3 = new Thread(consumatore3);
        Thread p1 = new Thread(produttore1);
        Thread p2 = new Thread(produttore1);
        p1.start();
        p2.start();
        t1.start();
        t2.start();
        t3.start();
        
        Thread.sleep(30000); //Tempo di Attesa prima di fermare ogni Thread
        STOP = false;        //Variabile che controlla i While dei Thread
        System.out.println("Termine Main");   
    } 
}