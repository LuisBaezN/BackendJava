package practicaComic;

public class Teyvatian extends Personaje{
    private String elemento, pais;
    private int edad;
    private float estatura, peso;

    public Teyvatian(String nombre, String raza, String genero, String elemento, int edad, boolean biologico,
                     float estatura, float peso, String pais) {
        super(nombre, raza, genero, biologico);

        this.elemento = elemento;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.pais = pais;
    }

    public String getElemento(){ return  elemento; }
    public int getEdad(){ return edad; }
    public float getEstatura() { return estatura; }
    public float getPeso() { return peso; }
    public String getPais(){ return pais; }


    public boolean setElemento(String elemento){
        if (!elemento.isEmpty()){
            this.elemento = elemento;
            return true;
        } else
            return false;
    }

    public boolean setEdad(int edad){
        if (edad >= 0){
            this.edad = edad;
            return true;
        } else
            return false;
    }

    public boolean setEstatura(float estatura){
        if (estatura > 0){
            this.estatura = estatura;
            return true;
        } else
            return false;
    }

    public  boolean setPeso(float peso){
        if (peso > 0){
            this.peso = peso;
            return true;
        } else
            return false;
    }

    public boolean setPais(String pais){
        if (!pais.isEmpty()){
            this.pais = pais;
            return true;
        } else
            return false;
    }

    public String showFeaturesPT(String fP, boolean b){
        String temp;
        if (b == true){
            temp = "Sí";
        }
        else
            temp = "No";
        return fP+"También puedo informarte que tengo "+getEdad()+" años, mi elemento es "+
                getElemento()+" y vengo de "+getPais()+".\n\nOtros datos sobre mi son:\nEstatura: "+
                getEstatura()+" cm\nPeso: "+getPeso()+" kg\nOrganismo biológico: "+temp+"\n\n"+
                "Esta es mi apariencia:\n";
    }
}
