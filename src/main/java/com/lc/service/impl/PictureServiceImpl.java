package com.lc.service.impl;

import com.lc.dao.PictureMapper;
import com.lc.entity.Picture;
import com.lc.service.PictureService;
import com.lc.utils.PictureUtils;
import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;



@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public ResultVO uploadPicture(MultipartFile file,Long id) {
        //只实现保存数据库的功能
        String filename = PictureUtils.uploadPicture(file);

        Picture picture = new Picture();
        picture.setPictureName(filename);
        picture.setAlbumId(id);

        pictureMapper.insert(picture);

        return ResultVOUtil.success(filename);

    }

    @Override
    public ResultVO deletePicture(String name) {
        PictureUtils.deletePicture(name);//服务器中删除图片
        Picture picture = pictureMapper.selectByName(name);
        if (pictureMapper.deleteByPrimaryKey(picture.getPictureId())==1){
            return ResultVOUtil.success("删除成功");
        }else{
            return ResultVOUtil.error("删除失败");
        }

    }

    @Override
    public ResultVO getPicture(Long id) {
        return ResultVOUtil.success(pictureMapper.selectByAlbumId(id));
    }
}
