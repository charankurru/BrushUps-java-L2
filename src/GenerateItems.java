import java.util.*;
public class GenerateItems {
    private final OrderModel item1 =  new OrderModel("laptop",1000,"1232");
    private final OrderModel item2 = new OrderModel("keyboard",500,"1233");
    private final OrderModel item3 =  new OrderModel("mouse",500,"1234");
    private final OrderModel item4 = new OrderModel("stand",600,"1235");

    List<OrderModel>getItemsList()
    {
        List<OrderModel>items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        return items;
    }

}
