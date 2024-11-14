package Innerclasses;

public class Computer {
    
    private String brand;
    private String model;
    private Operatingsystem os;

    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new Operatingsystem(osName);
    }

    public String getbrand(){
        return this.brand;
    }

    public String getmodel(){
        return this.model;
    }

    public Operatingsystem getosName(){
        return this.os;
    }

    static class USB {
        private String type;

        public USB(String type){
            this.type = type;
        }

        public String getType(){
            return this.type;
        }

        void display(){
            System.out.println("the type of the usb is : " + type);
        }
    }


    class Operatingsystem {
        private String osName;

        public Operatingsystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("computer model : " + model + " OS : " + osName);
        }

    }

}
