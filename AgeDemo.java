    import java.util.Scanner;
     
    class NegativeAgeException extends Exception {
     
     public NegativeAgeException(String str) {
      System.out.println(str);
     }
    }
    public class AgeDemo {
     
     public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter ur age : ");
      int age = s.nextInt();
      
      try {
       if(age < 0) 
        throw new NegativeAgeException("Negative values are not accepted for age");
       else
        System.out.println("Valid age");
      }
      catch (NegativeAgeException a) {
       System.out.println(a);
      }
     }
    }