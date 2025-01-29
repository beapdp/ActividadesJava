package ejercicio;

public class Actividad5 {
    public static void main(String[] args) {
        // Ejemplo para la media de un conjunto de números enteros
        int[] numerosEnteros = {10, 20, 30, 40, 50};
        System.out.println("Media de enteros: " + calcular(numerosEnteros));

        // Ejemplo para la moda de un conjunto de número decimales
        double[] numerosDecimales = {1.1, 2.2, 2.2, 3.3, 1.1, 1.1};
        System.out.println("Moda de decimales: " + calcular(numerosDecimales));
    }

    // Función calcular para la media del array de enteros.
    public static double calcular(int[] numeros) {
        int suma = 0; //Creo una variable para acumular la suma de los números
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; // Suma cada número del array
        }
        return (double) suma / numeros.length; // Calcula la media y hacemos el retun con el resultado
    }

    // Función calcular para la moda del array de números decimales
    public static double calcular(double[] numeros) {
        double moda = numeros[0];//
        int maxFrecuencia = 0;

        for (int i = 0; i < numeros.length; i++) {
            int frecuencia = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    frecuencia++; // Cuenta cuántas veces aparece el número
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia; // Actualiza la frecuencia máxima
                moda = numeros[i]; // Actualiza la moda
            }
        }
        return moda; // Retorna el número más frecuente
    }
}
