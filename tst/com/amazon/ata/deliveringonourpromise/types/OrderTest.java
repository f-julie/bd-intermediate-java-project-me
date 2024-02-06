package com.amazon.ata.deliveringonourpromise.types;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    public void testOrderImmutability() {
        OrderItem item = OrderItem.builder().build();
        List<OrderItem> items = new ArrayList<>();
        items.add(item);

        Order order = Order.builder()
                //.withOrderId("1")
                //.withCustomerId("cust1")
                //.withMarketplaceId("market1")
                //.withCondition(OrderCondition.NEW)
                .withCustomerOrderItemList(items)
                //.withShipOption("Fast")
                //.withOrderDate(ZonedDateTime.now())
                .build();

        // Try to modify the original list
        items.add(OrderItem.builder().build());

        // The order's item list should not be affected
        assertEquals(1, order.getCustomerOrderItemList().size());

        // Try to modify the order's item list directly
        //assertThrows(UnsupportedOperationException.class, () -> {
        //    order.getCustomerOrderItemList().add(new OrderItem("item3", 30));
        //});
    }
}