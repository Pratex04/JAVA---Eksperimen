package eksperimen.LatihanArray;

public class Hero {
    String name;
    double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("Name " + this.name + " with health " + this.health);
    }

    public String toString(){
        return "Name : " + this.name;
    }
}
