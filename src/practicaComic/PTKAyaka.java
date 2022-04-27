package practicaComic;

import imosh.Colors;
import imosh.Screen;

public class PTKAyaka extends Teyvatian implements PersonajeCallbacks {
    public PTKAyaka(String nombre, String raza, String genero, String elemento, int edad, boolean biologico, float estatura, float peso, String pais) {
        super(nombre, raza, genero, elemento, edad, biologico, estatura, peso, pais);
    }

    @Override
    public void presentacion(Screen s, String m) {
        s.setVisible(true);
        s.out(m,"Comic Sans MS", 17, Colors.TurqouiseTopaz);
        s.showImage("assets/comic/Ayaka.jpg");
    }
}
