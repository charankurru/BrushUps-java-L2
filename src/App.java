import java.util.*;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Initializing :: Amazon small function");
        GenerateUsers gu = new GenerateUsers();
        GenerateItems gi = new GenerateItems();
        List<UserModel> userlst = gu.getUser();
        List<OrderModel> itemlst = gi.getItemsList();
        userlst.stream().parallel().forEach(e->
        {


        });
    }
}
