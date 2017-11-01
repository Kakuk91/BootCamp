package BootCampProjects.BodyMassIndex.calculator;

public class Evaulation {

  public void evaulation(double index)
  {
    if(index <= 18.5)
      System.out.println("Ideje valamit enned!");
    else if(index >= 18.6 && index <= 24.9)
      System.out.println("Testömegindexet normális!");
    else if(index >= 25 && index <= 29.9)
      System.out.println("Vigyázz kezdessz bajban lenni a kiókkal!");
    else
      System.out.println("Ideje mozogni és diétázni egyet");
    
  }
  
}
