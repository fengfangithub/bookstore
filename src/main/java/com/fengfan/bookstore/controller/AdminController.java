package com.fengfan.bookstore.controller;

import com.fengfan.bookstore.entity.*;
import com.fengfan.bookstore.service.AdminService;
import com.fengfan.bookstore.tool.BaseResponse;
import com.fengfan.bookstore.tool.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName AdminController
 * @Author fengfan
 * @Date 2019/5/13 14:29
 * @Description TODO
 * @Version 1.0
 **/
@Controller
@RequestMapping("/admin")
@ResponseBody
@CrossOrigin(origins = "*", maxAge = 3600)
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/add-shelves")
    public BaseResponse addBookShelves(@RequestParam("show") MultipartFile[] show, @RequestParam("detailed") MultipartFile[] detailed, HttpServletRequest request, int bookID, int categoryID, String describe, BigDecimal price, BigDecimal originalPrice, BigDecimal postage, int points) {
        try {
            BookShelvesEntity bookShelvesEntity = new BookShelvesEntity();
            bookShelvesEntity.setBookID(bookID);
            bookShelvesEntity.setCategoryID(categoryID);
            bookShelvesEntity.setDescribe(describe);
//            bookShelvesEntity.setIsExpressFee(isExpressFee);
//            bookShelvesEntity.setIsReal(isReal);
//            bookShelvesEntity.setIsReturn(isReturn);
//            bookShelvesEntity.setIsRefund(isRefund);
            bookShelvesEntity.setPoints(points);
            bookShelvesEntity.setPrice(price);
            bookShelvesEntity.setOriginalPrice(originalPrice);
            bookShelvesEntity.setPostage(postage);
            adminService.insertBookShelves(bookShelvesEntity);
            String path = request.getSession().getServletContext().getRealPath("imag/book");
            File fileDir = new File(path);
            if(!fileDir.exists()){
                fileDir.mkdirs();
            }
            for (MultipartFile file : show) {
                if (!file.isEmpty()) {
                    String fileName = file.getOriginalFilename();
                    file.transferTo(new File(path + File.separator + fileName));
                    ShowImgEntity showImgEntity = new ShowImgEntity();
                    showImgEntity.setBookShelvesID(bookShelvesEntity.getId());
                    showImgEntity.setUrl("https://fengfan.xhban.com/bookstore/imag/book/" + fileName);
                    adminService.insertShowImage(showImgEntity);
                }
            }
            for (MultipartFile file : detailed) {
                if (!file.isEmpty()) {
                    String fileName = file.getOriginalFilename();
                    file.transferTo(new File(path + File.separator + fileName));
                    DetailedEntity detailedEntity = new DetailedEntity();
                    detailedEntity.setBookShelvesID(bookShelvesEntity.getId());
                    detailedEntity.setUrl("https://fengfan.xhban.com/bookstore/imag/book/" + fileName);
                    adminService.insertDetailed(detailedEntity);
                }
            }
            return new BaseResponse(StatusCode.ADMIN_INSERT_SHELVES_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/add-book")
    public BaseResponse addBook(BookEntity bookEntity) {
        try {
            adminService.insertBook(bookEntity);
            return new BaseResponse(StatusCode.ADMIN_INSERT_BOOK_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/login")
    public BaseResponse adminLogin(AdminEntity adminEntity, HttpServletRequest request) {
        try {
            HttpSession session = request.getSession(true);
            int result = adminService.queryAdmin(adminEntity.getName(), adminEntity.getPassword());
            if (result == 1) {
                session.setAttribute("name", adminEntity.getName());
                return new BaseResponse(StatusCode.ADMIN_LOGIN_SUCCESS);
            } else {
                return new BaseResponse(StatusCode.ADMIN_LOGIN_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/delivery")
    public BaseResponse delivery(int orderID) {
        try {
            int result = adminService.delivery(orderID);
            if (result == 1) {
                return new BaseResponse(StatusCode.ADMIN_DELIVERY_SUCCESS);
            } else {
                return new BaseResponse(StatusCode.ADMIN_DELIVERY_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/refund")
    public BaseResponse refund(int orderID) {
        try {
            int result = adminService.refund(orderID);
            if (result == 3) {
                return new BaseResponse(StatusCode.ADMIN_REFUND_SUCCESS);
            } else {
                return new BaseResponse(StatusCode.ADMIN_REFUND_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/update-shelves")
    public BaseResponse updateShelves(BookShelvesEntity bookShelvesEntity) {
        try {
            int result = adminService.updateShelves(bookShelvesEntity);
            if (result == 1) {
                return new BaseResponse(StatusCode.ADMIN_UPDATE_SUCCESS);
            } else {
                return new BaseResponse(StatusCode.ADMIN_UPDATE_FAIL);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/order-delivery")
    public BaseResponse<List<OrderEntity>> queryDelivery(){
        try {
            List<OrderEntity> orderEntityList = adminService.queryOrder();
            return new BaseResponse<>(StatusCode.ORDER_QUERY_SUCCESS,orderEntityList);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }

    @RequestMapping("/order-refund")
    public BaseResponse<List<OrderEntity>> queryRefund(){
        try {
            List<OrderEntity> orderEntityList = adminService.queryRefund();
            return new BaseResponse<>(StatusCode.ORDER_QUERY_SUCCESS,orderEntityList);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponse<>(StatusCode.EXCEPTION);
        }
    }
}
