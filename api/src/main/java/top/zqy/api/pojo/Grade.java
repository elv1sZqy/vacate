package top.zqy.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Grade
 * @Author Elv1s
 * @Date 2019/3/7 14:35
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    private Integer gid;
    private String  grade;
    private String name;

}
