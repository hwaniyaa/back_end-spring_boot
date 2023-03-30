package com.rlfghks12q.ch06.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

  private int no;

  // @NotBlank
  // @Size(min=2, max=20, message = "아이디는 2글자 이상 20글자 이하여야 합니다.")
  private String userId;

  // @NotBlank
  // @Size(min=2, max=20, message = "이름을 2글자 이상 20글자 이하여야 합니다.")
  private String userName;

  // @Email(message = "이메일 형식을 확인해 주세요.")
  private String userEmail;

  // @NotBlank(message = "필수 입력사항입니다.")
  private String userPw;

}