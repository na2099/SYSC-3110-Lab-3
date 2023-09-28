public class BuddyInfo {
    public BuddyInfo(){
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String phoneNumber;
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
