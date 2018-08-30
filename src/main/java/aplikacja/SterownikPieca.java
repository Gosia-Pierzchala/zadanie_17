package aplikacja;

public class SterownikPieca {
    private StacjaPogodowa stacjaPogodowa;

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
