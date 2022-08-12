package com.yang.jjwt;

import com.yang.jjwt.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JjwtApplicationTests {

	@Test
	void contextLoads() throws Exception {
		String jwt = JwtUtil.createJWT("test");
		System.out.println("jwt:" + jwt);
		Claims claims = JwtUtil.parseJWT(jwt);
		System.out.println(claims.getSubject());
	}

}
