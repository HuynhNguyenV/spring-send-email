package com.huynh.springresourcefolder;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class DemoReadResourceFile {

    public static void readFileUsingResourceUtils() throws IOException {
        System.out.println("Read file from resource folder using Spring ResourceUtils");
        File file = ResourceUtils.getFile("classpath:files/demo.txt");

        //Read file content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);
    }

    public static void main(String[] args) throws IOException {

        readFileUsingResourceUtils();
    }
}
