public class Tier {
  public boolean istFleischfresser;
  public String gattung;
  public boolean legtEier;

  public void essen(String artDesEssens) {
    if (!istFleischfresser) {
      if (artDesEssens == "Fleisch") {
        System.out.println("Das Tier ist unzufrieden mit dem Futter!");
      } else {
        System.out.println("Das Tier ist" + artDesEssens);
      }
    }
  }
}
