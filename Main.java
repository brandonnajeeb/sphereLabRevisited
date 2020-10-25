/* README! Program that prompts a user for 5 values in inches, the program converts those inches to centimeters and assigns them to a value radius. This radius is used to calculate the volume and surface area of the respective spheres 
Brandon Najeeb
10/25/20 
*/


import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // call to scan method in sphere to get user input

    int radiusInch1 = Sphere.askUser(); 
    int radiusInch2 = Sphere.askUser(); 
    int radiusInch3 = Sphere.askUser(); 
    int radiusInch4 = Sphere.askUser(); 
    int radiusInch5 = Sphere.askUser(); 
    
    // call to method to convert user generated radii

    double radiusCm1 = Sphere.convertRadius(radiusInch1);
    double radiusCm2 = Sphere.convertRadius(radiusInch2);
    double radiusCm3 = Sphere.convertRadius(radiusInch3);
    double radiusCm4 = Sphere.convertRadius(radiusInch4);
    double radiusCm5 = Sphere.convertRadius(radiusInch5);

    // table header
    System.out.println();
    System.out.print("Radius (in.) Radius(cm.) Volume(cu. cm.) Surface Area (cm. sq.)    ");
    System.out.println("-------------------------------------------------------------------");
    System.out.println();


    // print functions for each row of table
    Sphere.printRow(radiusInch1, radiusCm1);
    Sphere.printRow(radiusInch2, radiusCm2);
    Sphere.printRow(radiusInch3, radiusCm3);
    Sphere.printRow(radiusInch4, radiusCm4);
    Sphere.printRow(radiusInch5, radiusCm5);
    
    
    
  }
}