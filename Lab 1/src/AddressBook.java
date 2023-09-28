import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> all_buddyInfo = new ArrayList<>();
    //public ArrayList<BuddyInfo> all_BuddyInfo;
    public static void main(String [] args) {


        System.out.println("Address Book");
    }

    public void addBuddy (BuddyInfo aBuddy){
        all_buddyInfo.add(aBuddy);
    }

    public void removeBuddy (BuddyInfo aBuddy){
        all_buddyInfo.remove(aBuddy);
    }

}
