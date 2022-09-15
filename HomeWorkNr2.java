/**
 * Java Basic Home work 2
 * 
 * @author Alexandru Marandici
 * @todo 07.09.2022
 * @date 15.09.2022
 */
class HomeWorkNr2 {
    public static void main(String[] args) {
        
        //task1
        System.out.println(checkWeather(-2));
        System.out.println(checkWeather(15));
        System.out.println(checkWeather(25));
        System.out.println(checkWeather(31));
        
        //task2
        System.out.println(canWalk (true, false)? "I can Walk" : "I cannot Walk");
        System.out.println(canWalk (true, true)?  "I can Walk" : "Weekend");
        System.out.println(canWalk (true, false)? "if not Rain" : "is Rain");
        
        //task3
        int a = 15;
        int b = 10;
        System.out.printf("%d + %d = %d\n", a, b, sum(a,b));
        System.out.printf("%d - %d = %d\n", a, b, sub(a,b));
        System.out.printf("%d * %d = %d\n", a, b, mul(a,b));
        System.out.printf("%d / %d = %f\n", a, b, div(a,b));
        
        //task4
        
        
    }
       
        static String checkWeather(int temperature) {
            if (temperature < 0) {
                return "Its Froast";
            } else if (temperature <= 18) {
                return "Its Cold" ;
            } else if (temperature <= 28) {
                return "Its Warm";
            } else { 
                return "Its Hot";
            }
        }
        
        static boolean canWalk(boolean isWeekend, boolean isRain) {
            return isWeekend && !isRain;
        }
        
        static int sum(int a, int b) {
            int result = a + b;
            return result;
        }
        static int sub(int a, int b) {
            int result = a - b;
            return result;
        }
        static int mul(int a, int b) {
            int result = a * b;
            return result;
        }
        
       static float div(float a, float b) {
           float result = a / b;
        return result;
        }
}