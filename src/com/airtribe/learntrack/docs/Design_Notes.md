### Why you used ArrayList instead of array?

In Airtribe LearnTrack,we used `ArrayList` instead of `Array` because the number of students, courses and enrollments can change dynamically while the application is running. An array has a fixed size once it's created which leads to a major drawback for the application, whereas an ArrayList can grow or shrink as records are added or removed. 

| Feature                | Array           | ArrayList       |
| ---------------------- | --------------- | --------------- |
| Size                   | Fixed           | Dynamic         |
| Add elements           | Manual handling | `add()`         |
| Remove elements        | Manual handling | `remove()`      |
| Search                 | Manual loop     | Loop / methods  |
| Generics               | No              | Yes             |
| Easy to manage records | Less convenient | More convenient |


### Where you used static members and why?

In Airtribe LearnTrack, I used `static` mainly for the **shared collections** and **management methods**. 

#### Why in shared Collections?

I made them `static` because I wanted o**ne shared collection for the entire application**. If these collections were instance variables, every object created from the management class could have its own separate collection. This also works well with my console-based application, where the data needs to remain available while the application is running.

#### Why in static methods?
In Airtribe LearnTrack, I used `static` methods for the management and utility operations because these methods operate on the shared static collections and do not require any instance-specific data. The main reason was to allow these methods to be called directly from `Main` without creating an object.

### Where you used inheritance and what you gained from it
In Airtribe LearnTrack, I used inheritance between the `Person` and `Student` classes. The `Person` class contains the common properties and behavior that can be shared by different types of people, while the `Student` class extends `Person` and contains student-specific information. By using inheritance, `Student` can reuse the common fields and methods defined in `Person` instead of defining them again. This provides code reusability, reduces duplication, and makes the application easier to maintain. It also establishes an "is-a" relationship, where a `Student` is a type of `Person`.