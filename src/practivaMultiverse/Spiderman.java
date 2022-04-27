package practivaMultiverse;

import imosh.Colors;
import imosh.Screen;

public class Spiderman {
    // Características
    private String name, gender, animalia;
    private int height, weight, universo;

    // Constructor
    Spiderman(String name, String gender, String animalia, int height, int weight, int universo){
        this.name = name;
        this.gender = gender;
        this.animalia = animalia;
        this.height = height;
        this.weight = weight;
        this.universo = universo;
    }

    // Getters
    public String getName(){ return name; }
    public String getGender(){ return gender; }
    public String getAnimalia(){ return animalia; }
    public int getHeight(){ return height; }
    public int getWeight(){ return weight; }
    public int getUniverso(){ return  universo; }

    // Setters
    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender){
        if (!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setAnimalia(String animalia){
        if (!animalia.isEmpty()){
            this.animalia = animalia;
            return true;
        } else
            return false;
    }

    public boolean setHeight(int height){
        if (height > 0){
            this.height = height;
            return true;
        } else
            return false;
    }

    public boolean setWeight(int weight){
        if (weight > 0){
            this.weight = weight;
            return true;
        } else
            return false;
    }

    public boolean setUniverso(int universo){
        if (universo > 0){
            this.universo = universo;
            return true;
        } else
            return false;
    }

    // Show Status
    public String showStatus(){
        return "Pertenesco al universo "+getUniverso()+".\n\nMe llamo "+getName()+", mido "+getHeight()+" cm y peso "+getWeight()+
                " kg.\nSoy "+getAnimalia()+" y mi genero es "+getGender()+".\n";
    }

    public void initInter(Screen s) {
        s.setVisible(true);
        s.out("\nHola! "+showStatus(),"Comic Sans MS",17, Colors.HighBlue);
        s.out("\nMis habilidades son:\n","Comic Sans MS",17, Colors.HighBlue);
    }

}
