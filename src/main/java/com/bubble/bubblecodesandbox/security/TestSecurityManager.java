package com.bubble.bubblecodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TestSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());

//        List<String> strings = FileUtil.readLines("D:\\springboottest\\bubble-code-sandbox\\src\\main\\resources\\application.yml", StandardCharsets.UTF_8);
        FileUtil.writeString("aa","aaa", Charset.defaultCharset());
//        System.out.println(strings);
    }
}
