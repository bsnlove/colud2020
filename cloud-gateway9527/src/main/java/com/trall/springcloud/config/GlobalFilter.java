package com.trall.springcloud.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by 陈兵 on 2020/5/10.
 */
@Component
public class GlobalFilter implements GatewayFilter,Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange, GatewayFilterChain gatewayFilterChain) {
        MultiValueMap<String, String> params = serverWebExchange.getRequest().getQueryParams();
        List<String> userName = params.get("userName");
        if(userName==null){
            serverWebExchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return serverWebExchange.getResponse().setComplete();
        }
        return gatewayFilterChain.filter(serverWebExchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
