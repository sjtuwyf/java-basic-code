package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        Lenovo lenovo = new Lenovo();

        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if (method.getName().equals("sale")) {
                    double money = (double) args[0];
                    money = money * 0.85;
                    System.out.println("car");
                    String obj = (String) method.invoke(lenovo, money);
                    System.out.println("send");

                    return obj+"_mouse";
                } else {
                    Object obj = method.invoke(lenovo, args);

                    return obj;
                }

            }
        });

        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);

        proxy_lenovo.show();
    }
}
