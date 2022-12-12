/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse.Orders;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author asus
 */
public class OrderDirectory {
    
    ArrayList<Order> orderList = new ArrayList<>();
    String last_order_id = "ORDER001";
    public String getLast_order_id() {
        return last_order_id;
    }

    public void setLast_order_id(String last_order_id) {
        this.last_order_id = last_order_id;
    }
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order order){
        orderList.add(order);
    }
    
   

   
    
    
}
