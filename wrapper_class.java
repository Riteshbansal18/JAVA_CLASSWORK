public class wrapper_class {
    public static void main(String[] args) {
        int num = 100;
        char ch = 'A';
        boolean bool = true;

        Integer intObj = Integer.valueOf(num);
        Character charObj = Character.valueOf(ch);
        Boolean boolObj = Boolean.valueOf(bool);

        Integer intAuto = num;
        
        int numBack = intObj.intValue();
        char chBack = charObj.charValue();
        
        int value = intObj;

        System.out.println("Integer object: " + intObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Auto-unboxed value: " + value);
        Double doubleObj = 3.14;  
        double d = doubleObj;     
        System.out.println("Double value: " + d);

        Float floatObj = 5.5f;
        Long longObj = 1000L;
        System.out.println("Float object: " + floatObj);
        System.out.println("Long object: " + longObj);
        String numStr = "123";
        Integer convertedNum = Integer.parseInt(numStr);
        System.out.println("Converted string to Integer: " + convertedNum);
    }
}