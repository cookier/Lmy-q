package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Session;
import java.util.HashMap;

/**
 * MQ 消息发送器.
 *
 * @author sk
 */

@Component
public class AccountSender {
//    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("mq");
//    private static String address = resourceBundle.getString("address");
    // ConnectionFactory,JMS 用它创建连接.
//    private static ConnectionFactory connectionFactory = null;

    /**
     * 向MQ发送消息.
     *
     * @param hm
     */
    public static void doSend(HashMap<String, String> hm) {
//		Session session=null;
//		MessageProducer producer=null;
//		Connection connection=null;
//		try {
//			log.debug("发送 统计信息到MQ服务器：开始");
//			if (connectionFactory == null) {
//				connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
//						ActiveMQConnection.DEFAULT_PASSWORD, address);
//			}
//			// 构造从工厂得到连接对象
//			connection = connectionFactory.createConnection();
//			connection.start();
//			// 获取操作连接
//			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
//			Destination destination = session.createQueue("AccountReceiverQueue");
//			 producer = session.createProducer(destination);
//			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
//			sendMessage(session, producer, hm);
//			session.commit();
//			log.debug("发送 统计信息到MQ服务器：成功");
//		} catch (Exception e) {
//			log.error("发送 统计信息到MQ服务器：异常", e);
//		} finally {
//			try {
//				if (producer != null)
//					producer.close();
//				if (session != null)
//					session.close();
//				if (connection != null)
//					  connection.close();
//			} catch (Throwable ignore) {
//				ignore.printStackTrace();
//			}
//		}
    }

    /**
     * 发送到MQ服务器.
     *
     * @param session
     * @param producer
     * @param hm
     * @throws Exception
     */
    public static void sendMessage(Session session, MessageProducer producer, HashMap<String, String> hm) throws Exception {
        if (hm != null && hm.size() > 0) {
            MapMessage mapMessage = session.createMapMessage();
            for (String key : hm.keySet()) {
                mapMessage.setString(key, hm.get(key));
            }
            producer.send(mapMessage);
        }
    }

}
