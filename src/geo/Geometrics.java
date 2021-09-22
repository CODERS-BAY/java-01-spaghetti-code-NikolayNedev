package geo;
public class Geometrics {

    public static void main(String[] args) {
        
    }
    public static double calculateSquareArea(double x) {
        double sum = x * x;
        return sum;
    }
    public static double calculatePerimeterArea(double x){
        double sum = 4 * x;
        return sum;
    }
    public static double calculateRectangleArea(double x, double y){
        double sum = x * y;
        return sum;
    }
    public static int calculateVolumes(int x){
        int sum = x * x;
        return sum;
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
