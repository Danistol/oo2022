public class Homework {
    public static void main(String[] args) {
        Animal lion = new Animal("Alex", "Lion", 5);
        Animal zebra = new Animal("Marty", "Zebra", 3);
        Animal[] animals = new Animal[]{lion, zebra};
        Zoo zoo = new Zoo(animals);
        System.out.println(zoo.countAnimals());
        System.out.println(lion.toString());
        System.out.println(zebra.toString());
    }
}
