package com.example.demo;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author issac.hu
 */
public class SimpleTest {

    public static void main(String[] args) {
        // 加密
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //使用的是加密算法是:PBEWithMD5AndDES,注意maven不同版本算法可能不同
        textEncryptor.setPassword("123456");
        String newPassword = textEncryptor.encrypt("123456");
        System.out.println(newPassword);
        // 解密
        BasicTextEncryptor textEncryptor2 = new BasicTextEncryptor();
        textEncryptor2.setPassword("123456");
        String oldPassword = textEncryptor2.decrypt("hzh730PDIkejKz1FAEAKww==");
        System.out.println(oldPassword);
        System.out.println("--------------------------");


    }
}
