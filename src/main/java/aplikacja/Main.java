package aplikacja;

public class Main {
    public static void main(String[] args) {

        StacjaPogodowa stacjaPogodowa = new StacjaPogodowa();
        stacjaPogodowa.getTemperatura();
        stacjaPogodowa.getNaslonecznienie();
        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika(stacjaPogodowa);
        SterownikPieca sterownikPieca = new SterownikPieca(stacjaPogodowa);
        SterownikRolet sterownikRolet = new SterownikRolet(stacjaPogodowa);
        SmartHome home = new SmartHome(sterownikGlosnika, sterownikPieca, sterownikRolet);
        home.uruchomSterowniki();

    }
}
