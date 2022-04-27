package practicaMona;

public class Octogato {
    // Características
    private String nombre, genero, color;
    private int vidas, brazos;
    private boolean anfibio, biologico;

    // Constructor sobrecargado
    public Octogato (String nombre){
        this.nombre = nombre;
    }

    public Octogato (String nombre, String genero){
        this.nombre = nombre;
        this.genero = genero;
    }

    public Octogato (String nombre, String genero, String color){
        this.nombre = nombre;
        this.genero = genero;
        this.color = color;
    }

    public Octogato (String nombre, String genero, String color, int brazos){
        this.nombre = nombre;
        this.genero = genero;
        this.color = color;
        this.brazos = brazos;
    }

    public Octogato (String nombre, String genero, String color, int brazos, int vidas){
        this.nombre = nombre;
        this.genero = genero;
        this.color = color;
        this.vidas = vidas;
        this.brazos = brazos;
    }

    public Octogato (String nombre, String genero, String color, int brazos, int vidas, boolean anfibio){
        this.nombre = nombre;
        this.genero = genero;
        this.color = color;
        this.vidas = vidas;
        this.brazos = brazos;
        this.anfibio = anfibio;
    }

    public Octogato (String nombre, String genero, String color, int brazos, int vidas, boolean anfibio,
                     boolean biologico){
        this.nombre = nombre;
        this.genero = genero;
        this.color = color;
        this.vidas = vidas;
        this.brazos = brazos;
        this.anfibio = anfibio;
        this.biologico = biologico;
    }

    // Getters
    public String getNombre(){ return nombre; }
    public String getGenero(){ return genero; }
    public String getColor(){ return color; }
    public int getVidas(){ return vidas; }
    public int getBrazos(){ return brazos; }
    public boolean getAnfibio(){ return anfibio; }
    public boolean getBiologico(){ return biologico; }

    // Setters
    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        if (!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }

    public boolean setVidas(int vidas){
        if (vidas >= 0){
            this.vidas = vidas;
            return true;
        } else
            return false;
    }

    public boolean setBrazos(int brazos){
        if (brazos >= 0){
            this.brazos = brazos;
            return true;
        } else
            return false;
    }

    // Methods

    public String showMessage(){
        return "\nSoy un octogato con las siguientes caracteristicas: \n"+
                "Nombre: "+getNombre()+"\n"+
                "Genero: "+getGenero()+"\n"+
                "Color: "+getColor()+"\n"+
                "Brazos: "+getBrazos()+"\n"+
                "Biologico: "+getBiologico()+"\n"+
                "Anfibio: "+getAnfibio()+"\n"+
                "Vidas: "+getVidas()+"\n";
    }

    public void play(){
        System.out.println("Toma bola de hilo y juega");
    }
}
