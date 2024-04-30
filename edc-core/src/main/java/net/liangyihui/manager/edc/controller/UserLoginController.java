package net.liangyihui.manager.edc.controller;


import io.swagger.annotations.Api;
import net.liangyihui.digitalmarketing.response.CommonResponse;
import net.liangyihui.manager.edc.request.LoginRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@Api(value = "用户登录控制器",tags = "用户模块")
public class UserLoginController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResponse<String> login(@Validated @RequestBody LoginRequest request) {
        return CommonResponse.succ("longin,Tests");
    }
}
