public class Main {
    public static void main(String[] args) {
        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();
        shark.eat();
        turtle.eat();
        eagle.eat();
        Animal [] animals = {shark,turtle,eagle};
        Shark[] sharks = new Shark[5];
        Turtle[] turtles = new Turtle[5];
        Eagle [] eagles = new Eagle[5];

        for (Animal animal : animals) {
            for (int i = 0; i < sharks.length; i++) {
                if (animal instanceof Shark)
                if (animal.getClass().getName().equals("Shark"))
                {
                    sharks[i] = (Shark) animal;
                    sharks[i].attack();
                }
            }
            for (int i = 0; i < turtles.length; i++) {
                if (animal instanceof Turtle)
                if (animal.getClass().getName().equals("Turtle"))
                {
                    turtles[i] = (Turtle) animal;
                    turtles[i].swim();
                }
            }
            for (int i = 0; i < eagles.length; i++) {
                if (animal instanceof  Eagle)
                if (animal.getClass().getName().equals("Eagle"))
                {
                    eagles[i] = (Eagle) animal;
                    eagles[i].fly();
                }
            }
        }
    }

}