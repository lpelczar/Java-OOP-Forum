# Java SE: Bonus OOP exercises

## Grading dimensions

The skills we are interested in now:

- Programming skills
- Java OOP

## Your task

### Option 1: Forum Engine

1. Clone the base repo
1. Create 3 classes: `Forum`, `Topic`, `Entry` 
   - When we create the `Forum`, we have no parameters to pass to it
   - When we create a `Topic`, we pass its name to it, then it sets its creation date and ID automatically
   - When we create an `Entry`, we must pass its textual content and author's name to it. There is one optional parameter if it is a reply to another comment. If it is a reply, then we pass the ID of the previous comment we reply to. *(Tip: use constructor chaining)*
1. Ensure that we can have only one `Forum` instance *(Tip: singleton pattern)*, the `Forum` can have many `Topic`s, a `Topic` can have many `Entry` instances. Use `add_xxxx` functions where the `xxxx` part is the type's name regarding to the addition.
1. The Entry has an `is_moderated` logical flag, which is `false` in the beginning. We can change its value by the `toggle_moderation` function call which has no parameters.
1. The `Topic`'s `get_all_entries` function only returns those `Entry` instances, which `is_moderated` flag is equal to `false`.
1. If you have time, write unit tests to the `Entry` class
1. Create atomic commits with descriptive commit messages while you're working
1. Push all your changes to the repo


### Option 2: News Agency

1. Clone the base repo
1. Create 3 classes: `Category`, `Post`, `Tag`
   - When we create a `Category`, we pass its name to it
   - When we create a `Post`, we must pass its title, textual content and author's name to it. It automatically sets its URL. The URL is the title converted to lowercase, spaces are converted to `-` (minus) signs, then every non-alphanumeric character is stripped (so only leave the`[a-z0-9\-]` characters).
   - When we create a `Tag`, we pass its name to it
1. Ensure that we can have many `Category` instances, the `Category` can have many `Post`s, a `Post` can have many `Tag` instances. Use `add_xxxx` functions where the `xxxx` part in the name is the type regarding to the addition.
1. Ensure that a `Category` can't have the same `Post` multiple times (check by URL), and a `Post` can't have the same `Tag` multiple times (check by name).
1. When we call the `Category`'s `get_all_posts` function, it only returns those `Post`s, which have at least 2 `Tag`s.
1. If you have time, write unit tests to the `Post` class
1. Create atomic commits with descriptive commit messages while you're working
1. Push all your changes to the repo
