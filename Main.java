import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner fromKey = new Scanner (System.in);

    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusCm = fromKey.nextInt();
    /*
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch2 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch3 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch4 = fromKey.nextInt();
    System.out.print("Please enter an integer radius measurement (in inches):" );
    int radiusInch5 = fromKey.nextInt();
    */

    

    

    double numValues = 5.0;
    
    System.out.println();
    System.out.print("Radius (in.) Radius(cm.) Volume(cu. cm.) Surface Area (cm. sq.)\n");
    System.out.print("-------------------------------------------------------------------");
    System.out.println();

    System.out.println(Sphere.volume(radiusCm));
  }
}