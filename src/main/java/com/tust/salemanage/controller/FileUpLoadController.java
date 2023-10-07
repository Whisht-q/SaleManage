package com.tust.salemanage.controller;

import com.tust.salemanage.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;


@Controller
public class FileUpLoadController {

    @Autowired
    ProductMapper productMapper;

    @RequestMapping("/removeSession")
    public void removeSession(HttpSession session) {
        if (session.getAttribute("filename") != null) {

            session.removeAttribute("filename");
        }
    }


    @RequestMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpSession session) {

        int num = productMapper.getInsertNum();

        try {
            // 构建上传文件的目标路径
            String targetPath = FileUpLoadController.class.getProtectionDomain().getCodeSource().getLocation().getFile() + "static/images/" + num + ".png";
            targetPath = targetPath.substring(1);
            File targetFile = new File(targetPath);
            session.setAttribute("filename", num + ".png");


            // 将文件保存到目标路径
            file.transferTo(targetFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/manage";
    }
}
