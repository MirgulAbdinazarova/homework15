import java.util.Scanner;

public class Circle {

        private double pi;


       public Circle(double pi){
             this.pi=pi;

       }
       public static void area(double pi ){
          Scanner scanner=new Scanner(System.in);
          double r= scanner.nextDouble();
        double area=pi*(r*r);
           System.out.println(area);

       }
       public static void circumference(double pi,double r){
          double circumference=pi*2*r;
           System.out.println(circumference);
       }
       public double getPi(){
              return pi;
       }


}
