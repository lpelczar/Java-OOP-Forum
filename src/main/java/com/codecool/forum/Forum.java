package main.java.com.codecool.forum;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private static Forum instance = null;
    private List<Topic> topics = new ArrayList<>();

    private Forum() {}

    public static Forum getInstance() {
        if (instance == null) {
            instance = new Forum();
        }
        return instance;
    }

    public boolean addTopic(Topic topic) {
        return topics.add(topic);
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
