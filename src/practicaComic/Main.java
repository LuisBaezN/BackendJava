package practicaComic;

import imosh.Colors;
import imosh.Dialog;
import imosh.Screen;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Runnable sec = () -> { // Runnable sec = new Runnable() {
            Screen ventana = new Screen();
            Dialog d = new Dialog();
            String ka, to, f;
            Color cka, cto;
            int s, opcion;

            CGenshin com = new CGenshin("Hoyoverse", "Genshin Impact","Aventura",37,
                    25,4,2022);
            PTKAyaka p01 = new PTKAyaka("Kamisato Ayaka","Humano", "Femenino", "Cryo", 16,
                    true,156, 47.3f,"Inazuma");
            PTKAyato p02 = new PTKAyato("Kamisato Ayato", "Humano", "Masculino", "Hydro", 22,
                    true, 182, 79.1f, "Inazuma");

            s = 37;
            ka = p01.getNombre();
            to = p02.getNombre();
            f = "Comic Sans MS";
            cka = Colors.TurqouiseTopaz;
            cto = Colors.RoyalBlue;

            // Inicio: información del comic
            com.inicio(ventana);

            com.pausa(14000); // 14000

            // Presentación de los personajes
            com.presentacion(ventana);
            p01.presentacion(ventana, p01.showFeaturesPT(p01.showFeaturesP(), true));
            p02.presentacion(ventana, p02.showFeaturesPT(p02.showFeaturesP(), true));

            com.pausa(12000); // 12000

            opcion = d.confirm("¿Desea continuar leyendo la información de los personajes?\nSi es así, se agregarán " +
                            "10 segundos más a esta página.","Información");

            // Desarrollo de la historia
            switch (opcion){
                case 0:
                    com.pausa(10000); // 10000
                case 1:
                    com.secuencia(ventana);

                    com.cuadro(ventana, "assets/comic/s01.png", "\nMi hermano no debería cargar con el futuro del " +
                            "clan Kamisato el solo...", f,s,cka, 7000); // 7000

                    com.cuadro(ventana, "assets/comic/s02.png", "", f,s,cka, 2000); // 2000
                    com.cuadro(ventana, "assets/comic/s03.png", "", f,s,cka, 2000); // 2000
                    com.cuadro(ventana, "assets/comic/s04.png", "\nEsa reflexión es lo que me ha llevado a este duelo.",
                            f,s,cka, 7000); // 7000
                    com.cuadro(ventana, "assets/comic/s05.png", "", f,s,cka, 2000); // 2000
                    com.cuadro(ventana, "assets/comic/s06.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s07.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s08.png", "", f,s,cka, 2000); // 2000
                    com.cuadro(ventana, "assets/comic/s09.png", "\nCuando las camelias florecen, siempre tengo " +
                            "el mismo sueño.", f,s,cka, 7000); // 7000
                    com.cuadro(ventana, "assets/comic/s10.png", "\nMi madre está conmigo y me siento en paz.",
                            f,s,cka, 5000); // 5000
                    com.cuadro(ventana, "assets/comic/s11.png", "\nTal vez, en el fondo quisiera permanecer siempre dormida.",
                            f,s,cka, 8000); // 8000
                    com.cuadro(ventana, "assets/comic/s12.png", "\nPero así como las flores se marchitan...",
                            f,s,cka, 5000); // 5000
                    com.cuadro(ventana, "assets/comic/s13.png", "\nYo también debo despertar de este sueño.",
                            f,s,cka, 5000); // 5000
                    com.cuadro(ventana, "assets/comic/s14.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s15.png", "", f,s,cka, 2000); // 2000
                    com.cuadro(ventana, "assets/comic/s16.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s17.png", "\nAlgo se agita dentro de mí.", f,s,cka, 4000); // 4000
                    com.cuadro(ventana, "assets/comic/s18.png", "\nTal vez sea el eco de un sueño entrañable...",
                            f,s,cka, 4000); // 4000
                    com.cuadro(ventana, "assets/comic/s19.png", "\nPermanece ahí, día tras día.", f,s,cka, 4000); // 4000
                    com.cuadro(ventana, "assets/comic/s20.png", "\nMe impulsa a vencer.", f,s,cka, 4000); // 4000
                    com.cuadro(ventana, "assets/comic/s21.png", "\nTemplando mi espada.", f,s,cka, 4000); // 4000
                    com.cuadro(ventana, "assets/comic/s22.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s23.png", "", f,s,cka, 2000);
                    com.cuadro(ventana, "assets/comic/s24.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s25.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s26.png", "", f,s,cka, 1000);
                    com.cuadro(ventana, "assets/comic/s27.png", "", f,s,cka, 2000);
                    com.cuadro(ventana, "assets/comic/s28.png", "", f,s,cka, 500);
                    com.cuadro(ventana, "assets/comic/s29.png", "", f,s,cka, 3000);
                    com.cuadro(ventana, "assets/comic/s30.png", "", f,s,cka, 2000);
                    com.cuadro(ventana, "assets/comic/s31.png", "\nEsa fue la primera vez que vencí a mi hermano.",
                            f,s,cka, 8000); // 8000
                    com.cuadro(ventana, "assets/comic/s32.png", "\nY también fue la primera " +
                                    "vez que desperté mi habilidad cryo.",f,s,cka, 8000); //8000
                    com.cuadro(ventana, "assets/comic/s33.png", "\nShirasagi Himegimi o la princesa garza, " +
                                    "había nacido.",f,s,cka, 8000); // 8000
                    com.cuadro(ventana, "assets/comic/s34.png", "\n"+to+": Es hora, Ayaka.", f,s,cto, 4000);
                    com.cuadro(ventana, "assets/comic/s35.png", "\n"+to+": Los fuegos artificiales han empezado, " +
                            "todos te están esperando.", f,s,cto, 7000);
                    com.cuadro(ventana, "assets/comic/s36.png", "\n"+ka+": Jaja. Disculpa, Ayato.", f,s,cka, 4000);
                    com.cuadro(ventana, "assets/comic/s37.png", "", f,s,cka, 2500);
                    com.cuadro(ventana, "assets/comic/s38.png", "\n"+ka+": Le pedimos a nuestra diosa, Raiden Shogun, que todos nuestros " +
                            "sueños perduren por siempre.", f,s,cka, 8000);
                    com.cuadro(ventana, "assets/comic/s39.png", "\n"+ka+": Que comience el festival!", f,s,cka, 7000);
                case 2:
                    ventana.cls();
                    ventana.out("Fin de la presentación.\n\n"+com.showFeatures());
                    break;
                default:
                    ventana.out("Error inesperado...");
                    System.out.println("Error inesperado...");
            }
        };

        Thread hilo = new Thread(sec);

        hilo.start();
    }
}
