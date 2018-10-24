package lesson5ClassAndObject;

public class Good {
   private String titel;
   private int prise;

    public Good(String titel, int prise) {
        this.titel = titel;
        this.prise = prise;
    }
    public Good(){

    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getTitel() {
        return titel;
    }

    public int getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "Good{" +
                "titel='" + titel + '\'' +
                ", prise=" + prise +
                '}';
    }
}
