package Ch8;

public class Final {
   public static void main (String[] args) {

       final float PI = 3.14214f;
//       PI = PI + 1;
//       Attempting to update a final variable results in compilation error.
       System.out.println("Value of final variable PI : " + PI);
    }
}
