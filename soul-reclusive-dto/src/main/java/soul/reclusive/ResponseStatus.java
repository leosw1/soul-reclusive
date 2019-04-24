package soul.reclusive;

import lombok.Getter;

/**
 * @author SW
 * @date create 2018-12-30 18:25
 */
@Getter
public enum ResponseStatus {

    SUCCESS("成功"),
    FAILURE("失败");

    private String name;

    ResponseStatus(String name){
        this.name = name;
    }

    public static ResponseStatus getName(String name){
        for(ResponseStatus c : ResponseStatus.values()){
            if(c.name.equals(name)){
                return c;
            }
        }
        return null;
    }
}
