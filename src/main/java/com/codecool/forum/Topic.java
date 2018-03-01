package main.java.com.codecool.forum;

public class Topic extends Entry {

    private String title;

    public Topic(String title, String message) {
        super();
        this.title = title;
        super.setMessage(message);
    }
}
