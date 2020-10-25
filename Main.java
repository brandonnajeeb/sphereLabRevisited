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
    double radiusCm2 = Sphere.convertRadius(radiusInch2);
    double radiusCm3 = Sphere.convertRadius(radiusInch3);
    double radiusCm4 = Sphere.convertRadius(radiusInch4);
    double radiusCm5 = Sphere.convertRadius(radiusInch5);

    // table header
    System.out.println();
    System.out.print("Radius (in.) Radius(cm.) Volume(cu. cm.) Surface Area (cm. sq.)");
    System.out.println("-------------------------------------------------------------------");
    System.out.println();


    // print functions for each row of table

    System.out.printf("%f, %f, %f, %f %f\n", radiusInch1, radiusCm1, Sphere.volume(radiusInch1), Sphere.surfaceArea(radiusInch1));
    System.out.printf("%f, %f, %f, %f %f\n", radiusInch2, radiusCm2, Sphere.volume(radiusInch2), Sphere.surfaceArea(radiusInch2));
    System.out.printf("%f, %f, %f, %f %f\n", radiusInch3, radiusCm3, Sphere.volume(radiusInch3), Sphere.surfaceArea(radiusInch3));
    System.out.printf("%f, %f, %f, %f %f\n", radiusInch4, radiusCm4, Sphere.volume(radiusInch4), Sphere.surfaceArea(radiusInch1));
    System.out.printf("%f, %f, %f, %f %f\n", radiusInch5, radiusCm5, Sphere.volume(radiusInch5), Sphere.surfaceArea(radiusInch5));
    
    
  }
}