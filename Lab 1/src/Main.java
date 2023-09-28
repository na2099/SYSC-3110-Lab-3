public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BuddyInfo buddy = new BuddyInfo("Homer", "1125 Colonel By Dr, Ottawa, ON", "613-520-3600");
        System.out.println("Hello " + buddy.getName());
        BuddyInfo buddy2 = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy2);
        addressBook.removeBuddy(buddy2);
        System.out.println("End of the program.");
    }
}