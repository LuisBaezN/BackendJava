package practicaMona;

public class Main {
    public static void main(String[] args) {
        Test();
    }

    private static void Test() {
        GrimRepo oc01 = new GrimRepo("Parquita", "?", "?", 5);

        System.out.println(oc01.showMessage()+"De la clase: "+oc01.getClase()+"\n");
        System.out.println("Generando ordenes a "+oc01.getNombre()+"...\n");
        System.out.println("\n"+oc01.getNombre()+", juega!");
        oc01.play();
        System.out.println("\n"+oc01.getNombre()+", trancisiona!");
        oc01.transicionar();
        System.out.println("\n"+oc01.getNombre()+", observame");
        oc01.observar();
        System.out.println("-----------------------------------------------------------------------------");

        AdventureCat oc02 = new AdventureCat("Fern","Masculino","Rubio",4,3,
                true, true, "Espada de pasto");

        System.out.println(oc02.showMessage()+"De la clase: "+oc02.getClase()+"\n");
        System.out.println("Generando ordenes a "+oc02.getNombre()+"...\n");
        System.out.println("\n"+oc02.getNombre()+", juega!");
        oc02.play();
        System.out.println("\n"+oc02.getNombre()+", explora!");
        oc02.explora(43);
        System.out.println("\n"+oc02.getNombre()+", ataca!");
        oc02.ataca();
        System.out.println("-----------------------------------------------------------------------------");

        DoctocatBrown oc03 = new DoctocatBrown("Tracer","Femenino", "Naranja y blanco",
                5,9,true,true,"Traje");

        System.out.println(oc03.showMessage()+"De la clase: "+oc03.getClase()+"\n");
        System.out.println("Generando ordenes a "+oc03.getNombre()+"...\n");
        System.out.println("\n"+oc03.getNombre()+", juega!");
        oc03.play();
        System.out.println("\n"+oc03.getNombre()+", viaja en el tiempo!");
        oc03.timeTravel(11,11,1991);
        System.out.println("\n"+oc03.getNombre()+", recolecta combustible");
        oc03.recolectar();
        System.out.println("-----------------------------------------------------------------------------");
    }
}

