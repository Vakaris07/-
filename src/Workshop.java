public class Workshop extends Event {
    public Workshop(int id, String name, String description, String date, String time) {
        super(id, name, description, date, time);
    }

    @Override
    public String getDetails() {
        return "Workshop " + super.toString();
    }
}
