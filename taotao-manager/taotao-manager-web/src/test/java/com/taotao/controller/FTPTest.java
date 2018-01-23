package com.taotao.controller;

import com.taotao.common.util.FtpUtil;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * ${DESCRIPTION}
 *
 * @author:LingDeng
 * @create 2018-01-16 19:49
 **/
public class FTPTest {

    @Test
    public void testFtpClient() throws Exception{
        //创建一个FtpClient对象
        FTPClient ftpClient=new FTPClient();
        //创建ftp连接。默认是21端口
        ftpClient.connect("192.168.123.96",21);
        //登录ftp服务器，使用用户名和密码
        ftpClient.login("ftpuser", "12345678");
        //上传文件
        FileInputStream inputStream=new FileInputStream(new File("G:\\小米路由器\\邓安汛\\p\\zx-5.jpg"));
        //设置上传的路径
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        //修改上传文件的格式
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        //第一个参数：服务器文档名
        //第二个参数:上传文档的inputStream
       // ftpClient.storeFile("hello1.jpg", inputStream);
        //关闭连接
        ftpClient.logout();
        inputStream.close();
    }

    @Test
    public void testFtpUtil() throws Exception{
        FileInputStream inputStream=new FileInputStream(new File("C:\\Users\\Administrator\\Pictures\\1.jpg"));
        //FtpUtil.uploadFile("192.168.123.96",21,"ftpuser","12345678","/home/ftpuser/www/images","/2015","1.jpg",inputStream);
    }

}
