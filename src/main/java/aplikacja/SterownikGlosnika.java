package aplikacja;

public class SterownikGlosnika {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void showInfo(){
        int aktualnaTemp = stacjaPogodowa.getTemperatura();
        String aktualnyStan = stacjaPogodowa.getNaslonecznienie();
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + aktualnaTemp + " *C i jest " + aktualnyStan + ". To będzie dobry dzień!");
    }
}
