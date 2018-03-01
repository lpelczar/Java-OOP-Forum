package test.java.com.codecool.forum;

import main.java.com.codecool.forum.Topic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopicSpec {

    private Topic topic;

    @Test
    public void whenInstantiatedThenMessageAndTitleIsSet() {
        String title = "Topic";
        String message = "Message";
        this.topic = new Topic(title, message);
        assertEquals(title, topic.getTitle());
        assertEquals(message, topic.getMessage());
    }
}
