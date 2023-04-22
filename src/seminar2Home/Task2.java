package seminar2Home;

import java.io.FileNotFoundException;

public class Task2 {
    //Если необходимо, исправьте данный код (задание 2
    // https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    public static void main(String[] args) {
        resArr();
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void resArr(){
        try {
            int [] intArray = {5,6,8,10,15,25,5,6,9};
            int d = 0;
            double catchedRes1 = intArray[8]/ d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


}