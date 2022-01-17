package mate.academy.spring.dto.request;

import jakarta.validation.constraints.Size;
import mate.academy.spring.validator.Email;

public class UserRequestDto {
    @Email
    private String email;
    @Size(min = 8, max = 255)
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
