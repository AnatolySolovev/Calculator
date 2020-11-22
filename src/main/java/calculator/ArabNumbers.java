package calculator;

public class ArabNumbers extends Numbers {
    @Override
    public int stringToInt(String arg) {
        Integer num = new Integer(arg);
        return num;
    }

    @Override
    public String getResult(int arg){
        Integer result = new Integer(arg);
        return result.toString();
    }

}
