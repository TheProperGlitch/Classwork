public class MainA {
    public static void maina(String[] args){
        Car car0 = new Car();
        Car car2 = new Car();
        Train chocho1 = new Train();
        Train tesTrain = new Train();
        chocho1.addCar(car0);
        chocho1.addCar(car2);
        if (chocho1.getHead() != null) System.out.println("Yay!");
        else System.out.println("unexpected falure");
        System.out.println(chocho1.getCars());
        System.out.println(chocho1.getTrains());
    }
}
