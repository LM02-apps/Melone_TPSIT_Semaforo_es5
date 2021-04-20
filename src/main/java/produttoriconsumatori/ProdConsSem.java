/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produttoriconsumatori;

/**
 *
 * @author informatica
 */
public class ProdConsSem {
    protected static int buffer;
    public static void main(String args[])
    {
     Semaforo pieno=new Semaforo(0);
     Semaforo vuoto=new Semaforo(1);
     //tre produttori e consumatori, quindi:
     ProduciDato prod1=new ProduciDato(pieno,vuoto);
     ProduciDato prod2=new ProduciDato(pieno,vuoto);
     ProduciDato prod3=new ProduciDato(pieno,vuoto);
     ConsumaDato cons1=new ConsumaDato(pieno,vuoto);
     ConsumaDato cons2=new ConsumaDato(pieno,vuoto);
     ConsumaDato cons3=new ConsumaDato(pieno,vuoto);
     prod1.start();
     cons1.start();
     
     prod2.start();
     cons2.start();
     
     prod3.start();
     cons3.start();
     System.out.println("Main:Termine avvio thread.");
    }
}
