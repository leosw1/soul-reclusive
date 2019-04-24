package soul.reclusive.config;

import lombok.Data;
import springfox.documentation.service.Contact;

import java.io.Serializable;

/**
 * @author SW
 * @date create 2018-12-30 19:21
 */
@Data
public class ApiInfoProperties implements Serializable {

    private String title = "Soul-reclusive 基础数据Api说明文档";
    private String description = "Soul-reclusive";
    private String termsOfServiceUrl;
    private Contact contact;
    private String license;
    private String licenseUrl;
    private String version = "1.0";
}
