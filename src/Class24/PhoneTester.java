package Class24;

public class PhoneTester {
    public static void main(String[] args) {
        Phone [] phones={new Iphone(),new samsung()};
        for (Phone phone:phones){
            phone.displayPictures();
            phone.unlockPhone();
            phone.sendText();

        }


        for (int i = 0; i < phones.length; i++) {
            Phone f=phones[i];
            f.unlockPhone();
            f.displayPictures();
            f.sendText();


        }

    }
}
