import java.util.Scanner;

public class Estrangulado {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String nombreOculto = "rolando";
        int intentosMax = 6;
        int intentos = 0;
        boolean nombreAcertado = false;

        //Arreglos
        char[] letrasAcertadas = new char[nombreOculto.length()];

        //Estructura de control de tipo: iteractiva (Bucle)
        for (int i = 0; i < letrasAcertadas.length; i++) {
            letrasAcertadas[i] = '_';
        }

        //Estructura de control de tipo: iteractiva (Bucle)
        while (!nombreAcertado && intentos < intentosMax) {
                                             // valueOf se usa con arrays de chars
            System.out.println("Adivina mi nombre " + String.valueOf(letrasAcertadas) + " (" + nombreOculto.length() + " letras)");
            System.out.println("Introduce una letra, porfavor");

            //Pedimos una letra usando la clase escaner
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;

            //Estructura de control de tipo: iteractiva (Bucle)
            for (int i = 0; i < nombreOculto.length(); i++) {
                //Estructura de control: condicional
                if (nombreOculto.charAt(i) == letra){
                    letrasAcertadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto, te quedan " + (intentosMax - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAcertadas).equals(nombreOculto)) {
                nombreAcertado = true;
                System.out.println("Felicidades!! acertaste mi nombre " + nombreOculto);
            }
        }

        if (!nombreAcertado) {
            System.out.println("------- GAME OVER -------");
            System.out.println("Te quedaste sin intentos");
        }

        scanner.close();

    }
}
