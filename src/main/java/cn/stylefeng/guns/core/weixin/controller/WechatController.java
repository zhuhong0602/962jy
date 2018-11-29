package cn.stylefeng.guns.core.weixin.controller;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLEncoder;

@Controller
@RequestMapping("/wechat")
@Slf4j
public class WechatController {

//    @Autowired
//    private WxMpService wxMpService;
//    @GetMapping("/authorize")
//    public String authorize(@RequestParam("returnUrl")String returnUrl){
//        String url="http://zhuhongceshi.natapp1.cc/wechat/userInfo";
//        String result=wxMpService.oauth2buildAuthorizationUrl(url,WxConsts.OAuth2Scope.SNSAPI_USERINFO, returnUrl);
//        log.info("网页授权获取code，result="+result);
//        return "redirect:"+result;
//    }
//    @GetMapping("/userInfo")
//    public String userInfo(@RequestParam("code")String code,@RequestParam("state") String returnUrl){
//
//        WxMpOAuth2AccessToken wxMpOAuth2AccessToken=new WxMpOAuth2AccessToken();
//        try{
//            wxMpOAuth2AccessToken =wxMpService.oauth2getAccessToken(code);
//
//            log.info("accecctoken="+wxMpOAuth2AccessToken.getAccessToken());
//        }catch(WxErrorException e){
//            log.error("微信网页授权[error]"+e);
//
//
//        }
//        String openid = wxMpOAuth2AccessToken.getOpenId();
//        log.info("openid="+openid);
//
//        return "redirect:http://"+returnUrl+"?openid="+openid;
//
//
//
//    }
}
