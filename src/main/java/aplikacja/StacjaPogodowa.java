package aplikacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {
    private int temperatura;
    private String naslonecznienie;

    @Autowired
    public StacjaPogodowa(int temperatura, String naslonecznienie) {
        this.temperatura = temperatura;
        this.naslonecznienie = naslonecznienie;
    }

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
