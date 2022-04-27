package practivaMultiverse;

import imosh.Colors;
import imosh.Screen;

public class GwenStacy extends Spiderman implements GwenStacyCallbacks{
    GwenStacy(String name, String gender, String animalia, int height, int weight, int universo) {
        super(name, gender, animalia, height, weight, universo);
    }

    @Override
    public void escalaMuros(Screen s) {
        s.out("\nTrepar!\n","Comic Sans MS",17, Colors.LighterPurple);
        s.showImage("assets/spider/GEM.jpg");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.out("\nSentido aracnido!\n","Comic Sans MS",17, Colors.LighterPurple);
        s.showImage("assets/spider/GSS.gif");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void pielRoca(Screen s) {
        s.out("\nResistir fuertes impactos fisicos!\n","Comic Sans MS",17, Colors.LighterPurple);
        s.showImage("assets/spider/GPR.jpg");
        s.setBounds(200,100,700,400);
    }

    @Override
    public void equilibrio(Screen s) {
        s.out("\nEquilibrarme como ningun otro!\n","Comic Sans MS",17, Colors.LighterPurple);
        s.showImage("assets/spider/GE.jpg");
        s.setBounds(200,100,700,400);
    }
}
