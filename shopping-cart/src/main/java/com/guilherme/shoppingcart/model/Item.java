package com.guilherme.shoppingcart.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("item")
public class Item {

    private Integer productId;
    private Integer amount;

}
