package controle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int in1, in2;
        Scanner scan = new Scanner(System.in);

        try {
            in1 = scan.nextInt();
            in2 = scan.nextInt();

            if(in1< in2) {
                for (int i = in1; i<(in2+1); i++) System.out.println(i);
            }else{
                throw new ParametrosInvalidosException(in1 + " é maior que " + in2);
            }

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}