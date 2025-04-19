package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        Scanner array = new Scanner(System.in);

        // ARRAY DI STRINGHE-LISTA INVITATI
        String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // MESSAGGIO DI BENVENUTO
        System.out.println("Benvenuto al Ferragnez-Party, mi dica il suo nome");

        // VARIABILE STRINGA-INSERIMENTO NOME DALL'UTENTE
        String nomeInserito = array.nextLine();
        System.out.println("Il nome che  hai appena inserito e': " + nomeInserito);

        // VARIABILE BOOLEANA
        boolean invitato = false;

        // CICLO FOR-SCORRIMENTO LISTA DEGLI INVITATI
        for (int i = 0; i < listaInvitati.length; i++) {

            // CONDIZIONI
            if (listaInvitati[i].equals(nomeInserito)) {
                invitato = true;
                break;
            }

        }

        if (invitato) {
            System.out.println("Il suo nome è presente nella lista degli invitati, si accomodi : " + nomeInserito);

        } else {
            System.out.println("Mi dispiace il suo nome non è presente nella lista degli invitati");
        }

        array.close();

    }

}
