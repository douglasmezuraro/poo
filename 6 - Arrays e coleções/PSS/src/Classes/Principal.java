package Classes;

import java.util.Random;

public class Principal {

    // Leia uma sequência de 10 número inteiros em um vetor
    // de 10 posições. Lido a sequência de 10 números, imprima
    // os valores da seguinte forma: Vetor[0] = 10, Vetor[1] = 9,
    // ... , Vetor[9] = 1. Use a estrutura de repetição for. 
    public static void firstExercise() {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        
        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = array.length - i;
        }
        
        for(int i = 0; i <= array.length - 1; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
    
    // Elabore um programa que dado dois vetores inteiros de 3
    // posições, leia estes vetores, calcule a expressão (vetor1-
    // vetor2), utilizando os valores de mesma posição,
    // armazenando o resultado em um terceiro vetor, também
    // de números inteiros de 3 posições. No final, imprima os
    // números ímpares do terceiro vetor.    
    public static void secondExercise() {
        final int ARRAY_LENGTH = 3;  
        final int MAX_RNG_VALUE = 500;
        int[] a = new int[ARRAY_LENGTH];
        int[] b = new int[ARRAY_LENGTH];
        int[] result = new int[ARRAY_LENGTH];
       
        Random rng = new Random();
        
        // popula o primeiro array
        for(int i = 0; i <= a.length - 1; i++)
            a[i] = rng.nextInt(MAX_RNG_VALUE);
        
        // popula o segundo array
        for(int i = 0; i <= b.length - 1; i++)
            b[i] = rng.nextInt(MAX_RNG_VALUE);
        
        // executa subtrações
        for(int i = 0; i <= result.length - 1; i++) 
            result[i] = a[i] - b[i];
        
        // printa somente os números pares
        for(int i = 0; i <= result.length - 1; i++) {
            if((result[i] % 2) != 0) {
                System.out.println("Array[" + i + "] = " + result[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("First Exercise:");
        firstExercise();
        System.out.println("");
        
        System.out.println("Second Exercise:");
        secondExercise();
        System.out.println("");
    }
    
}
