package com.example.chiffrementaffine.alphabet;

public class Lettres {
    public static int Taille = 26;
    /**
     * @return cette function retourne une chaine de caractere contenant toute les lettres de l'alphabet
     */
    public static String touteLesLettres(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Taille; i++){
            stringBuilder.append((char)(i+'A'));
        }
        return stringBuilder.toString();

    }

    /**
     * @param chaine cette function prend en parametre une chaine de caracteres et retourne un
     *               un tableau contenant les numero corespondant a l'ordre de chaque lettre dans l'alphabet
     *               a partir de la lettre A
     * @return retoune un tableau d'entier
     */
    public static int[] convertieEnTableauDeChiffre(String chaine){
        int taille = chaine.length();
        int[] tab = new int[taille];
        for (int i =0; i < taille; i++) {
            tab[i] = chaine.charAt(i)+'A';
        }
        return tab;
    }

    /**
     * @param tab prend en parametre un un vecteur d'entier et retourne la chaine correspondant
     *            au code ASCII de chacun de ces nombre
     * @return string
     */
    public static String convertietableauIntEnString(int[] tab){
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : tab) {
            stringBuilder.append((char) (j - 'A'));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        touteLesLettres();
    }
}
