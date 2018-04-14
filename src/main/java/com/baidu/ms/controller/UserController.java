package com.baidu.ms.controller;

import com.baidu.ms.common.YzbConstants;
import com.baidu.ms.pojo.Shop;
import com.baidu.ms.pojo.SystemConfig;
import com.baidu.ms.pojo.User;
import com.baidu.ms.service.ShopService;
import com.baidu.ms.service.SystemConfigService;
import com.baidu.ms.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/5.
 */


@Controller
@RequestMapping("/")
public class UserController extends BaseController {
    @Autowired(required = false)
    private UserService userService;
    @Autowired(required = false)
    private ShopService shopService;
    @Autowired(required = false)
    private SystemConfigService systemConfigService;

    @RequestMapping("findUser")
    public ModelAndView findUser() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.findUser();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("findUser");
        return modelAndView;
    }

    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request) throws Exception {
        System.out.println(request.hashCode());
        ModelAndView modelAndView = new ModelAndView();
        User user = getCurrentUser();
        if (user == null) {
            modelAndView.addObject("bitch", "/console/");
            modelAndView.setViewName("login");
        } else {
//            List<SystemConfig> configs = systemConfigService.getAllSystemConfig();
//            JSONObject json = new JSONObject();
//            for (SystemConfig config : configs) {
//                json.element(config.getName(), config.getValue());
//            }
//            this.setAttr("systemConfig", json);
//            this.setAttr(YzbConstants.CURRENT_USER, JsonKit.toJson(user));
//            renderFreeMarker("/index.html");
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(@RequestParam("user.mobile") String mobile, @RequestParam("user.password") String password) throws Exception {

        System.out.println(mobile);
        Map<String, Object> paramMap = new HashMap();
        Map<String, Object> resultMap = new HashMap();

        paramMap.put("mobile", mobile);
        paramMap.put("password", DigestUtils.md5Hex(password));
        if (1 == 1) {
            User user = new User();
            user.setNickname("xx");
            session.setAttribute(YzbConstants.CURRENT_USER, user);
            resultMap.put(RESULT, RESULT_SUCCESS);
            return resultMap;
        }

        User user = userService.selectUser(paramMap);
        if (user != null && user.getType() == 3) {
            session.setAttribute(YzbConstants.CURRENT_USER, user);
            Shop shop = shopService.getLatestShopByUser(user.getId());
            session.setAttribute(YzbConstants.CURRENT_SHOP, shop);
            resultMap.put(RESULT, RESULT_SUCCESS);
        } else if (user != null) {
            session.setAttribute(YzbConstants.CURRENT_USER, user);
            Shop shop = shopService.getLatestShopByUser(user.getId());   //将0号店的shop放入session
            session.setAttribute(YzbConstants.CURRENT_SHOP, shop);
            resultMap.put(RESULT, RESULT_SUCCESS);
        } else {
            resultMap.put(RESULT, RESULT_FAIL);
            resultMap.put(MSG, "用户名或者密码错误!");
        }

        return resultMap;
    }

    @RequestMapping("/index1")
    public String index1(Model model) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        User user = getCurrentUser();
        if (user == null) {
            return "hello";
        } else {
            List<SystemConfig> configs = systemConfigService.getAllSystemConfig();
            JSONObject json = new JSONObject();
            for (SystemConfig config : configs) {
                json.put(config.getName(), config.getValue());
            }

            model.addAttribute("systemConfig", json);
            model.addAttribute(YzbConstants.CURRENT_USER, objectMapper.writeValueAsString(user));
            return "hello";
        }
    }

    @RequestMapping("/b")
    @ResponseBody
    public JSONObject getJSON() {
        JSONObject jo = new JSONObject();
        jo.put("name", "a");
        return jo;
    }

//    @RequestMapping(value = "/dologin")
//    public String doLogin(Model model) {
//        String msg = "";
//        String userName = request.getParameter("mobile");
//        String password = request.getParameter("password");
//        System.out.println(userName);
//        System.out.println(password);
//        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
//        token.setRememberMe(true);
//        Subject subject = null;
//        try {
//            subject = SecurityUtils.getSubject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        try {
//            subject.login(token);
//            if (subject.isAuthenticated()) {
//                return "redirect:/";
//            } else {
//                return "login";
//            }
//        } catch (IncorrectCredentialsException e) {
//            msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        } catch (ExcessiveAttemptsException e) {
//            msg = "登录失败次数过多";
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        } catch (LockedAccountException e) {
//            msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        } catch (DisabledAccountException e) {
//            msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        } catch (ExpiredCredentialsException e) {
//            msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        } catch (UnknownAccountException e) {
//            msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        } catch (UnauthorizedException e) {
//            msg = "您没有得到相应的授权！" + e.getMessage();
//            model.addAttribute("message", msg);
//            System.out.println(msg);
//        }
//        return "login";
//    }

    @RequestMapping("ccc")
    public String doSomeThing() {
        String mobile = request.getParameter("mobile");
        System.out.println(mobile);
        System.out.println("fuck you");
        return "ccc";
    }

    @RequestMapping(value = "/saveUserDetails")
    public String greetingsAction(@Validated User user, RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("firstName", "sdfsdf");
        redirectAttributes.addAttribute("lastName", "sdfsdf");
        return "redirect:success";
    }

    @RequestMapping("success")
    public void asdf() {
        String dasfd = request.getParameter("firstName");
        System.out.println(dasfd);
    }

    @RequestMapping("aaa")
    public String dododod() {
        String mobile = request.getParameter("mobile");
        System.out.println(mobile);
        return "forward:ccc";
    }

    @RequestMapping(value = "/product/{productId}/{bbb}")
    public void getProduct(@PathVariable("productId") String productId, @PathVariable("bbb") String bbb) {
        System.out.println("Product Id : " + productId);
    }

    @RequestMapping(value = "/product/{productId}")
    public void getProduc1t(@PathVariable("productId") String productId) {
        System.out.println("Product Id : " + productId);
    }

    @ModelAttribute("myUser")
    public User populateModel() {
        User user = new User();
        user.setNickname("ray");
        return user;
    }

    @RequestMapping("/testModel")
    public void soutModel(@ModelAttribute("myUser") User user) {
        System.out.println(user.getNickname());
        System.out.println(user.getMobile());
    }

    @InitBinder//必须有一个参数WebDataBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));

        binder.registerCustomEditor(int.class, new PropertyEditorSupport() {

            @Override
            public String getAsText() {
                // TODO Auto-generated method stub
                return getValue().toString();
            }

            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                // TODO Auto-generated method stub
                System.out.println(text + "...........................................");
                setValue(Integer.parseInt(text));
            }

        });
    }

    @RequestMapping("testYear/{date}")
    public void test(@PathVariable Date date, HttpServletResponse response) throws IOException {
        System.out.println(date);
        response.getWriter().write(String.valueOf(date));

    }

//    @InitBinder
//    public void initBinder11(WebDataBinder binder) {
//        binder.registerCustomEditor(User.class, new MyEditor());
//    }

    @RequestMapping("user")
    public void test1111(User user, String mobile) throws IOException {
        System.out.println(mobile);

        System.out.println(user);

    }

    @RequestMapping("/save")
    public String save(@Valid User user, BindingResult result) {
        //
        if (result.hasErrors()) {
            System.out.println("====================================");
            List<ObjectError> ls = result.getAllErrors();
            for (int i = 0; i < ls.size(); i++) {
                System.out.println("error:" + ls.get(i));
            }
            System.out.println("====================================");
        }
        return "adduser";
    }


}
