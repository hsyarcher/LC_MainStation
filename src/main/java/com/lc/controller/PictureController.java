package com.lc.controller;

import com.lc.service.PictureService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/lc")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @PostMapping("/upload")
    public ResultVO uploadPicture(@RequestParam("file") MultipartFile file){
        return pictureService.uploadPicture(file);
    }

    @DeleteMapping("/delete")
    public ResultVO deletePicture(@RequestParam("name") String name){
        return pictureService.deletePicture(name);
    }
}
