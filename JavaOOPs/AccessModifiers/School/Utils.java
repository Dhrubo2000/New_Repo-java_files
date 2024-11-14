package AccessModifiers.School;

public class Utils {
    
    public static int max(int a, int b){
        return Math.max(a, b);
    }

    public static int min(int x, int y){
        return Math.min(x, y);
    }

    public static String trimandUpper(String str){
        if(str != null){
            return str.trim().toUpperCase();
        }

        return "";
    }
}
