package aplikacja;
import java.util.Random;

public class StacjaPogodowa {
    private int temperatura;
    private String naslonecznienie;

    private Integer temp = null;
    private String naslon = null;

    public int getTemperatura() {
        if(temp == null){
        Random random = new Random();
        temp = random.nextInt(61)-25;
        temperatura = temp;
        }
        return temperatura;
    }

    public String getNaslonecznienie() {
        if(naslon == null){
        String[] tab = {"słonecznie", "pochmurno"};
        Random random = new Random();
        int i = random.nextInt(tab.length);
        naslon = tab[i];
        naslonecznienie = naslon;
        }
        return naslonecznienie;
    }
}
