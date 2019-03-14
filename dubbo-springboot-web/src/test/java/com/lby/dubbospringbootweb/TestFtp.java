package com.lby.dubbospringbootweb;

import org.apache.commons.net.ftp.FTPClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: TSF
 * @Description:
 * @Date: Create in 2018/12/3 16:30
 */
public class TestFtp {
    public static void main(String[] args) throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.17.128", 21);
        ftpClient.login("ftpuser", "123");
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        InputStream inputStream = new FileInputStream("D:\\呐哈哈哈\\珈百璃-4.jpg");
        ftpClient.storeFile("jbl.jpg", inputStream);
        ftpClient.logout();
    }
}
