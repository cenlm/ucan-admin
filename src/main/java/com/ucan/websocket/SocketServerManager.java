package com.ucan.websocket;

import java.util.Objects;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description: SocketServer 获取工具
 * @author liming.cen
 * @date 2024-07-11 19:33:33
 * 
 */
@Component
public class SocketServerManager implements InitializingBean, DisposableBean {
    @Autowired
    private SocketServer socketServer;

    /**
     * 从bean工厂中获取socketServer
     * 
     * @return
     */
    public SocketServer getSocketServer() {
        return socketServer;
    }

    @Override
    public void destroy() throws Exception {
        if (!Objects.isNull(socketServer)) {
            // 停止socket服务器
            socketServer.stop();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 启动web socket服务
        socketServer.start();
    }

}
