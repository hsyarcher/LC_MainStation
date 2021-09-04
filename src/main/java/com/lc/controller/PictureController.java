package com.lc.controller;

import com.lc.service.PictureService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/lc/picture")
public class PictureController {
    @Autowired
    private PictureService pictureService;

    @PostMapping("/upload")
    public ResultVO uploadPicture(MultipartFile file,Long id){
        return pictureService.uploadPicture(file,id);
    }

    @DeleteMapping("/delete")
    public ResultVO deletePicture(String name){
        return deletePicture(name);
    }

    @GetMapping("/getPicture")
    public ResultVO getPictures(Long id){
        return pictureService.getPicture(id);
    }
}
