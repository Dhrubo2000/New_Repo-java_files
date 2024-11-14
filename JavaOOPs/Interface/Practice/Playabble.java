package Interface.Practice;

interface TestPlayabble {
    
    int noofinstrument = 2;

    void play();

    public static void stop(){
        System.out.println("stop playing ....");
    }
}


class Guiter implements TestPlayabble{
    @Override
    public void play(){
        System.out.println("i play guiter");
    }
}

class Piano implements TestPlayabble {
    @Override
    public void play(){
        System.out.println("i play piano");
    }


}

public class Playabble{
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.play();

        System.out.println(TestPlayabble.noofinstrument);

        TestPlayabble.stop();
        
    }
}