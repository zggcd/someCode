/***************************************
 * @���� �޽���
 * @����ʱ�� 2007-11-5
 * @��������: 
 * @�޸ļ�¼:
 * 		�޸�ʱ�䣺YYYY-MM-DD    �޸��ˣ�XXX
 *		�޸�ԭ�����ݣ�
 ***************************************/
package com.ccssoft.rsas.common.listener;

import java.io.Serializable;
import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ccssoft.rsas.common.config.ListenerConf;

/***************************************
 * @���� ��Ϣ�����߳����࣬��ΪԪ����/Ӧ�÷�����
 * �������Ľӿڣ���װ�������������ϸ�ڡ�ʵ�ָó�
 * �������������ӵ�������������Ϣ�Ľ��գ�ͬʱ��
 * �Է��ͻظ���Ϣ����������
 * @��˾ �������ͨ�ż������޹�˾
 * @���� �޽���
 * @����ʱ�� 2007-11-5
 ***************************************/
public abstract class MessageReceiver implements MessageListener
{
   private QueueConnectionFactory connectionFactory;//���ӹ���
   private QueueConnection connection;//��jms������������
   private QueueSession session;//�Ự
   private QueueReceiver receiver;//��Ϣ������
   private QueueSender sender;//��Ϣ������
   private ObjectMessage message;//���յ���Ϣ
   private Queue queue;//������Ŀ�Ķ���

   /***************************************
    * ���췽����������Ϣ������
    * @param listenerConf ���������ò��� 
    * @param strQueue ������Ϣ�Ķ�������
    * @throws NamingException
    * @throws JMSException
    ***************************************/
   public MessageReceiver(ListenerConf listenerConf, String strQueue) throws NamingException, JMSException
   {
      Hashtable env = new Hashtable();
      env.put(Context.INITIAL_CONTEXT_FACTORY, listenerConf.getContextFactory());
      env.put(Context.PROVIDER_URL, listenerConf.getProviderURL());
      env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming");// TODO
      InitialContext ctx = new InitialContext(env);
      
      this.connectionFactory = (QueueConnectionFactory)ctx.lookup(listenerConf.getConnectionFactory());
      this.connection = this.connectionFactory.createQueueConnection();
      this.session = this.connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
      
      /**
       * ��������
       */
      this.queue = (Queue) ctx.lookup("queue/" + strQueue);
      this.receiver = this.session.createReceiver(this.queue);
      this.receiver.setMessageListener(this);
      this.connection.start();
   }

   /***************************************
    * ��װ�ظ�������Requisition����Ϊ�ظ���Ϣ��
    * ���ͻؼ�����
    * @param requisition �ظ���������Requisition����
    * @param replyQueue �ظ���Ϣ���͵��Ķ���
    * @throws JMSException
    * @throws NamingException
    ***************************************/
   public void sendReplyMessage(Serializable requisition, Queue replyQueue) throws JMSException, NamingException
   {
      if (this.session != null)
      {
         this.sender = this.session.createSender(replyQueue);
         this.message = this.session.createObjectMessage();
         this.message.setObject(requisition);
         this.sender.send(this.message);
      }
   }
   
   public QueueConnection getQueueConnection()
   {
      return this.connection;
   }
   
   public QueueReceiver getQueueReceiver()
   {
      return this.receiver;
   }
   
   public QueueSession getQueueSession()
   {
      return this.session;
   }

   /***************************************
    * �رպ�jms������������
    * @throws JMSException
    ***************************************/
   public void close() throws JMSException
   {
      if (this.receiver != null)
      {
         this.receiver.close();
      }      
      if (this.session != null)
      {
         this.session.close();
      }      
      if (this.connection != null)
      {
         this.connection.close();
      }      
   }

}
