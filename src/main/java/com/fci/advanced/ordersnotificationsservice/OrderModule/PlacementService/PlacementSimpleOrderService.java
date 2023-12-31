package com.fci.advanced.ordersnotificationsservice.OrderModule.PlacementService;//package com.fci.advanced.ordersnotificationsservice.OrderModule.PlacementService;
//
//import com.fci.advanced.ordersnotificationsservice.OrderModule.Order;
//import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderService;
//import com.fci.advanced.ordersnotificationsservice.OrderModule.OrderServices.OrderValidationService;
//
//public class PlacementSimpleOrderService implements PlacementService {
//
//
//    @Override
//    public void placeOrder(Order order) {
//        OrderService orderService = order.getOrderService();
//        if(order.getOrderService() instanceof OrderValidationService){
//            OrderValidationService orderValidationService = (OrderValidationService) orderService ;
//
//            double customerBalance = order.getCustomer().getBalance();
//            double totalCost =  orderValidationService.isBalanceSufficient(order);
//
//            if(orderValidationService.validateCustomer(order) && totalCost <= customerBalance){
//                order.getCustomer().setBalance(customerBalance - totalCost);
//                order.setOrderStatus(true);
//            }
//            else{
//                order.setOrderStatus(false);
//            }
//        }
//    }
//
//    @Override
//    public Order showDetails(Order order) {
//        return order;
//    }
//}
