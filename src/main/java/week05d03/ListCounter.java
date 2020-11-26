package week05d03;

import java.util.List;

public class ListCounter {

    public int szamlalo(List<String> lista) {
        int osszesen = 0;
        for (String each : lista) {
            String elso = each.substring(0, 1);
            if (elso.toLowerCase().equals("a")){
                osszesen++;
        }
        }
        return osszesen;
    }
}
