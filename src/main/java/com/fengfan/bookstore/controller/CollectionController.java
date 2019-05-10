package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.CollectionEntity;
import com.fengfan.bookstore.service.CollectionService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import com.fengfan.bookstore.vo.CollectionInsert;
import com.fengfan.bookstore.vo.CollectionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CollectionController
 * @Author fengfan
 * @Date 2019/4/23 14:33
 * @Description TODO
 * @Version 1.0
 **/
@Controller
@RequestMapping("/collection")
@ResponseBody
public class CollectionController {

    @Autowired
    private CollectionService collectionService;

    @RequestMapping("/add")
    public BaseResponse<CollectionInsert> addCollection(CollectionEntity collectionEntity) {
        try {
            int result = collectionService.insertCollection(collectionEntity);
            if (result == 1) {
                CollectionInsert collectionInsert = new CollectionInsert();
                collectionInsert.setId(collectionEntity.getId());
                return new BaseResponse<>(StatusCode.COLLECTION_ADD_SUCCESS,collectionInsert);
            }
            return new BaseResponse<>(StatusCode.COLLECTION_ADD_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/list")
    public BaseResponse<List<CollectionVo>> queryCollection(int userID) {
        try {
            List<CollectionVo> collectionVos = collectionService.queryCollection(userID);
            if (collectionVos.size() > 0) {
                return new BaseResponse<>(StatusCode.COLLECTION_QUERY_SUCCESS, collectionVos);
            }
            return new BaseResponse<>(StatusCode.COLLECTION_QUERY_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/delete")
    public BaseResponse deleteCollection(int id){
        try {
            int result = collectionService.deleteCollection(id);
            if(result == 1){
                return new BaseResponse(StatusCode.COLLECTION_DELETE_SUCCESS);
            }
            return new BaseResponse(StatusCode.COLLECTION_DELETE_FAIL);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

}
