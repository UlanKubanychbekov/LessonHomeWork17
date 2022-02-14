package peaksoft;

public class Main {

    public static void main(String[] args) {

        Shark shark = new Shark();
        Eagle eagle = new Eagle();
        Turtle turtle = new Turtle();
        Animal[] animals = {turtle, eagle, shark};


        Turtle[] turtles = {turtle};
        Eagle[] eagles = {eagle};
        Shark[] sharks = {shark};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("peaksoft.Shark")) {
                ((Shark) s).attack();
            }

            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("peaksoft.Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();
            }
            if (s.getClass().getName().equals("peaksoft.Eagle")) {
                ((Eagle) s).fly();
            }
        }


    }
}
