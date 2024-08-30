package com.alibou.security.token;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")

public enum TokenType {
  BEARER
}
