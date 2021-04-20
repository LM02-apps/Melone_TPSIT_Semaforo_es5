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
public class ConsumaDato extends Thread{
    public static boolean stop=true;
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo s1, Semaforo s2) {
        pieno = s1;
        vuoto = s2;
    }

    public void run() {
        while (stop) {
            pieno.P();
            if (!stop==false)
            System.out.println("Lettore:dato letto" + dato);
            dato++;
            vuoto.V();
        }
    }
    public void ferma()
    {
        stop=false;
    }//fine run
}
