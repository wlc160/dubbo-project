package com.gupao.dubbo;

/**
 * 工程名:dubbo-services
 * 包名:com.gupao.dubbo
 * 文件名:PayServiceImpl
 * description:
 *
 * @author lcwen
 * @version V1.0: PayServiceImpl.java 2019/9/20 14:09
 **/
public class PayServiceImpl implements PayService {
    @Override
    public String pay(String money) {
        System.out.println("pay money is" + money);
        return  money;
    }
}
