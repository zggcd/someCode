/***************************************
 * @���� �޽���
 * @����ʱ�� 2007-11-5
 * @��������: ģ�����������Ϣ
 * @�޸ļ�¼:
 * 		�޸�ʱ�䣺YYYY-MM-DD    �޸��ˣ�XXX
 *		�޸�ԭ�����ݣ�
 ***************************************/
package com.ccssoft.rsas.common.listener;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.naming.NamingException;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;

import com.ccssoft.rsas.common.config.ListenerConf;
import com.ccssoft.rsas.common.config.RunTimeParameterConf;
import com.ccssoft.rsas.common.xmlparser.Requisition;
import com.ccssoft.rsas.common.xmlparser.types.RequisitionCommandType;

/***************************************
 * @���� ʾ���࣬ʵ��MessageReceiverģ��Ԫ����
 * �������Ӽ������������
 * @��˾ �������ͨ�ż������޹�˾
 * @���� �޽���
 * @����ʱ�� 2007-11-5
 ***************************************/
public class TestMessageReceiver extends MessageReceiver
{
   /***************************************
    * @�������� 
    * @param listenerConf
    * @param strQueue
    * @throws NamingException
    * @throws JMSException
    ***************************************/
   public TestMessageReceiver(ListenerConf listenerConf, String strQueue) throws NamingException, JMSException
   {
      super(listenerConf, strQueue);
   }

   /* �Զ���jms���������ô˷���
    * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
    */
   public void onMessage(Message message)
   {
      try
      {
         if (message instanceof ObjectMessage)
         {
            ObjectMessage objectMsg = (ObjectMessage) message;
            //���������
            Requisition requisition = (Requisition) objectMsg.getObject();
            //�ظ���Ϣ���͵��Ķ���
            Queue replyQueue = (Queue) message.getJMSReplyTo();
            //System.out.println("���յ�1����Ϣ���Զ��У�" + objectMsg.getJMSDestination());
            
            
            /**
             * ��������...// TODO 
             */
            if (requisition.getResponse().toString() == "cnnSYN")
            {//ͬ����Ҫ������Ӧ
               System.out.println("��Ϣ����ͬ�������壺" + requisition.getID() + " / " + requisition.getResponse().toString());
               
               /**
                * ���ͻظ���Ϣ
                */
               Requisition replyRequisition = new Requisition();
               replyRequisition.setID(requisition.getID());
               replyRequisition.setCommand(RequisitionCommandType.GET);
               this.sendReplyMessage(replyRequisition, replyQueue);
               System.out.println("�����˻ظ���Ϣ�����У�" + replyQueue.getQueueName());
            }
            else
            {//�첽���践����Ӧ
               System.out.println("��Ϣ�����첽�����壺" + requisition.getID() + " / " + requisition.getResponse().toString());
            }
         }
      }
      catch (JMSException e)
      {
         //TODO
      }
      catch (NamingException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   /***************************************
    * @�������� 
    * @param args
    * @throws ValidationException 
    * @throws MarshalException 
    * @throws JMSException 
    * @throws NamingException 
    * @throws JMSException 
    * @throws NamingException 
    * @throws IOException 
    ***************************************/
   public static void main(String[] args) throws MarshalException, ValidationException, NamingException, JMSException, IOException
   {
      String configPath = "Server.xml";//RSASϵͳ���������ļ�·��
      ListenerConf listenerConfig = RunTimeParameterConf.getListenerconf(configPath);

      /**
       * ����TestMessageReceiverʵ������������Ϣ���շ���ÿ1����Ϣ�ĵ�����
       * ����jms��Ϣ�������Զ�����onMessage���������������Ϣ����ʵ��һֱ����
       */
      //���Ԫ���ݷ�����ʹ����������ӿڣ��ڶ�������Ϊ"MetadataQueue";Ӧ�÷�����Ϊ"ApplicationQueue"
      new TestMessageReceiver(listenerConfig, listenerConfig.getMetedataServerQueue());
      System.out.println("���ڴӼ�����������Ϣ...");
   }

}
