public class LinguaggioConosciuto {
    private String nomeLinguaggio;
    private String descrizione;
    private int livelloConfidenza;

    public LinguaggioConosciuto(String nomeLinguaggio,String descrizione,int livelloConfidenza){
        this.nomeLinguaggio=nomeLinguaggio;
        this.descrizione=descrizione;
        this.livelloConfidenza=livelloConfidenza;
    }

    public String getNomeLinguaggio() {
        return nomeLinguaggio;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getLivelloConfidenza() {
        return livelloConfidenza;
    }
}
