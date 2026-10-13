package Learnings.Java;

import java.util.stream.IntStream;

public class Calculus {
    public static void affiche(){
        System.out.println("Une fonction Java a été exécutée");
    }

    public static void affiche(String texte) {
        System.out.println(texte);
    }

    public static void affiche2() {
        int chiffre = 0;
        while(chiffre < 5) {
            System.out.println(chiffre);
            chiffre++;
        }
    }

    // Executer le code au moins une fois, même si la condition est fausse
    public static void affiche3() {
        int chiffre = 0;
        do {
            System.out.println(chiffre);
            chiffre++;
        } while(chiffre == 1);
    }

    public static int addition(final int entier1, final int entier2) {
        return entier1 + entier2;
    }

    public static void decompte(final int valeur){
        if(valeur >= 0){
            System.out.println(valeur);
            decompte(valeur - 1);
        }
    }

    public static void chiffreEgalAZero(final int valeur) {
        if(valeur == 0) {
            System.out.println("L’entier passé en paramètre vaut 0");
        } else {
            System.out.println("L’entier passé en paramètre est différent de 0");
        }
    }

    public static void compteJusquaDix() {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }

    // On utilise un stream pour compter jusqu'a dix
    public static void compteJusquaDix2() {
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }
}
