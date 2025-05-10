public class DigitalProfile {
    
    public static void main(String[] args) {
        String name = "Santiago";
        String lastName = "Sanchez";
        String city = "Fray Bentos";
        int age = 34;
        double height = 1.70;

        String[] hobbies  = new String[3];
        hobbies[0] = "Running";
        hobbies[1] = "Fishing";
        hobbies[2] = "Video Games";

        int ageWeeks = 52;
        int luckyNumber = (int)(Math.random()*100);
        String fullName = name + " " + lastName;


        System.out.println("DIGITAL PROFILE : " + fullName.toUpperCase());
        System.out.println("City : " + city.substring(0, 3));
        System.out.println("Age: " + age + " (" + (age * ageWeeks) + " weeks approx.)");
        System.out.println("Height: " + height + " meters");
        System.out.println("Hobbies: " + hobbies[0] + ", " + hobbies[1] + ", " + hobbies[2]);
        System.out.println("Lucky Number : " + luckyNumber);
        System.out.println("Full Name : " + fullName.length());

    }
}
