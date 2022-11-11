
import java.awt.Rectangle;
import java.util.Scanner;

    public class Q1
    {
        public static void main(String[] args) {

            Rectangle R = new Rectangle();
            Scanner in = new Scanner (System.in);

            System.out.print("enter  width : ");
            R.width = in.nextInt();
            System.out.print(" enter  Height : ");
            R.height = in.nextInt();

            System.out.println("the perimeter = : " + 2*(R.getWidth() + R.getHeight()));
        }
}
