package practicaMona;

public class AdventureCat extends Octogato{
    public String clase, arma;
    public AdventureCat(String nombre, String genero, String color, int brazos, int vidas, boolean anfibio,
                        boolean biologico, String arma) {
        super(nombre, genero, color, brazos, vidas, anfibio, biologico);
        this.arma = arma;
        this.clase = "Adventure Cat";
    }

    // Setters
    public boolean setArma(String arma){
        if (!arma.isEmpty()){
            this.arma = arma;
            return true;
        } else
            return false;
    }

    // Getters
    public String getClase(){ return clase; }

    public String getArma(){ return  arma; }

    // Methods
    void explora(int num){
        switch (num){
            case 0:
                System.out.println("Confundido...");
                break;
            case 1:
                System.out.println("Entrando a calabozo");
                break;
            case 2:
                System.out.println("Entrando a cueva tenebrosa");
                break;
            case 3:
                System.out.println("Visitando a Marceline");
                break;
            default:
                System.out.println("El rey helado ha atacado!");
        }
    }

    void ataca(){
        System.out.println("Atacando con "+getArma());
    }

    @Override
    public void play(){
        System.out.println("Toma a BMO y pone un videojuego");
    }
}
