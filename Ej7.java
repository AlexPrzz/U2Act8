public class Ej7 {
    public static void main(String[] args) {

        try {
            for (int k=0; k<5; k++)
                System.out.println(100/k);

        }catch (ArithmeticException e){
        System.out.println("Estás diviendo entre 0, pedazo de imbecil");
            e.printStackTrace();//Esto nos muestra el error en impresión de pantalla
        }

    }

}
