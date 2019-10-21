
package by.epam.intro.task4.bean;

public class Shopping extends Tour {
    
    public Shopping(int cost,String transport,boolean food,int numberOfDays){
        super(cost,transport,food,numberOfDays);
        this.type="shopping";
    }
       
   @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}
