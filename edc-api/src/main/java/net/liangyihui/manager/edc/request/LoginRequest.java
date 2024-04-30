package net.liangyihui.manager.edc.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class LoginRequest{
    @Size(max = 11, min = 11)
    private String mobile;
    @NotBlank
    private String passWord;
}
