package top.zqy.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName vacate
 * @Author Elv1s
 * @Date 2019/2/28 16:13
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vacate {

    private String id;
    private String sid;
    private String status;
    private String time;
    private String reason;
    private String cycle;
    private int days;
    private  String agrees;

}
