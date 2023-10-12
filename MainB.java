public class MainB {
    public static void mainb(String[] args){
        Boat tal = new Boat(14);

        //Methods have scopes
        tal.setSpeed(8);
        Boat.setSpeed(8,tal);
    }
}
