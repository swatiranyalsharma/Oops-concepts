public class Dummy implements Lendable{
    public boolean lend(User user){
        return true;
    }
    public void returnItem(User user){

    }
    public boolean isAvailable(){
        return true;
    }
}
