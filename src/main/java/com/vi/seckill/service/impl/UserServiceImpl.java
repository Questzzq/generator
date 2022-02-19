package com.vi.seckill.service.impl;

import com.vi.seckill.pojo.User;
import com.vi.seckill.mapper.UserMapper;
import com.vi.seckill.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Eric Tseng
 * @since 2022-02-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
