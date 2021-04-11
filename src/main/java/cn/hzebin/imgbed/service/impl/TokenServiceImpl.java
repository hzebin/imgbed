package cn.hzebin.imgbed.service.impl;

import cn.hzebin.imgbed.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * token服务层实现类
 * @author 黄泽彬
 */
@Slf4j
@Service
public class TokenServiceImpl implements TokenService {

    /**
     * 创建token
     */
    @Override
    public void createToken() {

    }
}
