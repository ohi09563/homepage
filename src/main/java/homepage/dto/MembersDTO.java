package homepage.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MembersDTO {
    private Long gno;
    private String userid;
    private String pwd;
    private String name;
    private String phonenumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String gender;
    private String email;
    private String address;
    private LocalDateTime regDate, modDate;
}


