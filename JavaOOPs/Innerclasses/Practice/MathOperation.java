package Innerclasses.Practice;

public class MathOperation {
    
    public void calculateSum(int a , int b){
        class Addition {
            public int performAddition(){
                return a + b;
            }
        }

        Addition add = new Addition();
        int result = add.performAddition();
        System.out.println(result);
    }
}
