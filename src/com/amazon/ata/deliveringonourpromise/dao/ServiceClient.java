package com.amazon.ata.deliveringonourpromise.dao;

import com.amazon.ata.deliveringonourpromise.types.Promise;

public interface ServiceClient {
    /**
     *
     * @param customerOrderItemId customerOrderItemId
     * @return return
     */
    Promise getDeliveryPromiseByOrderItemId(String customerOrderItemId);
}

/*
 Have each specific client implement this interface.
 This way, PromiseDao interacts with the ClientService interface,
 not knowing which specific client it's dealing with
 */
