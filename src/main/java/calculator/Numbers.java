package calculator;

public abstract class Numbers {

    protected int var1;
    protected int var2;

    public int getVar1() {
        return this.var1;
    }

    public void setVar1(String value) {
        int num = stringToInt(value);
        if(num >= 1 && num <= 10){
            this.var1 = num;
            return;
        }
        throw new RuntimeException("Выражение введено неверно!!!");
    }

    public int getVar2() {
        return this.var2;
    }

    public void setVar2(String value) {
        int num = stringToInt(value);
        if(num >= 1 && num <= 10){
            this.var2 = num;
            return;
        }
        throw new RuntimeException("Выражение введено неверно!!!");
    }

    public abstract int stringToInt(String arg);

    public abstract String getResult(int arg);
}
