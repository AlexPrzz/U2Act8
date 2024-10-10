public class Ej3 {
    public static void main(String[] args) {
        try {
            double d = Math.random();
            if (d > 0.95)
                throw new ArithmeticException(d + " está fuera de rango") ;
            System.out.println("El número es " + d);
            double j = Math.random();
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        try {
            double d = 0.98; //Al cambiar el random por un número concreto, siempre estará por encima del valor máximo.
            if (d > 0.95) //El valor máximo es 0.95, por lo que 0,98 está por encima.
                throw new ArithmeticException(d + " está fuera de rango") ;
            System.out.println("El número es " + d);
            double j = 0.44;
            if (j > 0.5)
                throw new ArithmeticException(j + " está fuera de rango") ;
            System.out.println("El número es " + j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
