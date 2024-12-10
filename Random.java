
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(myRandom());
    }
    public static boolean random() {

   int num = (int) (Math.random()*10);
       if (num %2 ==0){
           return true;
       } else {
           return false;
       }
    }
    public static int myRandom() {
        boolean res= random() || random();
        if (res == true) {
            return 1;
        } else {
            return 0;
        }
    }

}

