package practicaComic;

public class Comic {
    private String empresa, serie, genero;
    private int numero, dia, mes, anio;

    public Comic(String empresa, String serie, String genero, int numero, int dia, int mes, int anio){
        this.empresa = empresa;
        this.serie = serie;
        this.genero = genero;
        this.numero = numero;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getEmpresa(){ return empresa; }
    public String getSerie(){ return serie; }
    public String getGenero(){ return genero; }
    public int getNumero(){ return numero; }
    public int getDia(){ return dia; }
    public int getMes(){ return mes; }
    public int getAnio(){ return anio; }

    public boolean setEmpresa(String empresa){
        if (!empresa.isEmpty()){
            this.empresa = empresa;
            return true;
        } else
            return false;
    }

    public boolean setSerie(String serie){
        if (!serie.isEmpty()){
            this.serie = serie;
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

    public boolean setNumero(int numero){
        if (numero > 0){
            this.numero = numero;
            return true;
        } else
            return false;
    }

    public boolean setDia(int dia){
        if (dia > 0 && dia <= 31){
            this.dia = dia;
            return true;
        } else
            return false;
    }

    public boolean setMes(int mes){
        if (mes > 0 && mes <= 12){
            this.mes = mes;
            return true;
        } else
            return false;
    }

    public boolean setAnio(int anio){
        if (anio > 1890){
            this.anio = anio;
            return true;
        } else
            return false;
    }

    public String showFeatures(){
        return "\nInformación adicional de este cómic:\n\nEmpresa: "+getEmpresa()+"\nSerie: "+getSerie()+
                "\nGénero: "+getGenero()+"\nNúmero: "+getNumero()+"\nFecha: "+getDia()+
                "/"+getMes()+"/"+getAnio();
    }
}