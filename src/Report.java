import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<Event> events;

    public Report(List<Event> events){
        this.events= events;
    }

    public List<Event> findEventByName(String name){
        List<Event> found = new ArrayList<>();
        for(int i=0; i<events.size(); i++){
            if(events.get(i).getName().contains(name)){
                found.add(events.get(i));
            }
        }
        return found;
    }

    public Event findEventById(int id){
        for(int i=0; i<events.size(); i++){
            if(events.get(i).getId()==id){
                return events.get(i);
            }
        }
        return null;
    }

}
