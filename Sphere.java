  import java.util.Scanner;
  class Sphere {
     



  public static double volume (double radius)
  {
    // this will calculate volume using a given radius
    double volume = 4.0/3.0 * Math.PI * Math.pow (radius, 3.0);
    // volume will be returned
    return volume;
  } // end of volume} // end of class 
  
  

// this method will calculate surface area

  public static double surfaceArea (double radius2)
  {
    // this will calculate the surface area using a given // radius
    double surfaceArea = 4.0 * Math.PI * Math.pow(radius2, 2.0);
    // suface area will be returned
    return surfaceArea;
  } // end of surface area

  // this method will convert inches to centimeters



  public static double convertRadius (double radius3)

  {
    double conversionConstant = 2.54;
    double radiusCM = radius3 * conversionConstant;
    return radiusCM;
  } // end of conversion method

  // method that takes user input in inches

  public static int askUser (int inchInput)
  {
    Scanner fromKey = new Scanner (System.in);
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInput = fromKey.nextInt();
    return radiusInput;
  }

  
  
  }// end of shere
  


