package ejercicio;
import java.util.Scanner;

public class GestionParqueAtracciones {
    public static void main(String[] args) {
        
        // Constantes para los colores 
        String ANSI_RESET = "\u001B[0m";   // Resetea el color
        String ANSI_GREEN = "\u001B[32m";  // Color verde
        String ANSI_YELLOW = "\u001B[33m"; // Color amarillo
        String ANSI_BLUE = "\u001B[34m";   // Color azul
        String ANSI_RED = "\u001B[31m";    // Color rojo

        // Array bidimensional de atracciones y las visitas de cada una de ellas
        Object[][] atraccionesVisitas = {
            {"Noria", 100},
            {"TioVivo", 80},
            {"Montaña Rusa", 260}
        };

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            // Mostramos el menu principal
            System.out.println(ANSI_BLUE + "\n=== MENÚ PRINCIPAL ===" + ANSI_RESET);
            System.out.println("1. Atracciones Disponibles");
            System.out.println("2. Agregar nuevas atracciones");
            System.out.println("3. Eliminar atracciones");
            System.out.println("4. Calcular Visitantes diarios promedio");
            System.out.println("5. Salir del programa");
            System.out.print("\nElige una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1: // Creamos bucle para mostrar las atracciones disponibles y sus visitas
                    System.out.println(ANSI_GREEN + "\n=== ATRACCIONES DISPONIBLES ===" + ANSI_RESET);
                    for (int i = 0; i < atraccionesVisitas.length; i++) {
                        System.out.println((i+1) + ". " + atraccionesVisitas[i][0] + 
                                         " - " + atraccionesVisitas[i][1] + " visitantes");
                    }
                    esperarEnter(entrada);
                    break;

                case 2: // Agregamos nuevas atracciones
                    System.out.println(ANSI_YELLOW + "\n=== AGREGAR NUEVA ATRACCIÓN ===" + ANSI_RESET);
                    //Creamos nuevo array con una posición más
                    Object[][] nuevoArrayAtraccionesVisitas = new Object[atraccionesVisitas.length + 1][2];
                    //Copiamos las existentes
                    for (int i = 0; i< atraccionesVisitas.length; i++){
                        nuevoArrayAtraccionesVisitas[i] = atraccionesVisitas[i];
                    }
                    
                    entrada.nextLine();
                    
                    System.out.print("Nombre de la atracción: ");
                    String nombreAtraccionNueva = entrada.nextLine();
                    
                    System.out.print("Número de visitantes: ");
                    int visitantesNuevaAtraccion = entrada.nextInt();

                    nuevoArrayAtraccionesVisitas[atraccionesVisitas.length][0] = nombreAtraccionNueva;
                    nuevoArrayAtraccionesVisitas[atraccionesVisitas.length][1] = visitantesNuevaAtraccion;

                    atraccionesVisitas = nuevoArrayAtraccionesVisitas;

                    System.out.println(ANSI_GREEN + "Atracción agregada!" + ANSI_RESET);

                    
                    esperarEnter(entrada);
                    break;


                case 3: // Eliminamos atracciones
                    System.out.println(ANSI_YELLOW + "\n=== ELIMINAR ATRACCIÓN ===" + ANSI_RESET);
                    System.out.println("Opción en desarrollo...");
                    esperarEnter(entrada);
                    break;

                case 4: // Calculamos promedio de visitantes
                    System.out.println(ANSI_YELLOW + "\n=== PROMEDIO DE VISITANTES DIARIOS ===" + ANSI_RESET);
                    System.out.println("Opción en desarrollo...");
                    esperarEnter(entrada);
                    break;

                case 5: // Salir del programa
                    System.out.println(ANSI_RED + "\nSaliendo del programa..." + ANSI_RESET);
                    break;

                default: // Validación de opción incorrecta
                    System.out.println(ANSI_RED + "\nOpción no válida. Intentalo de nuevo." + ANSI_RESET);
                    esperarEnter(entrada);
                    break;
            }
        } while (opcion != 5);

        entrada.close();
    }

    // Método para pausar la ejecución hasta que el usuario presione Enter 
    private static void esperarEnter(Scanner scanner) {
        System.out.println("\nPresione ENTER para volver al menú principal...");
        scanner.nextLine(); 
        scanner.nextLine(); 
        
    }
}