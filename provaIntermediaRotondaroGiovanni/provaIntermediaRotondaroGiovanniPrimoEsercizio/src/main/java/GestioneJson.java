import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class GestioneJson {

    public GestioneJson(){}

    public JsonObject ritornaOggettoJSON(Persona p){
        JsonObject j=new JsonObject();
        j.addProperty("nome",p.getNome());
        j.addProperty("cognome",p.getCognome());
        j.addProperty("eta",p.getEta());
        j.addProperty("provincia",p.getProvincia());
        j.addProperty("luogoAbitazione",p.getLuogoAbitazione());
        JsonArray js=new JsonArray();
        System.err.println(p.getLinguaggioConosciuto().size());
        for(LinguaggioConosciuto l:p.getLinguaggioConosciuto()){
            JsonObject j1=new JsonObject();
            j1.addProperty("nomeLinguaggio",l.getNomeLinguaggio());
            j1.addProperty("descrizioneLinguaggio",l.getDescrizione());
            j1.addProperty("livelloConfidenza",l.getLivelloConfidenza());
            js.add(j1);
        }
        j.add("Linguaggio",js);
        return j;
    }
}
