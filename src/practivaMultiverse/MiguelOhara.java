package practivaMultiverse;

import imosh.Colors;
import imosh.Screen;

public class MiguelOhara extends Spiderman implements MiguelOharaCallbacks {

    MiguelOhara(String name, String gender, String animalia, int height, int weight, int universo) {
        super(name, gender, animalia, height, weight, universo);
    }

    @Override
    public void escalaMuros(Screen s) {
        s.out("\nTrepar!\n","Comic Sans MS",17, Colors.Desire);
        s.showImage("assets/spider/MEM.jpg");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void vision(Screen s) {
        s.out("\nVer objetos a distancias muy lejanas!\n","Comic Sans MS",17, Colors.Desire);
        s.showImage("assets/spider/MV.png");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void garrasColmillos(Screen s) {
        s.out("\nParalizar con mis colmillos!\n","Comic Sans MS",17, Colors.Desire);
        s.showImage("assets/spider/MGC.jpg");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void telarana(Screen s) {
        s.out("\nLanzar telaraña de mis muñecas y antebrazos!\n","Comic Sans MS",17, Colors.Desire);
        s.showImage("assets/spider/MT.jpg");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void senuelo(Screen s) {
        s.out("\nCrear señuelos gracias a mi alta velocidad!\n","Comic Sans MS",17, Colors.Desire);
        s.showImage("assets/spider/MS.jpg");
        s.setBounds(200,100,700,400);
    }
}
