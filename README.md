# Java SE: Bonus OOP exercises

## Grading dimensions

The skills we are interested in now:

- Programming skills
- Java OOP

## Your task

### Option 1: Forum Engine

Let's make the basics of a forum web application! The forum consists arbitrary number of topics. One topic can have a lot of comments. A comment can only appear when it has already been moderated. 

Tasks:

1. Clone the base repo, make sure you push all your changes at the end!
1. Create 4 classes: `Forum`, `Entry`, `Topic`, `Comment` 
   - The `Forum` is the main class, its constructor has no arguments.    
   - The `Entry` is an abstract class, `Topic` and `Comment` are extending it. The `Topic` and `Comment` classes have the  `creationDate`, `message` and `id` fields in common.  
   - When we create a `Topic` we must pass its `title` and its `message` to it, then it sets its creation date and id automatically
   - When we create a `Comment` we must pass its `message` to it. Then it sets its creation date and id the same way as a `Topic` 
1. Ensure that we can have only one `Forum` instance, the `Forum` can have many `Topic`s, a `Topic` can have many `Comments`s. Use `addXxxx` functions where the `xxxx` part is the type's name regarding to the addition.
1. The Comment has an `moderated` logical flag, which is `false` in the beginning. We can change its value by the `toggleModeration` function call which has no parameters.
1. The `Topic`'s `getModeratedComments` function only returns those `Comment` instances, which `moderated` flag is equal to `true`.
1. Bonus: Write unit tests for the `Topic` class


### Option 2: News Agency

Let's simulate a news agency's website! Any news category consists arbitrary number of news posts. One post can have a lot of tags if it is well written. A post contains the creator's name and the news text. Every post has its own URL which is used then to display it on the news portal. A post can only appear when it has at least 2 tags. 

Don't worry, we will deal only with the basic structure this time:

1. Clone the base repo
1. Create 3 classes: `Category`, `Post`, `Tag`
   - When we create a `Category`, we pass its name to it
   - When we create a `Post`, we must pass its title, textual content and author's name to it. It automatically sets its URL. The URL is the title converted to lowercase, spaces are converted to `-` (minus) signs, then every non-alphanumeric character is stripped (so only leave the`[a-z0-9\-]` characters). Example: [https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java](https://stackoverflow.com/questions/109383/sort-a-mapkey-value-by-values-java)
       1. For example: given the title `"Sort a Map<Key, Value> by values (Java)"`, we convert it to lower case: `"sort a map<key, value> by values (java)"` Then we convert spaces to minus signs: `"sort-a-map<key,-value>-by-values-(java)"` Then we strip all non-alphanumeric characters, except the minus signs we added: `"sort-a-mapkey-value-by-values-java"`
   - When we create a `Tag`, we pass its name to it
1. Ensure that we can have many `Category` instances, the `Category` can have many `Post`s, a `Post` can have many `Tag`s. Use `addXxxx` functions where the `xxxx` part in the name is the type regarding to the addition.
1. Ensure that a `Category` can't have the same `Post` multiple times (check by URL), and a `Post` can't have the same `Tag` multiple times (check by name).
1. When we call the `Category`'s `geAllPosts` function, it only returns those `Post`s, which have at least 2 `Tag`s.
1. If you have time, write unit tests to the `Post` class
