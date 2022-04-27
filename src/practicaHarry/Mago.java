package practicaHarry;

public class Mago {
    // Propiedades
    private String nombre, genero, casa, patronus, boggart;
    private int edad;
    private boolean mestizo, mortifago;

    // Constructor sin sobrecarga
    public Mago (String nombre, String genero, int edad, String casa, String patronus, boolean mestizo,
                 boolean mortifago, String boggart){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.casa = casa;
        this.patronus = patronus;
        this.mestizo = mestizo;
        this.mortifago = mortifago;
        this.boggart = boggart;
    }

    // Getters
    public String getNombre(){ return nombre; }
    public String getGenero(){ return genero; }
    public int getEdad(){ return edad; }
    public String getCasa(){ return casa; }
    public String getPatronus(){ return patronus; }
    public boolean getMestizo(){ return mestizo; }
    public boolean getMortifago(){ return mortifago; }
    public String getBoggart(){ return boggart; }

    // Setters
    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
            return true;
        } else
            return false;
    }

    public boolean setCasa(String casa){
        if (!casa.isEmpty()){
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    // Test
    public String showMessage(){
        return "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Edad: "+edad+"\n"+
                "Casa: "+casa+"\n"+
                "Patronus: "+patronus+"\n"+
                "Mestizo: "+mestizo+"\n"+
                "Mortifago: "+mortifago+"\n"+
                "Boggart: "+boggart+"\n";
    }
}
