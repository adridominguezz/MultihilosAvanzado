/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multihavanzado;

    public class MultiHAvanzado extends Thread {

            long num1;
            long num2;
            int numeroHilo;


            public MultiHAvanzado (long num1, long num2, int numHilo){
                super();
                this.num1 = num1;
                this.num2 = num2;
                this.numeroHilo = numHilo;


            }

            @Override
            public void run(){
                long resultado = num1*num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado + " Y este es el hilo: " + numeroHilo);
                if (numeroHilo == 1){
                    System.out.println("Fin del programa");
                }
            }

            public static void main(String[] args) {

                MultiHAvanzado hilo1 = new MultiHAvanzado (2,3,1);
                MultiHAvanzado hilo2 = new MultiHAvanzado (2,4,2);
                MultiHAvanzado hilo3 = new MultiHAvanzado (2,5,3);
                MultiHAvanzado hilo4 = new MultiHAvanzado (2,6,4);
                MultiHAvanzado hilo5 = new MultiHAvanzado (2,7,5  );

                hilo1.start();
                hilo2.start();
                hilo3.start();
                hilo4.start();
                hilo5.start();


            }
        }

