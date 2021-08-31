package com.lc.service.impl;

import com.lc.dao.PictureMapper;
import com.lc.entity.Picture;
import com.lc.service.PictureService;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;


@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public ResultVO uploadPicture(MultipartFile file) {
        String filename = file.getOriginalFilename();
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

        Picture picture = new Picture();
        picture.setPictureName("/img/" + "_"+filename);
        if(pictureMapper.insert(picture)==1){
            return ResultVOUtil.success("/img/" + "_"+filename);
        }else{
            new File(filename).delete();//上传失败后删除数据库的图片
            return ResultVOUtil.error("上传失败！");
        }
    }

    @Override
    public ResultVO deletePicture(String name) {
        String filePath = System.getProperty("user.dir");
        Picture picture = pictureMapper.selectByName(name);
        System.out.println("路径为：" + filePath+name);
        if (new File(filePath + name).exists()){
            //删除数据库的图片
            new File(filePath + name).delete();//删除数据库的图片
        }
        if (pictureMapper.deleteByPrimaryKey(picture.getPictureId())==1){
            return ResultVOUtil.success("删除成功");
        }else{
            return ResultVOUtil.error("删除失败");
        }

    }
}
