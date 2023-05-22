import java.util.List;

public class TDDSong {
    public static String cancion(List<String> animales) {
        String resultado = "", r1 = "", r2 = "", r3 = "";

        if (animales.size() >= 1) {
            r1 = "There was an old lady who swallowed a " + animales.get(0) + ".\n" +
                    "I don't know why she swallowed a " + animales.get(0) + " - perhaps she'll die!\n" ;
            resultado = r1;
        }

        if (animales.size() >= 2) {
            r2 = "\nThere was an old lady who swallowed a " + animales.get(1) + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + animales.get(1) + " to catch the " + animales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + animales.get(0) + " - perhaps she'll die!\n";
            resultado = r1 + r2;
        }

        if (animales.size() == 3) {
            r3 = "\n" + "There was an old lady who swallowed a " + animales.get(2) + ";\n" +
                    "How absurd to swallow a " + animales.get(2) + ".\n" +
                    "She swallowed the " + animales.get(2) + " to catch the " + animales.get(1) + ",\n" +
                    "She swallowed the " + animales.get(1) + " to catch the " + animales.get(0) + ";\n" +
                    "I don't know why she swallowed a " + animales.get(0) + " - perhaps she'll die!\n" +
                    "\n";
            resultado = r1 + r2 + r3;
        }
        return resultado;
    }

}