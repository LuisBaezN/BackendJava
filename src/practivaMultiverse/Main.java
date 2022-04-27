package practivaMultiverse;

import imosh.Screen;

public class Main {
    public static void main(String[] args) {
        Test();
    }

    private static void Test(){
        Screen screen = new Screen();

        MilesMorales sm01 = new MilesMorales("Miles Morales", "Masculino",
                "Humano", 157, 57, 616);

        sm01.initInter(screen);
        sm01.escalaMuros(screen);
        sm01.sentidoAracnido(screen);
        sm01.toqueVenenoso(screen);
        sm01.camuflaje(screen);
        sm01.toqueElectrico(screen);

        GwenStacy sm02 = new GwenStacy("Gwen Stacy", "Femenino",
                "Humano", 165, 56, 65);

        sm02.initInter(screen);
        sm02.escalaMuros(screen);
        sm02.sentidoAracnido(screen);
        sm02.pielRoca(screen);
        sm02.equilibrio(screen);

        MiguelOhara sm03 = new MiguelOhara("Miguel O'Hara","Masculino",
                "Humano", 180, 77, 928);

        sm03.initInter(screen);
        sm03.escalaMuros(screen);
        sm03.vision(screen);
        sm03.garrasColmillos(screen);
        sm03.telarana(screen);
        sm03.senuelo(screen);
    }
}
