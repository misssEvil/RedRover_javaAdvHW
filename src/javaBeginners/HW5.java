package javaBeginners;
import java.text.DecimalFormat;
import java.util.Arrays;

import Common.Printing;

//Все результаты вашей работы необходимо выводить на печать с номером задания.
// Результаты должны быть протестированы, для этого необходимо создать
// метод с названием verifyEquals(expectedResult, actualResult)

public class HW5 {

    public static String dayOfWeek(int day){
        String [] weekDays = new String[] {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return "It's " + weekDays[(day -1)] ;
    }

    public static Integer largestValue(int x, int y, int z){

        int [] array = new int[] {x, y,z};
        Arrays.sort(array);
        return array[2];
    }

     public static Integer smallestValue(int a, int b, int c){
        int smallest;
        if ( b > a && c > a ){
            smallest = a;
        }
        else if ( a > b && c > b){
            smallest = b;
        }
            else smallest = c;
        return smallest;
    }

    public static Integer smallestValue2(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }

    public static Double avgTemp(double a, double b, double c, double d, double e){
        double sum = 0;
        double[] temp = new double[] {a, b, c, d, e};
        for (double v : temp) {
            sum += v;
        }
        return sum / temp.length;
    }

    public static String printPrice(float a){
        DecimalFormat dkop = new DecimalFormat("#");
        return (int) a + " rub " + dkop.format(a * 100 - (int) a * 100 ) +  " kop";
    }

    public static String printQuantity(float a){
        DecimalFormat dgramm = new DecimalFormat("#");
        return (int) a + " kg " + dgramm.format(a * 1000 - (int) a * 1000 ) +  " gr";
    }

    public static Double findTotal(double price, double quantity){
        return price * quantity;
    }

    public static String printReceipt(String itemName, float price, double quantity)  {
        DecimalFormat dnum = new DecimalFormat("#.##");
        return itemName + "\n"
                + "Price "
                + "Quantity "

                ;






    }








    }











