package by.epam.intro.task4.bean;

public class Excursions extends Tour {
       
    public Excursions(int cost,String transport,boolean food,int numberOfDays){
        super(cost,transport,food,numberOfDays);
        this.type="excursions";
    }

    @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}

