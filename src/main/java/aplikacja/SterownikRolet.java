package aplikacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
    private StacjaPogodowa stacjaPogodowa;

    @Autowired
    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void zaslonRolety() {
        String aktualnyStan = stacjaPogodowa.getNaslonecznienie();
        if (aktualnyStan.equals("słonecznie")) {
            System.out.println("Jest słonecznie. Zasłaniam rolety");
        } else {
            System.out.println("Jest pochmurno. Nie trzeba zasłaniać rolet");
        }
    }
}