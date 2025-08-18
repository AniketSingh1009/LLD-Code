package oops;

public class Encapsule {
  private String name;
  private int age;

  // Constructor
  public Encapsule(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter for Name
  public String getName() {
    return name;
  }

  // Setter for Name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for Age
  public int getAge() {
    return age;
  }

  // Setter for Age
  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Invalid age. Age must be positive.");
    }
  }
}
class mainEncapsule {
  public static void main(String[] args) {
    Encapsule person = new Encapsule("Alice", 30);
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());

    // Update name and age
    person.setName("Bob");
    person.setAge(25);
    System.out.println("Updated Name: " + person.getName());
    System.out.println("Updated Age: " + person.getAge());

    // Attempt to set an invalid age
    person.setAge(-5); // Should print an error message
  }
}

