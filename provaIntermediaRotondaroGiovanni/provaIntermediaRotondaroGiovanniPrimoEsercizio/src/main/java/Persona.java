

import com.google.gson.JsonObject;

import java.util.ArrayList;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String luogoAbitazione;
    private String provincia;
    private ArrayList<LinguaggioConosciuto> linguaggioConosciuto;

    public Persona(String nome,String cognome,int eta,String luogoAbitazione,String provincia,ArrayList<LinguaggioConosciuto>linguaggioConosciuto){
        this.nome=nome;
        this.cognome=cognome;
        this.eta=eta;
        this.luogoAbitazione=luogoAbitazione;
        this.provincia=provincia;
        this.linguaggioConosciuto=linguaggioConosciuto;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getLuogoAbitazione() {
        return luogoAbitazione;
    }

    public ArrayList<LinguaggioConosciuto> getLinguaggioConosciuto() {
        return linguaggioConosciuto;
    }

    public String getProvincia() {
        return provincia;
    }
}
