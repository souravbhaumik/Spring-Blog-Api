package com.sourav.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;

    @NotEmpty
    @Size(min=4, message = "Name must be at least 4 characters")
    private String name;

    @Email(message = "Please enter a valid email address")
    private String email;

    @NotEmpty
    @Size(min=6, max = 12, message = "Password must be at least 6 characters and 12 characters length")
//    @Pattern(regexp = )
    private String password;

    @NotEmpty
    private String about;
}
