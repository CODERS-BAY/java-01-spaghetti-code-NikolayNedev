package geo;

import java.util.Scanner;

public class Geometrics {

    public static void main(String[] args) {
    
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
    public static double calculateZoneSphere(double z, double y , double x) {
        System.out.println("Zone of a sphere");
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        
    }
    public static double calculateSphereCylinder(double z)  {
        return (Math.PI * Math.pow(z, 3) / 6);
        
    }
    public static double calculateUngula(double x, double z){
         return ((double) (2 * x * z) / 3);
         
    }

}
