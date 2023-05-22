import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {

    @Test
    public void test1() {
        List<String> animales = new ArrayList<>();
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal = "";
        assertEquals(cadenaFinal, cadenaActual);
    }

    @Test
    public void test2() {
        List<String> animales = Arrays.asList("fly");
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" ;
        assertEquals(cadenaFinal, cadenaActual);
    }

    @Test
    public void test3() {
        List<String> animales = Arrays.asList("spider");
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
        assertEquals(cadenaFinal, cadenaActual);
    }

    @Test
    public void test4() {
        List<String> animales = Arrays.asList("fly", "spider");
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal =  "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        assertEquals(cadenaFinal, cadenaActual);
    }

    @Test
    public void Test5() {
        List<String> animales = Arrays.asList("spider", "fly");
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal =   "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";
        assertEquals(cadenaFinal, cadenaActual);
    }

    @Test
    public void Test6() {
        List<String> animales = Arrays.asList("fly", "spider", "bird");
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n";
        assertEquals(cadenaFinal, cadenaActual);
    }

    @Test
    public void Test7() {
        List<String> animales = Arrays.asList("bird", "fly", "spider");
        String cadenaActual = TDDSong.cancion(animales);
        String cadenaFinal = "There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n";
        assertEquals(cadenaFinal, cadenaActual);
    }
}