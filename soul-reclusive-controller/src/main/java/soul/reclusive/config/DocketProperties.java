package soul.reclusive.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @author SW
 * @date create 2018-12-30 19:22
 */
@Data
public class DocketProperties implements Serializable {
    private String groupName;
    private String basePackage;
}
