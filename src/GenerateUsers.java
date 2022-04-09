import java.util.*;

public class GenerateUsers {
    UserModel user1 = new UserModel("charan",21);
    UserModel user2 = new UserModel("leela",21);
    UserModel user3 = new UserModel("hari",23);

    GenerateUsers()
    {
        List<String> ls1 = new ArrayList<>();
        ls1.add("1232");
        ls1.add("1233");
        ls1.add("1234");

        List<String> ls2 = new ArrayList<>();
        ls1.add("1232");
        ls1.add("1235");
        ls1.add("1234");

        List<String> ls3 = new ArrayList<>();
        ls1.add("1233");
        ls1.add("1235");

        user1.setOrders(ls1);
        user2.setOrders(ls2);
        user3.setOrders(ls3);

    }

    List<UserModel>getUser()
    {
        return new ArrayList<UserModel>(){
            {
                add(user1);
                add(user2);
                add(user3);
            }
        };
    }
}
