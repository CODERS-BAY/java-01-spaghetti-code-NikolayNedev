package geo;
public class Geometrics {

    public static void main(String[] args) {
        
    }
    public static double calculateSquareArea(double x) {
        return x * x;
        
    }
    public static double calculatePerimeterArea(double x){
       return 4 * x;
        
    }
    public static double calculateRectangleArea(double x, double y){
        return x + y;
    }
    public static int calculateVolumes(int x){
        return x * x;
       
    }
    public static double calculateZoneSphere(double z, double y , double x) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        
    }
    public static double calculateSphereCylinder(double z)  {
        return (Math.PI * Math.pow(z, 3) / 6);
        
    }
    public static double calculateUngula(int x, int z){
        return ((double) (2 * x * z) / 3);
    }

}
