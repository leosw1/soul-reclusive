package soul.reclusive.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author SW
 * @date create 2018-12-30 19:20
 */
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties implements Serializable {

    private static final long serialVersionUID = 8471755917762607584L;
    private Boolean enable;
    private ApiInfoProperties apiInfo;
    private DocketProperties docket;

}
