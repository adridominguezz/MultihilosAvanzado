/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multihiloavanzado;

/**
 *
 * @author Adri
 */
class MultiplicacionHilosThread extends Thread{
    private long num1;
    private long num2;
    private int numHilo;

    public MultiplicacionHilosThread(long num1, long num2, int numHilo) {
        this.num1 = num1;
        this.num2 = num2;
        this.numHilo = numHilo;
    }

    public void run() {
        long resultado = num1 * num2;
        System.out.println("Hilo " + numHilo + ": El resultado de la multiplicación es " + resultado);
    }
}
public class creacionHilosThread extends Thread {
    
        public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            long numero1 = i * 2; // Ejemplo: números para la multiplicación
            long numero2 = i * 3;

            MultiplicacionHilosThread hilo = new MultiplicacionHilosThread(numero1, numero2, i);
            hilo.start();
        }

        System.out.println("Final de programa");
    }
}
