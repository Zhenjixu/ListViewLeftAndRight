package com.example.administrator.listviewleftandright.liaotian;
//　┏┓　　　┏┓
//┏┛┻━━━┛┻┓
//┃　　　　　　　┃ 　
//┃　　　━　　　┃
//┃　┳┛　┗┳　┃
//┃　　　　　　　┃
//┃　　　┻　　　┃
//┃　　　　　　　┃          神兽保佑
//┗━┓　　　┏━┛          代码无bug！！！
//　　┃　　　┃　　　　　　　　　
//　　┃　　　┃
//　　┃　　　┗━━━┓
//　　┃　　　　　　　┣┓
//　　┃　　　　　　　┏┛
//　　┗┓┓┏━┳┓┏┛
//　　　┃┫┫　┃┫┫
//　　　┗┻┛　┗┻┛

import android.util.Log;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created by zjx
 * on 2018/7/3 0003.
 * at 北京
 * Email : 2116301224@qq.com
 * QQ:2116301224
 * WX:zhenjixu0928
 */
public class Send {

    public static String getUDP(String msgSend) throws Exception {
        // 创建UDP对象
        DatagramSocket ds = new DatagramSocket(1994);
        // 创建键盘录入对象
//        Scanner scanner = new Scanner(System.in);
        // 循环发送
        String string = "";

        // 录入数据
//            String s = scanner.nextLine();
        // 把数据转成数组
        byte[] bytes = msgSend.getBytes();
        // 把数据进行打包
        DatagramPacket dp1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 1995);
        // 发送数据
        ds.send(dp1);
        // 判断数据是不是886
        if (msgSend.equals("886"))
            return msgSend;

        // 创建一个空包
        byte[] bs = new byte[1024];
        // 接收数据
        DatagramPacket dp = new DatagramPacket(bs, bs.length);
        ds.receive(dp);
        // 把数据打印
        string = new String(bs, 0, dp.getLength());
        Log.e("TAG", string);
        // 判断数据是不是886
        if (msgSend.equals("886"))
            return msgSend;


        // 关流
        ds.close();

        return string;

    }

    public static void sendUDP(String msg) throws Exception {
        // 创建UDP对象
        DatagramSocket ds = new DatagramSocket(1995);
        // 创建键盘录入对象
//        Scanner scanner = new Scanner(System.in);
        // 循环接受

        // 创建一个空包
        byte[] bs = new byte[1024];
        // 接收数据
        DatagramPacket dp = new DatagramPacket(bs, bs.length);
        ds.receive(dp);
        // 把数据打印
        String string = new String(bs, 0, dp.getLength());
        Log.e("TAG", string);
        // 判断数据是不是886
        if (string.equals("886"))
            return;

        // 录入数据
//            String s = scanner.nextLine();
        // 把数据转成数组
        byte[] bytes = msg.getBytes();
        // 把数据进行打包
        DatagramPacket dp1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 1994);
        // 发送数据
        ds.send(dp1);
        // 判断数据是不是886
        if (msg.equals("886"))
            return;


        // 关流
        ds.close();
//        scanner.close();

    }
}
