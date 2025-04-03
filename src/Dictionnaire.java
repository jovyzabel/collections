import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Video 26:
        HashMap : Pas de doublons (sauf valeur), pas thread-safe, accès direct, ici l'ordre n'a pas d'importance (seulement une clé et ou une valeur nulle)
        TreeMap : Pas de doublons,  pas thread-safe, accès direct, ordonnée, ici l'ordre est important, données nulles seulement les valeurs


        role : Un dictionnaire permet d'associer des clés avec des valeurs.
 */
public class Dictionnaire {
    public Dictionnaire(){
        System.out.println("--------------Dictionnaire--------------");
    }

    public void show(){
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("1", "Oumou");
        hm.put("2", "Sidonie");
        hm.put("15", "Nicodeme");
        hm.put("3", "Serge");

        System.out.println(hm.get("15"));

        if (hm.containsValue("Oumou"))
            for (String key : hm.keySet())
                System.out.println(key);

        hm.clear();

        System.out.println("**********TreeMap*************");

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(1, "Djimo");
        tm.put(2, "Fatima");
        tm.put(15, "Rodrigue");
        tm.put(7, "Warda");

        for (Map.Entry<Integer, String> entry : tm.entrySet()){
            System.out.println("Clés: "+entry.getKey()+", Valeur: "+entry.getValue());
        }

    }
}
