public class Boat {
    int speed;

    /*We can see with the next two examples how you can use this._ 
    to refer to the speed in the class boat */
    Boat(int _speed){
        speed = _speed;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }

    static void setSpeed(int Speed, Boat b){
        //Cannot deal with stacic reference for non static reference field. 
        speed = speed;
        if (true) {
            int speed = 7;
            int foo = 7;
        }
        System.out.println(foo);
    }
}
