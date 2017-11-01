package BootCampProjects.BodyMassIndex.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BodyMass {

  private double bodyMass;
  private double height;
  public String data;
  
  InputStreamReader r = new InputStreamReader(System.in);  
  BufferedReader br = new BufferedReader(r);
  
  public void readIn()
  {
    try {
      data =  br.readLine();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  public String getData() {
    return data;
  }
  public double getBodyMass() {
    return bodyMass;
  }
  public void setBodyMass(Double bodyMass) {
      this.bodyMass = bodyMass;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    
    this.height = height;
  }
  
  public static double CalculateBodyMassIndex(double bodyMass, double height)
  {
    double heightSquare = height * height;
    double bodyMassIndex = bodyMass / heightSquare;
    return bodyMassIndex;
  }
}
