import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Introduce un valor positivo para la variable X:");
            int x=sc.nextInt();
            if (x<0)
                throw new ArithmeticException("ERROR: valor negativo en la coordenada X");
            if (x>=0)
                System.out.println("Bien, no eres tan tonto/a/e/x como pensaba");
            System.out.println("Introduce un valor positivo para la variable Y:");
            int y=sc.nextInt();
            if (y<0)
                throw new ArithmeticException("ERROR: valor negativo en la coordenada Y");
            if (y>=0)
                System.out.println("Oleeee, tampoco la has cagado aquí");


            System.out.println("Las coordenadas de tu tesoro están en X="+x+" Y="+y);


        }catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }



    }
}
