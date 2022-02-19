package com.vi.seckill.service.impl;

import com.vi.seckill.pojo.Order;
import com.vi.seckill.mapper.OrderMapper;
import com.vi.seckill.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Eric Tseng
 * @since 2022-02-20
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
