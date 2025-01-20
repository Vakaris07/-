import java.util.ArrayList;
import java.util.List;

public class Category {
    private String title;
    private String description;
    private List<Event> events;

    public Category(String title, String description) {
        this.events = new ArrayList<>();
        this.title = title;
        this.description = description;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void getCategoryInfo() {
        System.out.println("Category title= " + title + ", description= " + description);
        for (int i = 0; i < events.size(); i++) {
            System.out.println(events.get(i).getDetails());
        }
    }
}
