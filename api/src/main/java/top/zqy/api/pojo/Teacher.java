package top.zqy.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 * @ClassName Teacher
 * @Author Elv1s
 * @Date 2019/3/2 14:50
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int tid;
    private String name;
    private String passWord;
    private String email;
    private String telephone;
    private String office;
    private String className;
    private String grade;
    private List<Student> students;
    private Assistant assistant;
}
