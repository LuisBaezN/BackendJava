package practicaMona;

class GrimRepo extends Octogato{
    public String clase;
    // Constructor
    public GrimRepo(String nombre, String genero, String color, int brazos) {
        super(nombre, genero, color, brazos);
        this.clase = "Grim Repo";
    }

    // Setters
    private boolean setBiologico(boolean biologico){
        if (biologico == true){
            setBiologico(false);
            return true;
        } else
            return false;
    }

    private boolean setAnfibio(boolean anfibio){
        if (anfibio == true){
            setAnfibio(false);
            return true;
        } else
            return false;
    }

    private boolean setVidas() {
        return setVidas(0);
    }

    // Getters

    public String getClase(){ return clase; }

    // Methods

    void transicionar(){
        System.out.println("Transicionando vida...");
    }

    void observar(){
        System.out.println("Tu vida restante es $%*?[ segundos");
    }

    @Override
    public void play(){
        System.out.println("Se queda de pie");
    }
}


