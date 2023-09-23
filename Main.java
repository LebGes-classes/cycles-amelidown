import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        for(double i = 0.0; i < 1.2; i=i+0.1){
            double zn = Math.sin(i) + Math.sin(i*i)*Math.sin(i*i) + Math.sin(i*i*i)*Math.sin(i*i*i)*Math.sin(i*i*i);
            System.out.println(zn);
        }
    }
}
