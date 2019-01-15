package br.com.poc.springcamundarabbitpoc.services;

//import org.springframework.stereotype.Component;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.support.converter.MessageConversionException;
//
//
//
//@Component
//public class RabbitListenerConsumer {
//
////        @RabbitListener(queues = "queue-pubs")
////        public void receiverData(@Payload byte[] fileBody, Message message) {
////            try {
////                String payload = new String(fileBody, "UTF-8");
////                System.out.println("Payload Message"+ payload);
////            }
////            catch(Exception ex) {
////                System.out.println(ex);
////            }
////
////        }
//
//}