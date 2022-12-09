package com.example.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberCont {
    public MemberCont() {
        System.out.println("-> MemberCont created.");
    }

    @RequestMapping(value = {"/member/get.do"}, method = RequestMethod.GET)
    public ModelAndView memberGet() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/get");  // /WEB-INF/views/member/get

        return mav;
    }

    @RequestMapping(value = {"/member/post.do"}, method = RequestMethod.POST)
    public ModelAndView memberPost(MemberVO memberVo) {
        ModelAndView mav = new ModelAndView();

        mav.addObject("id", memberVo.getId());
        mav.addObject("password", memberVo.getPassword());
        mav.addObject("nickname", memberVo.getNickname());

        mav.setViewName("/member/post");  // /WEB-INF/views/member/post

        return mav;
    }

    @RequestMapping(value = {"/member/put.do"}, method = RequestMethod.PUT)
    public ModelAndView memberPut() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/put");  // /WEB-INF/views/member/get

        return mav;
    }


}
