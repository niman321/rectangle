package Class27;

public class Demo2 {
    public static void main(String[] args) {// Create a method which can search name from this array list
        String name="savo";
        String[] names = {"hiral", "kawa", "laura", "nat"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            System.out.println(displayName(name,names));


        }


    }
    public static boolean displayName(String nametopbesearched, String[]names){
        for (String name:names){
            if (nametopbesearched.equals(name)){
                return true;
            }
        }

        return false;
    }
}
