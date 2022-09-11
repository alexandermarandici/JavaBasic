/**basic_41-42e
* Java Basic Home work 1
*
*@author Alexandru Marandici
*@todo 05.09.2022
*@date 06.09.2022
*/
class HomeWorkJavaOne {
    public static void main(String[] args) {
        
        // Task 1
        int a = 20;
        int b = 30;
        int c= (a + b) * 2;
        int d = a * b;
        System.out.println("Area = " + d);
        System.out.println("Perimetr = " + c);
        
    
        
        // Task 2
        
        int e = 5;
        int f = 3;
        System.out.printf("%d + %d = %d\n", e, f, e + f);
        System.out.printf("%d * %d = %d\n", e, f, e * f);
        System.out.printf("%d - %d = %d\n", e, f, e - f); 
        System.out.printf("%d / %d = %f\n", e, f, (float)e / f);
        
        // Task 3
        
        int[] array = {10, 20, 30, 40, 50};
        System.out.printf("[%d, %d, %d, %d, %d]\n", array[0], array[1], array[2], array[3], array[4]);
        
        
        
        // Task 4
        
        int Diametr = 27;
        double Radius = Diametr / 2d;
        double Area = Math.PI * Radius * Radius;
        double Calories = Area * 40;
        System.out.printf("Pizza %d cm in Diametr has %.2f Calories", Diametr, Calories);
        
        
        
        
        
        
    }
}