package vehicles;

public final class Car extends Vehicles {

    private final int speedlimit = 200; //now the value cannot be changed

    

    public int getspeedlimit(){
        return speedlimit;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public void airbags(){
        System.out.println("4 airbags");
    }

}
