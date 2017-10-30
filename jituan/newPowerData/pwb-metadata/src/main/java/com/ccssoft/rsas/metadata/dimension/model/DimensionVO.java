package com.ccssoft.rsas.metadata.dimension.model;

import java.util.List;

import com.ccssoft.rsas.metadata.cube.model.CubeVO;
import com.ccssoft.rsas.metadata.link.model.LinkVO;
import com.ccssoft.rsas.metadata.member.model.MemberVO;
import com.ccssoft.rsas.metadata.relation.model.RelationVO;
import com.ccssoft.rsas.metadata.table.model.TableVO;


/**
 * <p>����:������Ԫ���ݶ���</p> 
 * <p>������ά�ȶ���Ԫ���ݶ���</p> 
 * <p>��Ȩ: Copyright (c) 2007 </p>
 * <p>��˾: �������ͨ�ż������޹�˾</p>
 * @version 1.0
 * @author ������
 */
public class DimensionVO implements java.io.Serializable
{

   public static final long serialVersionUID = 1L;
   
   private String ID;            //ά����ID
   private String name;          //ά��������
   private int    type;          //0--����ά���� 1--ѩ����ά����2--����ά����3--��ɢά���� 4--����ά����
   private String linkID;        //��������ID
   private int    autoOptimized; //�Ƿ��ά��������Ż�
   private String cubeID;        //��������ID
   private String relationID;    //����ϵ
   private int    codeLength;    //�Ż�TreeCodeÿλ�ĳ���
   private String dateFormat;    //���ڸ�ʽ
   private String desc;          //����
   private int    hierarchyCount;//����ά���Ż���Ĳ㼶��
   private CubeVO cube;          //��������
   private LinkVO link;          //���ݾ�������Ϣ����
   private List<TableVO>   tables;        //ά����ʹ�õı���
   private List<MemberVO>   Members;       //ά�����Ա
   private RelationVO relation;  //������ϵ����

   public int getAutoOptimized()
   {
      return this.autoOptimized;
   }

   public void setAutoOptimized(int autoOptimized)
   {
      this.autoOptimized = autoOptimized;
   }

   public String getCubeID()
   {
      return this.cubeID;
   }

   public void setCubeID(String cubeID)
   {
      this.cubeID = cubeID;
   }

   public String getRelationID()
   {
      return this.relationID;
   }

   public void setRelationID(String relationID)
   {
      this.relationID = relationID;
   }

   public String getDesc()
   {
      return this.desc;
   }

   public void setDesc(String desc)
   {
      this.desc = desc;
   }
   
   public int getHierarchyCount()
   {
	   return this.hierarchyCount;
   }
   
   public void setHierarchyCount(int hierarchyCount)
   {
	   this.hierarchyCount = hierarchyCount;
   }

   public String getID()
   {
      return this.ID;
   }

   public void setID(String id)
   {
      this.ID = id;
   }

   public String getLinkID()
   {
      return this.linkID;
   }

   public void setLinkID(String linkID)
   {
      this.linkID = linkID;
   }

   public String getName()
   {
      if(this.name == null) this.name ="";
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * <P>ά�������ͣ�0--����ά���� 1--ѩ����ά����2--����ά����3--��ɢά���� 4--����ά����</p>
    * @return int
    */
   public int getType()
   {
      return this.type;
   }

   /**
    * <P>ά�������ͣ�0--����ά���� 1--ѩ����ά����2--����ά����3--��ɢά���� 4--����ά����</p>
    * @param type int
    */
   public void setType(int type)
   {
      this.type = type;
   }

   public LinkVO getLink()
   {
      return this.link;
   }

   public void setLink(LinkVO link)
   {
      this.link = link;
   }

   public CubeVO getCube()
   {
      return this.cube;
   }

   public void setCube(CubeVO cube)
   {
      this.cube = cube;
   }

   public RelationVO getRelation()
   {
      return this.relation;
   }

   public void setRelation(RelationVO relation)
   {
      this.relation = relation;
   }

   public List getTables()
   {
      return this.tables;
   }

   public void setTables(List tables)
   {
      this.tables = tables;
   }

   public List getMembers()
   {
      return this.Members;
   }

   public void setMembers(List members)
   {
      this.Members = members;
   }

   public int getCodeLength()
   {
      return codeLength;
   }

   public void setCodeLength(int codeLength)
   {
      this.codeLength = codeLength;
   }

   public String getDateFormat()
   {
      return dateFormat;
   }

   public void setDateFormat(String dateFormat)
   {
      this.dateFormat = dateFormat;
   }

 
}
