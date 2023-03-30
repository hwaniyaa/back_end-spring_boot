package com.rlfghks12q.ch06.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rlfghks12q.ch06.dto.MemberDto;
import com.rlfghks12q.ch06.service.MemberService;
import com.rlfghks12q.ch06.utils.ScriptWriter;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/member")
public class MemberController {

  @Autowired
  MemberService memberService;
  
  @GetMapping("/signUp")
  public String signUp() {
    return "/member/signUp";
  }

  // 회원가입 체크
  @PostMapping("/signUpProcess")
  public String signUpProcess(
    MemberDto memberDto, 
    RedirectAttributes redirectAttributes,
    HttpServletResponse response
    ) throws IOException {
    int result = memberService.insertMember(memberDto);
    if(result > 0){
      redirectAttributes.addFlashAttribute("msg", "회원가입이 완료되었습니다.");
      return "redirect:/member/login";
    } else {
      ScriptWriter.alertAndBack(response, "다시 시도해 주세요.");
      return null;
    }
  }

  @GetMapping("/login")
  public String login(){
    return "/member/login";
  }

  // 로그인 체크
  @PostMapping("/loginProcess")
  public String loginProcess(
    MemberDto memberDto,
    RedirectAttributes redirectAttributes,
    HttpServletRequest request
  ) {
    HttpSession session = request.getSession();

    redirectAttributes.addFlashAttribute("msg", "로그인 되었습니다.");
    MemberDto loggedMember = memberService.loginMember(memberDto);
    session.setAttribute("loggedMember", loggedMember);
    return "redirect:/";
  }

  // 로그아웃
  @GetMapping("/logout")
  public String logout(
    HttpServletRequest request,
    RedirectAttributes redirectAttributes
  ) {
    HttpSession session = request.getSession();
    //session.invalidate();
    session.removeAttribute("loggedMember");
    redirectAttributes.addFlashAttribute("msg", "로그아웃되었습니다.");
    return "/member/login";
  }

  @GetMapping("/info")
  public String info(){
    return "/member/info";
  }
}
