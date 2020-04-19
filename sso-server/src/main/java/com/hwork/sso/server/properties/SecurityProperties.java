package com.hwork.sso.server.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yangs
 */
@ConfigurationProperties(prefix = "hwork.security")
@Data
public class SecurityProperties {
    private OAuth2Properties oauth2 = new OAuth2Properties();

}
