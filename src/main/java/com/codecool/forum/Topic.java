package main.java.com.codecool.forum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Comment> getModeratedComments() {
        return this.comments.stream()
                .filter(Comment::isModerated)
                .collect(Collectors.toList());
    }
}
