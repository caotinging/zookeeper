package com.caotinging.zkBase;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

/**
 * @program: zookeeper-study
 * @description: zookeeper基础Api的使用
 * @author: CaoTing
 * @date: 2019/4/28
 **/
public class zkBase {

    public static String address = "zookeeper://172.18.14.121:2181";

    /**
     * 创建zookeeper实例
     */
    public static ZooKeeper zk = null;

    /**
     * 创建一个监听实例：
     * 监听器的工作机制，其实是在客户端会专门创建一个监听线程，在本机的一个端口上等待
     */
    public Watcher wh = new Watcher() {
        @Override
        public void process(WatchedEvent event) {
            System.out.printf(event.toString());
        }
    };

    public static void main(String[] args) {
        // 建立zk连接
        if (zk == null) {

        }
    }
}
