package Tomato.Factories;

import java.util.List;
import Tomato.models.*;
import Tomato.strategies.*;

public interface OrderFactory {
    Order createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem> menuItems,
                      PaymentStrategy paymentStrategy, double totalCost, String orderType);
}
