package homepage.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Members extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gno;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String id;

    @Column(length = 20, nullable = false)
    private String pw;

    @Column(length = 20, nullable = false)
    private String phoneNumber;

    @Column(length = 20, nullable = false)
    private LocalDate dateOfBirth;

    @Column(length = 2, nullable = false)
    private String sex;

    @Column(length = 45, nullable = false)
    private String email;

    @Column(length = 45, nullable = false)
    private String address;

}
