package com.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlInstall {


    public static void main(String[] args) throws Exception {
        downloadFile("http://freevod.m5g.migu.cn/public/ringmaker01/mv02/MVcolor/product/201907/2513/2019%E5%B9%B407%E6%9C%8819%E6%97%A515%E7%82%B935%E5%88%8644%E7%A7%92%E9%87%91%E7%86%8A%E7%8C%AB%E6%96%B0%E5%AA%92%E4%BD%93%E5%87%86%E5%85%A5%E8%A7%86%E9%A2%91%E5%BD%A9%E9%93%8315%E9%A6%96/WScreenMP4/699234T0011.mp4?k=7741e144&t=1608884241875&channelId=10&msisdn=2426647611","D:/e.mp4");

    }


    public static void  downloadFile(String fileUrl, String fileLocal) throws Exception {
        URL url = new URL(fileUrl);
        HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
        urlCon.setConnectTimeout(6000);
        urlCon.setReadTimeout(6000);
        int code = urlCon.getResponseCode();
        if (code != HttpURLConnection.HTTP_OK) {
            throw new Exception("文件读取失败");
        }
        System.out.println(urlCon.getContentLengthLong());

        //读文件流
        DataInputStream in = new DataInputStream(urlCon.getInputStream());
        File file = new File(fileLocal);
        file.createNewFile();
        DataOutputStream out = new DataOutputStream(new FileOutputStream(fileLocal));
        byte[] buffer = new byte[2048];
        int count = 0;
        while ((count = in.read(buffer)) > 0) {
            out.write(buffer, 0, count);
        }
        out.close();
        in.close();
    }
}
