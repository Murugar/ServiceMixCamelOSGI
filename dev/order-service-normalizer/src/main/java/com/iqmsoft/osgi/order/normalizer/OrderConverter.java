
package com.iqmsoft.osgi.order.normalizer;

import java.util.ArrayList;
import java.util.Map;

import org.apache.camel.Converter;

import com.iqmsoft.osgi.order.common.Order;

@Converter
public class OrderConverter {

    @Converter
    public static Order toOrder(ArrayList<Map<String, Object>> csvOrder) {
        Order order = null;
        Map<String, Object> map = csvOrder.get(0);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            order = (Order) entry.getValue();
            break;
        }
        return order;
    }
}
