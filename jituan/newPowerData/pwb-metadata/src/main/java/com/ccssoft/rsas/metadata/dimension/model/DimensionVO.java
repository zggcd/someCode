package com.ccssoft.rsas.metadata.dimension.model;

import java.util.List;

import com.ccssoft.rsas.metadata.cube.model.CubeVO;
import com.ccssoft.rsas.metadata.link.model.LinkVO;
import com.ccssoft.rsas.metadata.member.model.MemberVO;
import com.ccssoft.rsas.metadata.relation.model.RelationVO;
import com.ccssoft.rsas.metadata.table.model.TableVO;


/**
 * <p>标题:报表工具元数据对象</p> 
 * <p>描述：维度对象元数据对象</p> 
 * <p>版权: Copyright (c) 2007 </p>
 * <p>公司: 广州瑞达通信技术有限公司</p>
 * @version 1.0
 * @author 曾俊佳
 */
public class DimensionVO implements java.io.Serializable
{

   public static final long serialVersionUID = 1L;
   
   private String ID;            //维对象ID
   private String name;          //维对象名称
   private int    type;          //0--星型维对象 1--雪花型维对象2--父子维对象3--离散维对象 4--日期维对象
   private String linkID;        //引用连接ID
   private int    autoOptimized; //是否对维表完成了优化
   private String cubeID;        //所属立方ID
   private String relationID;    //表间关系
   private int    codeLength;    //优化TreeCode每位的长度
   private String dateFormat;    //日期格式
   private String desc;          //描述
   private int    hierarchyCount;//父子维度优化后的层级数
   private CubeVO cube;          //立方对象
   private LinkVO link;          //数据据连接信息对象
   private List<TableVO>   tables;        //维对象使用的表集合
   private List<MemberVO>   Members;       //维对象成员
   private RelationVO relation;  //关联关系对象

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
    * <P>维对象类型：0--星型维对象 1--雪花型维对象2--父子维对象3--离散维对象 4--日期维对象</p>
    * @return int
    */
   public int getType()
   {
      return this.type;
   }

   /**
    * <P>维对象类型：0--星型维对象 1--雪花型维对象2--父子维对象3--离散维对象 4--日期维对象</p>
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
