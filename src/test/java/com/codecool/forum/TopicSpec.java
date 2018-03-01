package test.java.com.codecool.forum;

import main.java.com.codecool.forum.Comment;
import main.java.com.codecool.forum.Topic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopicSpec {

    private Topic topic;

    @BeforeEach
    public void before() {
        this.topic = new Topic("Topic", "Message");
    }

    @Test
    public void whenInstantiatedThenMessageAndTitleIsSet() {
        assertEquals("Topic", topic.getTitle());
        assertEquals("Message", topic.getMessage());
    }

    @Test
    public void whenAddCommentThenCommentIsAdded() {
        Comment comment = new Comment("Comment1");
        this.topic.addComment(comment);
        assertEquals(1, topic.getComments().size());
    }
}
