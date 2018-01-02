package com.danny.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author 676002187@qq.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultData implements Serializable {
    private static final long serialVersionUID = 4015340654705723550L;
    /**
     * sessionId
     */
    private String     sessionId;
    /**
     * 状态码
     */
    private HttpStatus code;
    /**
     * 本次操作结果描述
     */
    private String     description;
    /**
     * 返回内容
     */
    private Object     content;

    public ResultData(HttpStatus code, String description, String content) {
        this.code = code;
        this.description = description;
        this.content = content;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
