package com.ccssoft.rsas.common.message;

/**
 * <p>���ͳ�Ʒ���ϵͳ����ģ��</p> 
 * @���� ϵͳ��Ϣ����
 * @��˾ �������ͨ�ż������޹�˾
 * @���� zjj
 * @����ʱ�� 2008-6-16 
 **************************************
 */

public class SystemMessageCode
{
   /***************���ô���********************/

   /**
    * �Ҳ�������ӳ��Ķ���
    */
   public static int MSG_ERR_MAP_OBJECT = 11000;
   /**
    * JNDI��URL���ô���
    */
   public static int MSG_ERR_JNDI_URL_CONFIG = 11001;
   /**
    *����JMS����ʧ�� 
    */
   public static int MSG_ERR_FIND_JMSFACTORY = 11002;
   /**
    * ����JMS��������ʧ��
    */
   public static int MSG_ERR_CREATE_JMSOBJ = 11003;
   /**
    * ���뱨��ģ��ʧ��
    */
   public static int MSG_ERR_COMPLIE_TEMPLATE = 11004;

   /*************���ݿ��������****************/
   /**
    * �������ݿ�ʧ��
    */
   public static int MSG_ERR_CONNECT_DB = 12000;
   /**
    * ��ȡ���ݿ�����ʧ��
    */
   public static int MSG_ERR_GET_DBNAME = 12001;
   /**
    * �������ݴ���
    */
   public static int MSG_ERR_SAVE_DATETODB = 12002;
   /**
    * �Ż�ά��ʧ��
    */
   public static int MSG_ERR_OPTIMIZE_DIM = 12003;

   /**
    * ��������ά���Ѵ���
    */
   public static int MSG_ERR_DATETABLE_EXISTS = 12004;
   /**
    * �����ı�����Ч
    */
   public static int MSG_ERR_INVALID_TBNAME = 12005;
   /**
    * ������Ա�ı��ʽ����
    */
   public static int MSG_ERR_MEA_EXPRESSION = 12006;
   /**
    * װ�ر������ʧ��
    */
   public static int MSG_ERR_LOAD_REPORT = 12007;
   /**
    * װ�ز�ѯ����ʧ��
    */
   public static int MSG_ERR_LOAD_QUERY = 12008;
   /**
    * ִ�в�ѯ������
    */
   public static int MSG_ERR_EXECUTE_SQL = 12009;
   /**
    * �洢���̲���ֵ���ݴ���
    */
   public static int MSG_ERR_PROC_PARAMSTYPE = 12010;
   /**
    * ִ�д洢����ʧ��
    */
   public static int MSG_ERR_EXECUTE_PROCDURE = 12011;
   
   /**
    * �����ݿ��ȡ����ʱ����ʧ�ܡ�
    */
   public static int  MSG_ERR_GET_OBJECT = 12012 ;
   /**
    * ����ά����ݴ���ʧ��
    */
   
   /**
    *    ��ȡϵͳ����ʱ����%INPUT1%����
    */
   public static int   MSG_ERR_GET_SYSVAR;
   
   /**
    * �ӷ�����װ��ʱ���ִ���
    */
   public static int   MSG_ERR_LOAD_OBJECT;
   /**
    * ��������������ݿ�����������
    */
   
   public static int   MSG_ERR_ERROR_DBTYPE;

   public static int MSG_ERR_SETDATE_DIM = 12016;
   
   /**
    * ɾ������ʧ��!
    */
   public static int MSG_ERR_DEL_DATETODB = 12017;
   
   
   /**
    * װ������ʧ��!
    */
   public static int MSG_ERR_GET_DATETODB = 12018;
   
   
   /******************ͨ�Ŵ���*****************************/
   /**
    * ���ӷ�����ʧ��
    */
   public static int MSG_ERR_CONNECT_SERVER = 13000;
   /**
    * ��������ʧ��
    */
   public static int MSG_ERR_RECEIVE_DATA = 13001;
   /**
    * �ͻ��˶Ͽ��������˵�����
    */
   public static int MSG_ERR_CLIENT_DISCONNECT = 13002;
   
   /**
    * �������޷������û�����
    */
   public static int MSG_ERR_LISTENER_REQPARSE_FALSE = 13004;

   /**********************���ݴ���******************/
   /**
    * �ͻ��˷Ƿ���ͨ���ļ���ʽ
    */
   public static int MSG_ERR_INVALID_CLIENTFILE = 14000;
   /**
    * ����˷Ƿ���ͨ���ļ���ʽ
    */
   public static int MSG_ERR_INVALID_SERVERFILE = 14001;
   /**
    * ����ɸѡ����ʧ��
    */
   public static int MSG_ERR_RESOLVE_CONDITION = 14002;
   
   /**
    * ���󱣴浽�ļ����������ļ������Ƿ���ȷ��
    */
   public static int MSG_ERR_SAVE_OBJECT = 14003;
   
   /**
    * ����װ�س��������ļ��Ƿ���ڡ�
    */
   public static int MSG_ERR_LOAD_OBJECT_FROMFILE = 14004;
   
   /**************ϵͳ����*********************/

   /**
    * �Զ����ɵ�ģ��������
    */
   public static int MSG_ERR_COMPLIE_AUTOTEMPLATE = 15000;
   /**
    * ���ģ�����
    */
   public static int MSG_ERR_FILL_TEMPLATE = 15001;
   /**
    * ǿ������ת������
    */
   public static int MSG_ERR_CONVERT_DATATYPE = 15002;
   /**
    * ����δ��������
    */
   public static int MSG_ERR_OBJECT_UNCREATE = 15003;
   /**
    * ������ֱ��װ��
    */
   public static int MSG_ERR_OBJECT_CANTLOAD = 15004;
   /**
    * ���󲻾߱��÷���
    */
   public static int MSG_ERR_OBJECT_NOMENTHOD = 15005;

   /****************** ������ʾ��Ϣ**********************************/
   //���ݿ��龯����Ϣ
   /**
    * ����ͬ������
    */
   public static int MSG_WARN_SAMENAME = 21000;
   /**
    * �����ѱ�ʹ�ã����������޸�
    */
   public static int MSG_WARN_OBJECT_USED = 21001;
   /**
    * ���������û�����ñ�ѡ��
    */
   public static int MSG_WARN_HAVENO_IMMOBILE = 21002;
   //ͨ�ż�龯��
   /**
    * ����δ��������
    */
   public static int MSG_WARN_SERVER_NOSTART = 22000;
   /**
    * �����쳣��ֹ
    */
   public static int MSG_WARN_SERVER_TERMINATE = 22001;
   //�û���������
   /**
    * ���ļ����Ҳ���������Ϣ
    */
   public static int MSG_WARN_OBJECT_NOFOUND = 23000;
   /**
    * �洢���̲����б������α����͵Ĳ���
    */
   public static int MSG_WARN_MUST_CURSOR_PARAM = 23001;

   /****************** ѯ����ʾ��Ϣ**********************************/
   //�쳣������ʾ��Ϣ
   /**
    * �Ƿ�ر����ڱ༭������
    */
   public static int MSG_ASK_CLOSE_EDITING = 31000;
   /**
    * �Ƿ񱣴�����˳�
    */
   public static int MSG_ASK_SAVE_QUIT = 31001;
   //����������ʾ��Ϣ
   /**
    * ��ʱ�������ʾ
    */
   public static int MSG_ASK_LONGTIME_OPTION = 32000;
   /**
    * ɾ��ǰѯ��
    */
   public static int MSG_ASK_DELETE = 32001;
   /**
    * ȡ��������ʾ
    */
   public static int MSG_ASK_CANCEL_PUBLISH = 32002;

   /****************** ��ʾ��Ϣ ********************/

   //�û��������
   /**
    * ����ѡ����ʾ
    */
   public static int MSG_INFO_MUST_SELECT = 41000;
   /**
    * ������������ʱ����ʾ
    */
   public static int MSG_INFO_CONECT_OTHERSERVER = 41001;
   /**
    * ��ѯ����������������
    */
   public static int MSG_INFO_SET_ROWAREA = 41002;
   /**
    * ��Ҫά�������������ɱ���
    */
   public static int MSG_INFO_NEED_DIMCONDITION = 41003;
   /**
    * ��������������ʾ
    */
   public static int MSG_INFO_MUST_SET = 41002;
   //���������ʾ
   /**
    * �������ݿ�ɹ�
    */
   public static int MSG_INFO_CONNECT_DB_SUCCESS = 42000;
   /**
    * �����ɹ���ʾ
    */
   public static int MSG_INFO_SUCCESS = 42001;
   
   /**
    * ��ѯά������Ϊ��
    */
   public static int MSG_INFO_LOADDIMENSION_NULL = 42002;
   /**
    * ���ص�XML�ĵ��쳣��
    */ 
   public static int MSG_ERR_RETURN_XML = 15006; 
   /**
    * ������Ĳ�ѯ����Ϊ��!
    */ 
   public static int MSG_ERR_QUERYDEFINE = 14005; 
   /**
    * ����SQL����
    */ 
   public static int MSG_ERR_CREATESQL = 15007; 
   /**
    * ֱ��sql������!
    */ 
   public static int MSG_ERR_SQL_NOTEXIST = 15008; 
   /**
    * ֱ��sql�йؼ���FROM������!
    */ 
   public static int MSG_ERR_SQL_FROM_NOTEXIST = 15009; 
   /**
    * ɸѡ��������Ϊ��!
    */ 
   public static int MSG_ERR_CONDITION_ISNULL = 15010; 
   /**
    * ��ѯ�ж��弯��Ϊ��!
    */ 
   public static int MSG_ERR_QUERYBANDS_ISNULL = 15011; 
   /**
    * ��ѯ��Ԫ�ض��󼯺�Ϊ��!
    */ 
   public static int MSG_ERR_QUERYITEMS_ISNULL = 15012; 
   /**
    * �����Ϊ��!
    */ 
   public static int MSG_ERR_FIELDOBJECT_ISNULL = 15013; 
   /**
    * ������SQL����
    */ 
   public static int MSG_ERR_SUBSQL = 15014; 
   /**
    * Ӧ�÷���������
    */ 
   public static int MSG_ERR_APPSERVER = 15015; 
   /**
    * ������Ա����ĺ���Ϊ��!
    */ 
   public static int MSG_ERR_MEASURE_MEMBERFUNC = 15016; 
   /**
    * �����������!
    */ 
   public static int MSG_ERR_REPORT_ENGINE = 15017; 
}
