package web.project.seok.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Alias("BoardDto")
public class BoardDto {
    private String id;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private String writer;
    private String title;
    private String content;

}
