package practicaComic;

import imosh.Screen;

import java.awt.*;

public interface ComicCallbacks {
    void inicio(Screen s);
    void presentacion(Screen s);
    void secuencia(Screen s);
    void cuadro(Screen s, String img, String dialogo,String fontt, int size, Color fcolor, int stime);
    void pausa(int lapso);
}
