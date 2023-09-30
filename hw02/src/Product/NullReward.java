package Product;

public class NullReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("Sorry, nothing there.");
    }
}
