package Class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {


        Integer integer=new Integer(10);
        int number=integer;// AutoUnboxing
        int number2=integer.intValue();//unboxing


        double d=12.3;
        Double wrapperd=new Double(d); //old version style
        Double wrapperp=12.3;//AutoBoxing
        Double wrappernew=d;//AutoBoxing

        float f=12.4f;
        ArrayList<Long>arrayList=new ArrayList<>();
        arrayList.add(1264465l);
    }
}
