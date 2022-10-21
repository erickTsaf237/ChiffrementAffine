package com.example.chiffrementaffine.math;

import com.example.chiffrementaffine.alphabet.Lettres;

import java.util.Random;

public class mathematique {

    /**
     * @param nombre :prend en parametre une nombre et verifie s'il est premeier ou non
     * @return true s'il est premier et false sinon
     */
    public static boolean nombreEstPremier(int nombre){

        for(int i = 2; i < Math.sqrt(nombre); i++){
            if (nombre % i == 0)
                return false;
        }
        return true;
    }

    public static int pgcd(int a,  int b){
        if(a >= 0 && b >= 0){
            if (a == b)
                return a;
            else if (a > b)
                return pgcd(a%b, b);
            else
                return pgcd(a, b%a);
        }
        return -1;
    }

    /**
     * @return cette fonction s'assure de retourner un nombre premier compris entre 2 et Lettre.Taille (26)
     */
    public static int nombreAleatoirePremier(){
        int nombre = 0;
        Random random = new Random();
        do{
            nombre = random.nextInt() % Lettres.Taille;


        }while (!nombreEstPremier(nombre));
        return nombre;
    }

    /**
     * @return retourne un nombre premier avec Lettre.Taille
     */
    public static int nombreAleatoirePremierAvecTaille(){
        int nombre = 0;
        Random random = new Random();
        do{
            nombre = random.nextInt();

        }while (pgcd(nombre, Lettres.Taille) != 1);
        return nombre;

    }
}
