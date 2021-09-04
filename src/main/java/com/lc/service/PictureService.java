package com.lc.service;

import com.lc.utils.ResultVOUtil;
import com.lc.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface PictureService {
    ResultVO uploadPicture(MultipartFile file,Long id);

    ResultVO deletePicture(String name);

    ResultVO getPicture(Long id);
}
