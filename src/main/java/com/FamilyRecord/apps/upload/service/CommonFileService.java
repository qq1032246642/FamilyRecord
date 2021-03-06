package com.FamilyRecord.apps.upload.service;

import com.FamilyRecord.abstractApps.BaseService;
import com.FamilyRecord.apps.system.entity.HomeRequest;
import com.FamilyRecord.apps.upload.entity.CommonFile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuan on 2018/3/27.
 */
@Service
public class CommonFileService extends BaseService {

    public List selectPhotoOrVideo(CommonFile commonFile){
        return sqlSessionTemplate.selectList("commonFile.select",commonFile);
    }

    public boolean addFiles(List files){
        int i = sqlSessionTemplate.insert("commonFile.insertFiles",files);
        return i>0;
    }

    public boolean deleteCommonFile(String id){
        int i = sqlSessionTemplate.update("commonFile.deleteCommonFile",id);
        return i>0;
    }

    public boolean deletePhotoByAlbumId(String rId){
        int i = sqlSessionTemplate.update("commonFile.deletePhotoByAlbumId",rId);
        return i>0;
    }

    public List selectTopPhotho(HomeRequest homeRequest){
        return sqlSessionTemplate.selectList("commonFile.selectTopPhoto",homeRequest);
    }

    public List selectTopVideo(HomeRequest homeRequest){
        return sqlSessionTemplate.selectList("commonFile.selectTopVideo",homeRequest);
    }

}
