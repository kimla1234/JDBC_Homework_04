package models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
    private Integer userId;
    private String userUuid;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Boolean isDeleted;
    private Boolean isVerified;
}