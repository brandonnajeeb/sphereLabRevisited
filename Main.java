import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // scan functions that recieve radius in inches

    Scanner fromKey = new Scanner (System.in);
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch1 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch2 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch3 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch4 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch5 = fromKey.nextInt();

    // call to method to convert user generated radii

    double radiusCm1 = Sphere.convertRadius(radiusInch1);


    

    

    

    double numValues = 5.0;
    
    System.out.println();
    System.out.print("Radius (in.) Radius(cm.) Volume(cu. cm.) Surface Area (cm. sq.)");
    System.out.print("-------------------------------------------------------------------");
    System.out.println();

    System.out.printf("%f, %f\n", Sphere.volume(radiusInch1), Sphere.surfaceArea(radiusInch1));
    System.out.println(Sphere.volume(radiusInch2));
    System.out.println(Sphere.volume(radiusInch3));
    System.out.println(Sphere.volume(radiusInch4));
    System.out.println(Sphere.volume(radiusInch5));
    System.out.println(Sphere.volume(radiusCm1));
    
  }
}