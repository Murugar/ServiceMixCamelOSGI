
package com.iqmsoft.osgi.order.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iqmsoft.osgi.order.common.Order;

public class OrderProcessor {
    private static final Logger LOG = LoggerFactory.getLogger(OrderProcessor.class);

    public void doWork(Order order) {
        LOG.info("Received order for {} {}s.", order.getAmount(), order.getName());
    }
}
