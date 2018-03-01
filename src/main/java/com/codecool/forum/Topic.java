package main.java.com.codecool.forum;

import java.util.ArrayList;
import java.util.List;

public class Topic extends Entry {

    private String title;
    private List<Comment> comments = new ArrayList<>();

    public Topic(String title, String message) {
        super();
        this.title = title;
        super.setMessage(message);
    }

    public boolean addComment(Comment comment) {
        return comments.add(comment);
    }
}
