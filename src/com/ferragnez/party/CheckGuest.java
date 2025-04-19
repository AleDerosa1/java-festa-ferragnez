package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        
        Scanner array = new Scanner(System.in);
        
        //ARRAY DI STRINGHE
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax","Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        
        System.out.println("Qual'è il tuo nome?");
        String nome = array.nextLine(); 
        System.out.println("Il nome che  hai appena inserito e': " + "" + nome);


 
        //CICLO FOR
        boolean invitato = false;
        for(int i = 0; i < listaInvitati.length; i++){
            System.out.println(listaInvitati[i]);
           

            if (listaInvitati[i].equals(nome)){
                invitato = true;
                System.out.println("Il suo nome è presente nella lista,si accomodi : " + "" + nome);
                break;
            }else{
                System.out.println("Mi dispiace,il suo nome non è presente nella lista degli invitati");
                break;
            }

        }

        array.close();

    }
     
}
