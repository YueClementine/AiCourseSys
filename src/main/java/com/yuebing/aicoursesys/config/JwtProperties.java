package com.yuebing.aicoursesys.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ToString
@Configuration
public class JwtProperties {
    /** Request Headers ： Authorization */
    private final String header = "Authorization";

    /** Base64对该令牌进行编码 */
    private final String base64Secret = "meng";

    /** 令牌过期时间 此处单位/毫秒 */
    private final Long tokenValidityInSeconds = 14400000L;
}
