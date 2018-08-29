package aplikacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    private StacjaPogodowa stacjaPogodowa;

    @Autowired
    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void uruchomPiec(){
        int aktualnaTemp = stacjaPogodowa.getTemperatura();
        if(aktualnaTemp < 15){
            System.out.println("Ze względu na temperaturę poniżej 15*C, uruchamiam piec");
        } else {
            System.out.println("Jest ciepło. Nie uruchamiam pieca");
        }
    }
}
