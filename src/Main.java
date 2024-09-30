public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Bird myBird = new Bird();
        Tiger myTiger = new Tiger();

        myAnimal.animalSound();
        myBird.animalSound();
        myTiger.animalSound();
        myTiger.animalSound(5);

    }
}