package com.huangshi.wuji.spring.scaffold.event.listener;

import com.huangshi.wuji.spring.scaffold.event.UserCreatedEvent;
import com.huangshi.wuji.spring.scaffold.event.event.AfterUserRemovedEvent;
import com.huangshi.wuji.spring.scaffold.event.event.UserRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRemovedListener {

    /**
     * 创建用户创建事件
     * @param userCreateEvent
     */
    @EventListener
    public void handleUserCreateEvent(UserCreatedEvent userCreateEvent) {
        System.out.println(">>>>>>>>>创建用户事件>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("监听到了事件：" + userCreateEvent.getSource() + "消息;时间：" + userCreateEvent.getTimestamp());
        System.out.println("要创建的用户姓名：" + userCreateEvent.getName());
    }

    /**
     * 处理用户删除事件
     * @param event
     */
    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleUserRemovedListener(UserRemovedEvent event) {
        System.out.println(String.format("用户被删除 (Conditional): %s", event.getName()));
    }

    /**
     * 用户删除事件发生之后再次创建新的事件 AfterUserRemovedEvent
     * @param event
     * @return
     */
    @EventListener
    AfterUserRemovedEvent handleCreateAfteruserRemovedEvent(UserRemovedEvent event) {
        System.out.println(String.format("用户被删除 (@EventListener): %s", event.getName()));
        System.out.println(String.format("开始创建新事件：AfterUserRemovedEvent"));
        return new AfterUserRemovedEvent(event.getName());
    }

    /**
     * 处理用户删除之后再次发生的事件
     * @param afterUserRemoved
     */
    @EventListener
    public void handleAfterUserRemovedEvent(AfterUserRemovedEvent afterUserRemoved){
        System.out.println(">>>>>>>>>开始处理用户删除之后再次发生的事件>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }



}
