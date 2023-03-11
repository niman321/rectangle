package Class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EXcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String>row1=new LinkedHashMap<>();
        row1.put("name","nima");
        row1.put("age","30");
        row1.put("city","london");
        row1.put("salary","1200000");

        LinkedHashMap<String,String>row2=new LinkedHashMap<>();
        row2.put("name","sam");
        row2.put("age","60");
        row2.put("city","houston");
        row2.put("salary","150000");


        LinkedHashMap<String,String>row3=new LinkedHashMap<>();
        row3.put("name","fayed");
        row3.put("age","45");
        row3.put("city","milan");
        row3.put("salary","100000");


        List<Map<String,String>>allrows=new ArrayList<>();
        allrows.add(row1);
        allrows.add(row2);
        allrows.add(row3);
        System.out.print(allrows+"   ");


    }

}
