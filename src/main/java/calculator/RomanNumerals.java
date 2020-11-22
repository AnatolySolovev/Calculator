package calculator;

public enum RomanNumerals {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100);

    private int value;

    RomanNumerals(int value) {
        this.value = value;
    }

    public int getArabicNumerals() {
        return value;
    }

    public static int[] getAllArabicNumerals(){
        int[] arr = {1,4,5,9,10,40,50,90,100};
        return arr;
    }

    public static RomanNumerals[] getAllRomanNumerals(){
        RomanNumerals[] rn = {I,IV,V,IX,X,XL,L,XC,C};
        return rn;
    }
}
