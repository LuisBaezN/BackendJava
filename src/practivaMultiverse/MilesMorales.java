package practivaMultiverse;

import imosh.Colors;
import imosh.Screen;

public class MilesMorales extends Spiderman implements MilesMoralesCallbacks {
    MilesMorales(String name, String gender, String animalia, int height, int weight, int universo) {
        super(name, gender, animalia, height, weight, universo);
    }

    @Override
    public void escalaMuros(Screen s) {
        s.out("\nTrepar!\n","Comic Sans MS",17, Colors.RoyalBlue);
        s.showImage("assets/spider/trepar.png");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.out("\nSentido aracnido!\n","Comic Sans MS",17, Colors.RoyalBlue);
        s.showImage("assets/spider/sentido.jpg");
        s.setBounds(200,100,1000,600);
    }

    @Override
    public void toqueVenenoso(Screen s) {
        s.out("\nToque venenoso!\n","Comic Sans MS",17, Colors.RoyalBlue);
        s.showImage("assets/spider/vt.png");
        s.setBounds(200,100,1000,600);
    }

    @Override
    public void camuflaje(Screen s) {
        s.out("\nCamuflaje!\n","Comic Sans MS",17, Colors.RoyalBlue);
        s.showImage("assets/spider/i.png");
        s.setBounds(200,100,1000,600);
    }

    @Override
    public void toqueElectrico(Screen s) {
        s.out("\nToque electrico!\n","Comic Sans MS",17, Colors.RoyalBlue);
        s.showImage("assets/spider/te.jpg");
        s.setBounds(200,100,1000,600);
    }
}
