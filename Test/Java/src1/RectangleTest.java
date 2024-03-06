package src1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {


    @Test
    public void testGetLado() {
        Rectangle miRectangulo = new Rectangle(5, 10);
        float ladoEsperado = 10;
        float ladoReal = miRectangulo.getLado();
        assertEquals(ladoEsperado, ladoReal, 0.001);
    }

    @Test
    public void testSetLado() {
        Rectangle miRectangulo = new Rectangle(5, 10);
        float nuevoLado = 15;
        miRectangulo.setLado(nuevoLado);
        float ladoActualizado = miRectangulo.getLado();
        assertEquals(nuevoLado, ladoActualizado, 0.001);
    }

    @Test
    public void testGetAncho() {
        Rectangle miRectangulo = new Rectangle(5, 10);
        float anchoEsperado = 5;
        float anchoReal = miRectangulo.getAncho();
        assertEquals(anchoEsperado, anchoReal, 0.001);
    }

    @Test
    public void testSetAncho() {
        Rectangle miRectangulo = new Rectangle(5, 10);
        float nuevoAncho = 8;
        miRectangulo.setAncho(nuevoAncho);
        float anchoActualizado = miRectangulo.getAncho();
        assertEquals(nuevoAncho, anchoActualizado, 0.001);
    }
    @Test
    public void testGetArea() {
        Rectangle miRectangulo = new Rectangle(5, 10);

        // área esperada
        float areaEsperada = 5 * 10;

        // Obtener el área real del rectángulo
        float areaReal = miRectangulo.getArea();

        // Verificar si el área calculada coincide con el valor esperado
        assertEquals(areaEsperada, areaReal, 0.001); //Para errores de redondeo
    }

    @Test
    public void testGetPerimeter() {
        // Crear un rectángulo con ancho 5 y lado 10
        Rectangle miRectangulo = new Rectangle(5, 10);

        // Calcular el perímetro esperado (2 * ancho + 2 * lado)
        float perimetroEsperado = 2 * 5 + 2 * 10;

        // Obtener el perímetro real del rectángulo
        float perimetroReal = miRectangulo.getPerimeter();

        // Verificar si el perímetro calculado coincide con el valor esperado
        assertEquals(perimetroEsperado, perimetroReal, 0.001); // Para errores de redondeo
    }
}
