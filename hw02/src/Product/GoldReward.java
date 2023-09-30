package Product;

public class GoldReward extends ItemReward{
    @Override
    public void open() {
        System.out.println("It is  \u001b[;33mGOLD\033[0m!");
    }
}
