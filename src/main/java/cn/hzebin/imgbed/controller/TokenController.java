package cn.hzebin.imgbed.controller;

import cn.hzebin.imgbed.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * token控制层
 * @author 黄泽彬
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private TokenService targetService;

    @PostMapping("/create")
    public void createToken() {
        targetService.createToken();
    }

}
