package BootCampProjects.BodyMassIndex;

import junit.framework.TestCase;

public class appTest extends TestCase {

   double bodyMass = 10; 
   double height= 10;
   double bodyMassIndex = 0;
  
  public double CalculateBodyMassIndex()
  {
    double heightSquare = height * height;
    bodyMassIndex = bodyMass / heightSquare;
    return bodyMassIndex;
  }

   public void testBodyMassIndexMethod()
   {
    assertEquals(0.1,CalculateBodyMassIndex());
   }
   
   


}
