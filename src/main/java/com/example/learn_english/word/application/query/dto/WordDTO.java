package com.example.learn_english.word.application.query.dto;

import com.example.learn_english.word.domain.model.Word;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;

/**
 * @author keyi.lee
 * @date 2022-05-11 9:17 PM
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "Word", description = "单词详情")
public class WordDTO {
    @ApiModelProperty("单词ID")
    private Long id;

    @ApiModelProperty("单词名称")
    private String name;

    @ApiModelProperty("单词翻译")
    private String trans;

    @ApiModelProperty("查询次数")
    private Long times;

    public static WordDTO fromEntity(Word word) {
        return WordDTO.builder()
                .id(word.getId())
                .name(word.getName())
                .trans(word.getTrans())
                .times(word.getTimes())
                .build();
    }
}
