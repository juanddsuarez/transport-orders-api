package com.juan.transportorders.service.impl;

import com.juan.transportorders.dto.OrderDto;
import com.juan.transportorders.entity.Order;
import com.juan.transportorders.enums.OrderStatus;
import com.juan.transportorders.mapper.OrderMapper;
import com.juan.transportorders.repository.OrderRepository;
import com.juan.transportorders.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    @Transactional
    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = orderMapper.toOrderCreated(orderDto);
        order.setStatus(OrderStatus.CREATED);
        Order createdOrder = orderRepository.save(order);
        return orderMapper.toOrderDto(createdOrder);
    }
}
