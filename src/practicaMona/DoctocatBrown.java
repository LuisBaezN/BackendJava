package practicaMona;

public class DoctocatBrown extends Octogato{
    public String clase, time_machine;
    public DoctocatBrown(String nombre, String genero, String color, int brazos, int vidas, boolean anfibio,
                         boolean biologico, String time_machine) {
        super(nombre, genero, color, brazos, vidas, anfibio, biologico);
        this.time_machine = time_machine;
        this.clase = "Doctocat Brown";
    }

    // Setters
    public boolean setTime_machine(String time_machine){
        if (!time_machine.isEmpty()){
            this.time_machine = time_machine;
            return true;
        } else
            return false;
    }

    // Getters
    public String getClase(){ return clase; }
    public String getTime_machine(){ return time_machine; }

    // Methods
    void timeTravel(int day, int month, int year){
        System.out.println("Viajando al "+day+" "+month+" "+" "+year+" en el "+getTime_machine());
    }

    void recolectar(){
        System.out.println("Recolectando basura");
    }

    @Override
    public void play(){
        System.out.println("Comienza a hacer calculos");
    }
}
