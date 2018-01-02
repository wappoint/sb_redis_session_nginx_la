package com.danny.vo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author 676002187@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO implements Serializable {
    private String userId;
    private String name;
    private String addr;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
