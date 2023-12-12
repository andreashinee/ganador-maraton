public class exercici14 {
    public static void main(String[] args) {
        // Definició de l'array bidimensional amb les dades dels corredors
        int[][] dadesCorredors = {
                //posicions de la array: (0: dorsal, 1:sexe, 2:edat, 3:temps)
                {3457, 1, 51, 52},
                {3467, 1, 32, 41},
                {3568, 0, 14, 57},
                {3570, 0, 12, 63},
                {3571, 1, 45, 63},
                {3572, 0, 17, 46},
                {3573, 0, 12, 44},
                {3574, 0, 30, 42},
                {3575, 1, 24, 77},
                {3576, 0, 57, 48}
        };

        // A) Llistat de tots els corredors
        System.out.println("Llistat de tots els corredors:");
        llistarCorredors(dadesCorredors);

        // B) Trobar el guanyador i la guanyadora per sexe
        int[] guanyadorHome = trobarGuanyadorPerSexe(dadesCorredors, 0);
        int[] guanyadoraDona = trobarGuanyadorPerSexe(dadesCorredors, 1);

        // Mostrar resultats
        System.out.println("\nGuanyador (home):");
        mostrarCorredor(guanyadorHome);

        System.out.println("\nGuanyadora (dona):");
        mostrarCorredor(guanyadoraDona);
    }

    // Funció per mostrar el llistat de tots els corredors
    private static void llistarCorredors(int[][] dadesCorredors) {
        for (int[] corredor : dadesCorredors) {
            mostrarCorredor(corredor);
        }
    }

    // Funció per trobar el guanyador o guanyadora per sexe
    private static int[] trobarGuanyadorPerSexe(int[][] dadesCorredors, int sexe) {
        int millorTemps = Integer.MAX_VALUE;
        int[] guanyador = null;

        for (int[] corredor : dadesCorredors) {
            //posem per corredor la posició 1 de l'array que determina el sexe
            // i la posició número 3 de la array per a determinar el minim temps
            if (corredor[1] == sexe && corredor[3] < millorTemps) {
                millorTemps = corredor[3];
                guanyador = corredor;
            }
        }

        return guanyador;
    }

    // Funció per mostrar les dades d'un corredor
    private static void mostrarCorredor(int[] corredor) {
        //determinem els valors de la array
        System.out.println("Dorsal: " + corredor[0] + ", Sexe: " + corredor[1] +
                ", Edat: " + corredor[2] + ", Minuts: " + corredor[3]);
    }
}
