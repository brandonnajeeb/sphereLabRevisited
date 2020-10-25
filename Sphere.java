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

  public static double surfaceArea (double radius)
  {
    // this will calculate the surface area using a given // radius
    double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2.0);
    // suface area will be returned
    return surfaceArea;
  } // end of surface area



  // this method will convert inches to centimeters

  public static double convertRadius (double radius)

  {
    double conversionConstant = 2.54; // inches per cm
    double radiusCM = radius * conversionConstant;
    return radiusCM;
  } // end of conversion method



  // method that takes user input in inches

  public static int askUser ()
  {
    Scanner fromKey = new Scanner (System.in);
    System.out.print("Please enter an integer radius measurement (in inches):" ); //print statement to user
    int radiusInput = fromKey.nextInt(); // capture input
    return radiusInput;
  } // end of scanner method



  // method that prints out table by row
/*
  public static void printRow (int radiusIn, double radiusCm1)
  {
    
    System.out.printf("%d %14.2f %13.2f %15.2f\n", radiusIn, radiusCm, Sphere.volume(radiusCm1), Sphere.surfaceArea(radiusCm1));
  }
*/
  
  
  }// end of shere
  


