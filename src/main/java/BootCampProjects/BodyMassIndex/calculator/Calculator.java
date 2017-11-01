package BootCampProjects.BodyMassIndex.calculator;
import java.io.IOException;

public class Calculator  {
  
  private static double height = 0, weight = 0;
  private static String inMass = "";
  private static String inHeight ="";
  private static Evaulation eva;
  
  
  public static void main(String[] args) throws IOException {
    eva = new Evaulation();
    BodyMass body = new BodyMass();
    
    massAndHeight();
    try {
    weight = Double.parseDouble(inMass);
    body.setBodyMass(weight);
    height = Double.parseDouble(inHeight);
    body.setHeight(height);
    }catch(Exception e) {
      System.out.println("Nem jó adatot adtál meg, kérlek add meg újra számmal az értékeid: ");
      massAndHeight();
    }
    double bodyMassIndex = 0.0;
    bodyMassIndex = BodyMass.CalculateBodyMassIndex(Double.parseDouble(inMass), Double.parseDouble(inHeight));
    System.out.print("Az Ön testtömegindexe: " + bodyMassIndex);
    System.out.println("");
    eva.evaulation(bodyMassIndex);
  }
 public static void massAndHeight()
 {
   BodyMass body = new BodyMass();
   System.out.println("Adja meg testsúlyát: ");
   body.readIn();
   inMass = body.getData();
   System.out.print("Adja meg magasságát: ");
   body.readIn();
   inHeight = body.getData();
  
 }
}
