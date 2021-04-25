public class Bedingungen {

  public boolean herrGallienIstToll = true;
  public boolean esIstMontag = false;

  public boolean informatikIstToll = herrGallienIstToll && esIstMontag;

  public int dieSummeAus2Und3 = this.sum(2, 3);

  // Sichtbarkeit (public) - Rückgabetypen (int) - Namen der Methode (sum) -
  // Argumente der Methode (int a, int b)
  public int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Bedingungen main = new Bedingungen();
    main.run();
  }

  public void run() {
    boolean esIstSonntag = true;
    System.out.println(this.informatikIstToll);
  }
}
