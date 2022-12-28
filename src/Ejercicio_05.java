public class Ejercicio_05 {
    static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                int numeroActual = matriz[y][x];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }

    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        // Si es la principal
        if (diagonal.equals("p")) {
            int x = 0, y = 0;
            while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++;
                y++;
            }
        } else {
            int x = 0, y = matriz.length - 1;
            while (x < matriz.length && y >= 0) {
                suma += matriz[y][x];
                x++;
                y--;
            }
        }
        return suma;
    }


    public static void main(String[] args) {
        // https://parzibyte.me/blog
        int[][] matriz = {
                {10, 5, 12},
                {98, 5, 6},
                {8, 4, 6},
        };
        System.out.println("La matriz es:");
        imprimirMatriz(matriz);
        int sumaPrincipal = sumarDiagonal(matriz, "p");
        int sumaSecundaria = sumarDiagonal(matriz, "s");
        System.out.printf("La suma de la diagonal principal es %d y la de la secundaria es %d\n", sumaPrincipal, sumaSecundaria);
    }
}