/*
package com.amazon.ata;

import com.amazon.ata.deliveringonourpromise.dao.OrderDao;
import com.amazon.ata.deliveringonourpromise.ordermanipulationauthority.OrderManipulationAuthorityClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class OrderDaoTest {
    @Test
    void get_existingOrder_orderReturned() {
        // GIVEN - a valid orderId
        String orderId = "testOrderId";

        // WHEN - get the corresponding order
        OrderDao result = OrderDao.get(orderId);

        // THEN
        // an order object is returned
        assertNotNull(result);
        // with a matching id
        assertEquals(orderId, result.get(orderId), "Returned OrderId should match given OrderId.");
    }

    @Test
    void get_orderDoesNotExist_nullReturned() {
        // GIVEN - an invalid orderId
        String orderId = "invalidOrderId";


        // WHEN - get the corresponding order
        OrderDao result = OrderDao.get(orderId);

        // THEN - null is returned rather than an order object
        assertNull(result, "Getting an order for an invalid orderId should return null.");
    }

    @Test
    public void get_isValidOrderIdIsFalse_returnsNull() {
        // GIVEN

        // WHEN

        // THEN

    }


}

*/