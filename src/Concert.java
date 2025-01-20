public class Concert extends Event {

    public Concert(int id, String name, String description, String date, String time) {
        super(id, name, description, date, time);
    }

    @Override
    public String getDetails() {
        return "Concert " + super.toString();
    }
}
