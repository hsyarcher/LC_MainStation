package com.lc.utils;

import com.lc.dao.PictureMapper;
import com.lc.entity.Picture;
import com.lc.service.PictureService;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class PictureUtils {

    public static String uploadPicture(MultipartFile file) {
        String filename = String.valueOf(System.currentTimeMillis());
        String filePath = System.getProperty("user.dir")+"/img";
        if (!new File(filePath).exists()){
            new File(filePath).mkdirs();
        }
        File dest = new File(filePath + File.separator +"_"+filename);
        try {
            file.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "/img/" + "_"+filename;

    }

    public static void deletePicture(String name) {
        String filePath = System.getProperty("user.dir");
        if (new File(filePath + name).exists()){
            new File(filePath + name).delete();//删除服务器的图片
        }

    }
}
