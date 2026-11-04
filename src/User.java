public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int uniqueId;
    private static int totalUsers=0;
    public User(){
        totalUsers++;
        userId = generateUniqueId();
    }

    public User(String userId, String name, String contactInfo){
        this();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User obj){
        totalUsers++;
        this.userId = generateUniqueId();
        this.name = obj.name;
        this.contactInfo = obj.contactInfo;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    private static String generateUniqueId(){
        return "U-" + (++uniqueId);
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    private static int getTotalUsers(){
        return totalUsers;
    }
}
