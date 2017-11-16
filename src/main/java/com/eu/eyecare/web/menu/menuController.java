package com.eu.eyecare.web.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

@Controller
@RequestMapping("/menu")
public class menuController extends HttpServlet {

    //用户
    @RequestMapping("/user")
    public String tronClass() {
        return "web/user/user";
    }

    //客户
    @RequestMapping("/customer")
    public String customerce() {
        return "web/customer/customer";

    }

    //废钢类型
    @RequestMapping("/pushNursing")
    public String steel() {
        return "web/pushNursing/pushNursing";
    }

    //库房
    @RequestMapping("/storage")
    public String storage() {
        return "web/storage/storage";
    }

    //
    @RequestMapping("/stock")
    public String stock() {
        return "web/stock/stock";
    }

    @RequestMapping("/Sale")
    public String Sale() {
        return "web/sale/sale";
    }

    @RequestMapping("/recovery")
    public String recovery() {
        return "web/recovery/recovery";
    }

    @RequestMapping("/reckonRecover")
    public String reckonRecover() {
        return "web/reckon/reckonRecovery";
    }

    @RequestMapping("/reckonSale")
    public String reckonSale() {
        return "web/reckon/reckonSale";
    }

    @RequestMapping("/findRecover")
    public String findRecover() {
        return "web/reportForm/reportFormRecover";
    }

    @RequestMapping("/findSale")
    public String findSale() {
        return "web/reportForm/reportFormSale";
    }


}
