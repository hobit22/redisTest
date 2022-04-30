package com.aws.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RedisController {

    @Autowired
    private final RedisService redisService;

    @GetMapping("/")
    public String test() {
        redisService.redisString();
        return "test";
    }
}