package com.zhg.javakc.modules.test.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.test.entity.test;
import com.zhg.javakc.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("list")
    public ModelAndView list(test a, HttpServletRequest httpRequest, HttpServletResponse httpResponse)
    {
        ModelAndView modelAndView=new ModelAndView("test/list");
        modelAndView.addObject("page", testService.findbypage(new Page<test>(httpRequest,httpResponse),a));
        modelAndView.addObject("name",a.getName());
        return modelAndView;
    }
    @RequestMapping("insert")
    public String insert(test a)
    {
        System.out.println(a.getSex());
        a.setId(CommonUtil.uuid());
        testService.save(a);
        return "redirect:/test/list.do";
    }
    @RequestMapping("upload")
    public String upload(String ids, ModelMap map)
    {
        map.put("test",testService.get(ids));
        return "test/update";
    }
    @RequestMapping("updatee")
    public String update(test a)
    {
        testService.update(a);
        return "redirect:/test/list.do";
    }
    @RequestMapping("delete")
    public String delete(String[] ids)
    {
        testService.delete(ids);
        return "redirect:/test/list.do";
    }


}
