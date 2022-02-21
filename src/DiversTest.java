import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


public class DiversTest {

    @ParameterizedTest(name = "{0} doit etre plus grand que {1} && {2}")
    @CsvSource({
            "87,7,34",
            "142, 34, 141",
            "700, 642, 75"
    })
    void lePlusGrand(int arg1, int arg2, int arg3) {
         boolean actualResult = Divers.lePlusGrand(arg1, arg2, arg3) == arg1;

         assertTrue(actualResult);
    }

    // Test est plus Grand
    /*
    @ParameterizedTest(name = "{0} > {1} est plus grand")
    @CsvSource({
            "3, 6",
            "4, 9",
            "6, 3"
    })
    void estPlusGrand(int arg1, int arg2){assertTrue(Divers.estPlusGrand(arg1,arg2));}

    void  estPluaPetit(int arg1, int arg2){assertFalse(Divers.estPlusGrand(arg1,arg2));

     */

    // Test pour estPair
   /*
    * @ParameterizedTest(name = "{0} % 2 est pair")
    @ValueSource (ints ={2, 4, 6, 8, 10, 12, 13})
        void estPair(int arg) { assertTrue(Divers.estPair(arg));}

    void estImpair(int arg) { assertFalse(Divers.estPair(arg));} */

    //Test pour estReussite
    /*
    @ParameterizedTest(name = "{0} est Reussite")
    @ValueSource(ints = {60, 65, 100 , 515 , Integer.MAX_VALUE})
    void estPositif_True(int arg){ assertTrue (Divers.estReussite(arg));}

    @ParameterizedTest(name = "{0} est negatif")
    @ValueSource(ints = {59, -4, 62, 1, - Integer.MAX_VALUE})
    void estPositif_False(int arg){ assertFalse(Divers.estReussite(arg));}

    void estReussite(int note){

    }*/

    //Test pour exposantDeux
    /*
    @ParameterizedTest(name = "{0} * {0} doit donner {1}")
    @CsvSource({
            "5, 25",
            "6, 36",
            "7, 49"
    })
    void exposantDeux(int nb, int expectedResult){
        int actualResult = Divers.exposantDeux(nb);

        assertEquals(expectedResult, actualResult);

     */
    }