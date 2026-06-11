package JAVA_theory;

import java.util.Random;
public class random {
    public static void main(String[] args){

        Random random=new Random();
        int n=random.nextInt();
        System.out.println(n);

        double v=random.nextDouble(.2,1.9);
        System.out.println(v);
    }
}
