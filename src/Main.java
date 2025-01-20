//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Workshop workshopOne = new Workshop(1, "EE workshop", "Working on EE", "January 30th", "10AM");
        Concert concertOne = new Concert(23, "Adele in Munich", "Adele live", "August 10th", "7PM");
        Concert concertTwo = new Concert(190, "Renaissance World Tour", "Beyonce Live", "September 15th", "8PM");

        Category musicCategory = new Category("Music", "Concerts of musicians");
        Category writingCategory = new Category("Writings", "Writing in English");
        musicCategory.addEvent(concertOne);
        musicCategory.addEvent(concertTwo);
        musicCategory.getCategoryInfo();
        writingCategory.addEvent(workshopOne);
        writingCategory.getCategoryInfo();

        List<Event> allEvents = new ArrayList<>();
        allEvents.add(concertOne);
        allEvents.add(concertTwo);
        allEvents.add(workshopOne);

        Report report= new Report(allEvents);


        System.out.println("Events containing 'Renaissance':");
        List<Event> nameFilteredEvents = report.findEventByName("Renaissance");
        for (Event event : nameFilteredEvents) {
            System.out.println(event.getDetails());
        }

        System.out.println("Event with ID 12:");
        Event foundEvent = report.findEventById(1);
        if (foundEvent != null) {
            System.out.println(foundEvent.getDetails());
        } else {
            System.out.println("Event not found.");
        }

    }
}