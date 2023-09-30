package Product;

public class GemReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("It is \u001b[;35mGEM\033[0m!");
    }
}
