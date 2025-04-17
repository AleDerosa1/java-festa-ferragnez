package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        
        Scanner array = new Scanner(System.in);
        
        //ARRAY DI STRINGHE
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax","Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        
        System.out.println("Qual'è il tuo nome?");
        String nome = array.nextLine(); 
        System.out.println("Il nome che  hai appena inserito e': " + nome);


        String invitato = listaInvitati;

        //CICLO FOR
        boolean trovato = false;
        for(int i = 0; i < listaInvitati.length; i++){

            System.out.println(listaInvitati[i]);
           
            if (listaInvitati[i] == invitato){
                trovato = true;
            }

        }
       

        array.close();

    }
     
}
