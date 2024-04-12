import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    int result = 0;
    for (Gizmo g : purchases){
      if (g.getMaker().equals(maker) && g.isElectronic()){
        result++;
      }
    }
    return result;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    Gizmo g1 = purchases.get(0);
    for (int pos = 1; pos < purchases.size(); pos++){
      Gizmo g2 = purchases.get(pos);
      if (g1.equals(g2)){
        return true;
      }
      g1 = g2;
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
