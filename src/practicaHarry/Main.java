package practicaHarry;

public class Main {
    public static void main(String[] args) {
        Registrar();
    }

    private static void Registrar(){
        Mago m01 = new Mago("Severus Snape", "Masculino", 38, "Slytherin", "Cierva",
                true, true, "Lord Voldemort");

        System.out.print("\nPrimer mago registrado: \n");
        System.out.print(m01.showMessage());


        Mago m02 = new Mago("Albus Percival Wulfric Brian Dumbledore", "Masculino", 116,
                "Gryffindor", "Fenix", true,false,"El cuerpo de su hermana Ariana");

        System.out.print("\nSegundo mago registrado: \n");
        System.out.print(m02.showMessage());


        Mago m03 = new Mago("Luna Lovegood", "Femenino", 19,"Ravenclaw", "Liebre",
                true,false, "NA");

        System.out.print("\nTercer mago registrado: \n");
        System.out.print(m03.showMessage());


        Mago m04 = new Mago("Nymphadora Lupin", "Femenino", 25,"Hufflepuff", "Lobo",
                true, false, "Perder sus habilidades");

        System.out.print("\nCuarto mago registrado: \n");
        System.out.print(m04.showMessage());


        Mago m05 = new Mago("Bellatrix Lestrange", "Femenino", 47, "Slytherin", "NA",
                false, true, "NA");

        System.out.print("\nQuinto mago registrado: \n");
        System.out.print(m05.showMessage());
    }
}
