public class Car {
    private Car next;

    private Car prev;

    public Car () {        
    }

    public Car getNext() {
        return next;
    }

    public void setNext(Car newNext) {
        next = newNext;
    }

    public void setPrev(Car newPrev) {
        prev = newPrev;
    }
    
}
