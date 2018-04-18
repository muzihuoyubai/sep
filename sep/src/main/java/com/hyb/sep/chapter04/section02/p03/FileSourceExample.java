package com.hyb.sep.chapter04.section02.p03;

import org.springframework.core.io.*;
import org.springframework.util.ResourceUtils;

import java.io.IOException;

public class FileSourceExample {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("chapter04");
        System.out.println(resource.exists());
        resource.isReadable();
        boolean isFileUrl = ResourceUtils.isFileURL(resource.getURL());
        System.out.println(isFileUrl);
    }
}
