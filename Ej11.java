import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit=false;

        while (exit==false){
            try {

                System.out.println("Pulse 1 para recibir un número aleatorio");
                System.out.println("Pulse 2 para parecer que has hecho algo, pero no");
                System.out.println("Pulse 3 para hacer lo mismo que con el número 2");
                int num=sc.nextInt();
                switch (num){
                    case 1:
                        System.out.println(Math.random());
                        exit=true;
                        break;
                    case 2:
                        System.out.println("Gracias por pulsar 2, ahora estás en Matrix");
                        exit=true;
                        break;
                    case 3:
                        System.out.println("Has pulsado 3, gracias por no pulsar otro número");
                        exit=true;
                        break;
                    default:
                        System.out.println("Elige 1,2 o 3, gracias! ");
                }



            }catch (RuntimeException e){
                System.out.println("Valores NÚMERICOS, no me pongas letritas");
                sc.next();
            }
            System.out.println("Gracias por gastar una pulsación de tu teclado");


        }







    }
}
