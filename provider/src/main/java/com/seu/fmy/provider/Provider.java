package com.seu.fmy.provider;

import com.seu.fmy.common.service.UserService;
import com.seu.fmy.rpc.registry.LocalRegistry;
import com.seu.fmy.rpc.server.HttpServer;
import com.seu.fmy.rpc.server.VertxHttpServer;


public class Provider {
    public static void main(String [] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
