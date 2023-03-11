package Class22;

public class Employee {
    String name;
   static int baseSalary=300000;
   static int baseHolidays=10;
    void printSalary(){
        System.out.println(baseSalary);
    }
    void PrintHoliday(){
        System.out.println(baseHolidays);
    }

}
class officeBoys extends Employee{

}
class manager extends Employee{
    void printSalary(){
        System.out.println((baseSalary*2)+1000);
    }
}
class developer extends Employee{
    void printSalary(){
        System.out.println((baseSalary*3)+4000);
    }
}
class QA extends Employee{
    void printSalary(){
        System.out.println((baseSalary*7)+6000);
    }
}
