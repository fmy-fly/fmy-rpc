package com.seu.fmy.provider;

import com.seu.fmy.rpc.server.HttpServer;
import com.seu.fmy.rpc.server.VertxHttpServer;


public class Provider {
    public static void main(String [] args) {
        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
