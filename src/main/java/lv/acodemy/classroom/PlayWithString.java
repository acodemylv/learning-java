package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Nikita";
        String surname = "Milka";

        // My name is: Nikita Milka

        // Concatenation
        String myText = "My name is: " + name + " " + surname;

        System.out.println(myText);
        System.out.println("My name is: " + name + " " + surname);

        // Interpolation
        // %s - for text
        // %d - for numeric values

        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(interpolation);
        System.out.println(String.format("My name is: %s %s", name, surname));

        String firstName = "Nikita";
        String lastName = "Milka";
        int age = 29;
        String city = "Riga";

        System.out.println(firstName + " " + lastName);

        // TODO:
        // Example: John Doe is 25 years old and lives in New York.

        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));

        String result = String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city);
        System.out.println(result);
    }
}
