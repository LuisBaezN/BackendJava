package practicaComic;

import imosh.Colors;
import imosh.Screen;

import java.awt.*;

public class CGenshin extends Comic implements ComicCallbacks{
    public CGenshin(String empresa, String serie, String genero, int numero, int dia, int mes, int anio) {
        super(empresa, serie, genero, numero, dia, mes, anio);
    }

    @Override
    public void inicio(Screen s) {
        s.setVisible(true);
        s.setBounds(500,50,798,1000);
        s.showImage("assets/comic/genshin-impact-logo.png");
        s.out("\n\nBienvenido al mundo de Teyvat!\n\nEn este comic " +
                "experimentarás la historia de transfondo de " +
                "Kamisato Ayaka, una importante integrante del " +
                "gobierno de Inazuma, quien a una muy corta edad perdió a sus padres. " +
                "Vive en un país compuesto por islas junto a su hermano mayor, Ayato." +
                "\n\nEsperamos disfrutes esta corta historia.\n\n",
                "Comic Sans MS",17, Colors.LighterPurple);
        s.showImage("assets/comic/Inazuma.png");
    }

    @Override
    public void presentacion(Screen s) {
        s.cls();
        s.setVisible(true);
        s.setBounds(600,50,645,970);
    }

    @Override
    public void secuencia(Screen s) {
        s.cls();
        s.setVisible(true);
        s.setBounds(230,50,1530,970);
    }

    public void cuadro(Screen s, String img, String dialogo,String fontt, int size, Color fcolor, int stime){
        s.cls();
        s.showImage(img);
        s.out(dialogo,fontt,size,fcolor);
        try {
            Thread.sleep(stime);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public void pausa(int lapso){
        try {
            Thread.sleep(lapso);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
