package practicaComic;

public class Personaje {
    private String nombre, raza, genero;
    private boolean biologico;

    public Personaje(String nombre, String raza, String genero, boolean biologico){
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.biologico = biologico;
    }

    public String getNombre(){ return nombre; }
    public String getRaza(){ return  raza; }
    public String getGenero(){ return genero; }
    public boolean getBiologico(){ return biologico; }


    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setRaza(String raza){
        if (!raza.isEmpty()){
            this.raza = raza;
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

    public String showFeaturesP(){
        return "\nHola! \n\nMi nombre es "+getNombre()+", mi raza es "+getRaza()+" y mi género es "+getGenero()+".\n";
    }
}
