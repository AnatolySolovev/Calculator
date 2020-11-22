package calculator;

public class RomNumbers extends Numbers {

    @Override
    public int stringToInt(String arg) {
        String[] strings = arg.split("");
        int num = 0;
        try {
            String temp = null;
            int check = 1;
            for (String str:strings
                 ) {
                if (temp == null){
                    temp = str;
                }
                else if (RomanNumerals.valueOf(temp).getArabicNumerals() > RomanNumerals.valueOf(str).getArabicNumerals()){
                    num += RomanNumerals.valueOf(temp).getArabicNumerals();
                    temp = str;
                }
                else if (RomanNumerals.valueOf(temp).getArabicNumerals() < RomanNumerals.valueOf(str).getArabicNumerals()){
                    temp += str;
                    num += RomanNumerals.valueOf(temp).getArabicNumerals();
                    temp = null;
                    if (check >= 2){
                        return -1;
                    }
                }
                else if (RomanNumerals.valueOf(temp).getArabicNumerals() == RomanNumerals.valueOf(str).getArabicNumerals()){
                    if (RomanNumerals.valueOf(str).getArabicNumerals() == 1) {
                        num += RomanNumerals.valueOf(str).getArabicNumerals();
                        temp = str;
                        check++;
                    }
                    else
                        return -1;
                }
            }
            if (temp != null)
                num += RomanNumerals.valueOf(temp).getArabicNumerals();
        } catch (Exception e){
            e.printStackTrace();
        }
        return num;
    }

    @Override
    public String getResult(int arg) {
        int var = Math.abs(arg);
        String result = new String();
        if (arg < 0)
            result += "-";
        int[] arr = RomanNumerals.getAllArabicNumerals();
        RomanNumerals[] arrAllRN = RomanNumerals.getAllRomanNumerals();
        for (int i = arr.length-1; i >= 0; i--){
            if (var == 0)
                break;
            int temp = var/arr[i];
            if (temp != 0 ) var -= (temp * arr[i]);
            while (temp != 0){
                temp--;
                result += arrAllRN[i].toString();
            }
        }
        return result;
    }
}
