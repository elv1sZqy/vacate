package top.zqy.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Admin
 * @Author Elv1s
 * @Date 2019/3/10 12:33
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private String id;
    private String name;
    private String password;
    private String tele;
}
