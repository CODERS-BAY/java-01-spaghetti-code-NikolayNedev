package geo;

import java.util.Scanner;

public class Geometrics {

    public static void main(String[] args) {



       square();
       rectangle();

    
    }
    public static int calculateSquareArea(int x, int y) {
        int sum = x * y;
        return sum;
    }
    public static int calculatePerimeterArea(int x){
        int sum = 4 * x;
        return sum;
    }
    public static int calculateRectangleArea(int x){
        int sum = x * x;
        return sum;
    }
    public static int calculateVolumes(int x2){
        int sum = x2 * x2;
        return sum;
    }
    public static int calculateZoneSphere(double v) {
        System.out.println("Zone of a sphere");
         v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        return v;
    }
    public static int  calculateSphereCylinder(int x) {
        x = (Math.PI * Math.pow(z, 3) / 6);
        return x;
    }
    public static int calculateUngula(double x){
         x =((double) (2 * x3 * z3) / 3);
         return x;
    }

}
