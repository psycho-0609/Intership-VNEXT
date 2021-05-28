package com.example.demofirebase.controller;

import com.example.demofirebase.service.FirebaseInitialization;
import com.example.demofirebase.service.IUploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TestController {
    @Autowired
    IUploadFileService imageService;

    @PostMapping("/api/test")
    public ResponseEntity create(@RequestParam(name = "file")MultipartFile file){
        System.out.println(file.getOriginalFilename());
        try {

            String fileName = imageService.save(file);

            String imageUrl = imageService.getImageUrl(fileName);

            // do whatever you want with that
            System.out.println(imageUrl);

        } catch (Exception e) {
            //  throw internal error;
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok().build();
    }
}
