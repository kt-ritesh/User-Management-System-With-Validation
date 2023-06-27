package com.ritesh.UserManagementSystemWithValidation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank
    @NotEmpty
    @Pattern(regexp = "^[A-Za-z\\s]+$")
    private String userName;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/\\d{4}$")
    private String userDOB;

    @Email
    @NotEmpty(message = "Email Id should not be Empty!!!")
    private String userEmail;

    @Size(min = 10 , max = 12)
    @Pattern(regexp = "[0-9]+")
    private String userPhone;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/\\d{4}$")
    private String Date;

    @Pattern(regexp = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$")
    private String Time;


}
