package it.camp.comarch.egzamin;

public class Owoce {

    public static void Zakupy(int apple, int orange, int coins){
        if(coins == 0){
            System.out.println("Minimalna rożnica: " + Math.abs(apple - orange) );
            System.out.println("Ilość jabłek: " + apple);
            System.out.println("Ilość pomarańczy: " + orange );
        } else if(apple > orange){
            Zakupy(apple, orange + 1,coins - 1);
        } else {
            Zakupy(apple + 1, orange, coins - 1);
        }
    }

}
