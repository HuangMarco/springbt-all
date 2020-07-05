package com.huangshi.wuji.spring.scaffold.designpattern.di.example.scenario1;

import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.Consumer;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.consumer.MyDIApplication;
import com.huangshi.wuji.spring.scaffold.designpattern.di.example.di.injectors.MessageServiceInjector;

public class MyDIApplicationJUnitTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp(){
        //mock the injector with anonymous class
        injector = new MessageServiceInjector() {

            @Override
            public Consumer getConsumer() {
                //mock the message service
                return new MyDIApplication(new MessageService() {

                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service implementation");

                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

    @After
    public void tear(){
        injector = null;
    }
}
