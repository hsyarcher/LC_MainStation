package com.lc.controller;

import com.lc.service.PictureService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/lc/picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @PostMapping("/upload")
    public ResultVO uploadPicture(MultipartFile file){
        return pictureService.uploadPicture(file);
    }

    @DeleteMapping("/delete")
    public ResultVO deletePicture(String name){
        return deletePicture(name);
    }
}
