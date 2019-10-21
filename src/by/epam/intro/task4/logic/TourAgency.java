
package by.epam.intro.task4.logic;

import by.epam.intro.task4.bean.Vacation;
import by.epam.intro.task4.bean.*;

import java.util.Map;
import java.util.HashMap;

public class TourAgency{
         
    public static Client defineClient(String clientName){
        Map<String,Client> clients=new HashMap<>();
        clients.put("tom",new Client("Tom"));
        clients.put("nik",new Client("Nik"));
        clients.put("ann",new Client("Ann"));
        clients.put("jon",new Client("Jon"));
        clients.put("mary",new Client("Mary"));
        return clients.get(clientName);
   }
    
    public static Tour defineTour(String tourType){
        Map<String,Tour> tours=new HashMap<>();
        tours.put("vacation",new Vacation(120,"train",true,5));
        tours.put("excursions",new Excursions(250,"bus",false,2));
        tours.put("therapy",new Therapy(300,"airplane",true,10));
        tours.put("shopping",new Shopping(200,"bus",false,2));
        tours.put("cruise",new Cruise(400,"ship",true,14));
        return tours.get(tourType);
    }
}
