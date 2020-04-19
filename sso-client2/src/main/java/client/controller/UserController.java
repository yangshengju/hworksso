package client.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/authentication")
    public Object getCurrentUser(Authentication authentication, HttpServletRequest request) {
        /*String authHeader=request.getHeader("Authorization");
        String jwtToken=StringUtils.substringAfter(authHeader,"Bearer ");
        Claims claims=null;
        try {
            claims=Jwts.parser().setSigningKey(securityProperties.getOauth2().getSigningKey().getBytes("UTF-8")).parseClaimsJws(jwtToken).getBody();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        log.info("claims:"+claims);*/
        return authentication;
    }
}
