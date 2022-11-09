import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner mioScanner;
    private GestioneJson gestioneJson;

    public Menu(){
        mioScanner=new Scanner(System.in);
        gestioneJson=new GestioneJson();
        mostraMenu();
    }

    public void mostraMenu(){
        System.out.println("-----------Benvenuto nell app-----------");
        System.out.println("Premere 1 per effettuare iscrizione DIPENDENTE");
        String scelta=ritornaSceltaMenu();
        sceltaComando(scelta);
    }

    public String ritornaSceltaMenu(){
        return mioScanner.nextLine();
    }

    public void sceltaComando(String comando) {
        switch (comando) {
            case "1":
                Persona p=inserisciPersona();
                JsonObject j=gestioneJson.ritornaOggettoJSON(p);
                HadoopManager.getInstance().appendRowInFile("ElencoPersone",j.toString());
                HadoopManager.getInstance().appendRowInFile("ElencoPersone","\n");
                break;
        }
    }

    public Persona inserisciPersona(){
        System.out.println("Inserisci il nome");
        String nome=mioScanner.nextLine();
        System.out.println("Inserisci il cognome");
        String cognome=mioScanner.nextLine();
        System.out.println("Inserisci il eta");
        int eta=mioScanner.nextInt();
        mioScanner.nextLine();
        System.out.println("Inserisci il luogo di abitazione");
        String luogoAbitazione=mioScanner.nextLine();
        System.out.println("Inserisci la provincia");
        String provincia=mioScanner.nextLine();
        System.out.println("Inserisci il numero di skill che vuoi inserire per questo utente");
        int numeroSkill=mioScanner.nextInt();
        mioScanner.nextLine();
        ArrayList<LinguaggioConosciuto> arrayLinguaggio=new ArrayList<>();
        for(int i=0;i<numeroSkill;i++){
            System.out.println("Inserisci il nome del linguaggio di programmazione:");
            String nomeLinguaggio=mioScanner.nextLine();
            System.out.println("Inserisci la descrizione del linguaggio di programmazione");
            String descrizioneLinguaggio=mioScanner.nextLine();
            System.out.println("Inserisci il livello di confidenza");
            int livelloConfidenza=mioScanner.nextInt();
            LinguaggioConosciuto linguaggioConosciuto=new LinguaggioConosciuto(nomeLinguaggio,descrizioneLinguaggio,livelloConfidenza);
            arrayLinguaggio.add(linguaggioConosciuto);
            mioScanner.nextLine();

        }

        Persona persona=new Persona(nome,cognome,eta,luogoAbitazione,provincia,arrayLinguaggio);
        return persona;
    }
}
