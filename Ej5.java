public class Ej5 {
    public static void main(String[] args) {
        try {
            double d = 0.44;
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            System.out.println("El número es " + d);
            double j = 0.98;
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }//El número es 0,44 el 0,98 está fuera de rango
    }
}
