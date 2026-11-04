public interface Lendable {
    public boolean lend(User user);
    public void returnItem(User user);
    public boolean isAvailable();
}
