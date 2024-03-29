package io.tps.yugioh.listService.CardListConsumer.resource;

import io.tps.yugioh.listService.CardListConsumer.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cardList {

    @Autowired
    Producer producer;

    @RequestMapping("/send")
    public String sendMsg(@RequestParam("msg")String msg){
        producer.produceMsg(msg);
        return "Done";
    }
}