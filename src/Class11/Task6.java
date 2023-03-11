package Class11;

public class Task6 {
    public static void main(String[] args) {
        String[][]counties={{"usa","canada","mexico"},
                             {"brazil","Argentina","peru","colombia","chile"},
                              {"germany","united","kingdom","france","spain"},
                               {"china","india","japan","russia"},
                              {"egypt","nigeria","southAfrica","ethiopia"},
        };
        int counter=0;
        for (String[] county : counties) {
            for (String s : county) {
                System.out.print(s + " ");
                counter++;

            }
            System.out.println();

        }
        System.out.println("total countries "+counter);



    }

}
