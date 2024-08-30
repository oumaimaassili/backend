package com.alibou.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@Builder
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")

@NoArgsConstructor
public class AuthenticationRequest {

  private String email;
 private String password;



}
