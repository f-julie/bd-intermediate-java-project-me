package com.amazon.ata;

import com.amazon.ata.deliveringonourpromise.App;
import com.amazon.ata.deliveringonourpromise.dao.OrderDao;
import com.amazon.ata.deliveringonourpromise.ordermanipulationauthority.OrderManipulationAuthorityClient;
import com.amazon.ata.deliveringonourpromise.types.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class OrderDaoTest {
    OrderDao dao = App.getOrderDao();
    @Test
    void get_existingOrder_orderReturned() {
        // GIVEN - a valid orderId
        String orderId = "111-7497023-2960775";

        // WHEN - get the corresponding order
        Order result = dao.get(orderId);

        // THEN
        // an order object is returned
        assertNotNull(result);
        // with a matching id
        //assertEquals(orderId, result.get(orderId), "Returned OrderId should match given OrderId.");
    }

    @Test
    void get_orderDoesNotExist_nullReturned() {
        // GIVEN - an invalid orderId
        String orderId = "invalidOrderId";


        // WHEN - get the corresponding order
        Order result = dao.get(orderId);

        // THEN - null is returned rather than an order object
        assertNull(result, "Getting an order for an invalid orderId should return null.");
    }
}
