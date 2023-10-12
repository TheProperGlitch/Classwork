class Train {
    static private int trainsMade = 0;
    Car head;
    private static int carsMade = 0;

    public void addCar(Car lambo){
        carsMade++;
        if (this.head == null){
            head = lambo;
            return;
        } else {
            Car makemeprev = this.head;
            //Scope is what is inside the curly braces.
            while(makemeprev.getNext() != null){
                makemeprev = makemeprev.getNext();
            }
            lambo.setPrev(makemeprev); 
            makemeprev.setNext(lambo);
        }
        
    }
    public Car getHead(){
        return head;
    }
    public int getCars(){
        return carsMade;
    }
    public Train(){
        trainsMade++;
    }
    public int getTrains(){
        return trainsMade;
    }
    private int sayOne(){
        return 1;
    }
}

