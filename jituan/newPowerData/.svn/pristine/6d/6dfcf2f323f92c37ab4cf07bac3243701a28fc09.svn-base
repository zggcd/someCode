package com.ccssoft.rsas.common;

import java.sql.Types;

import com.ccssoft.rsas.common.xmlparser.types.DBFieldSQLDataTypeType;

public class DataTypeTOSqlType
{
   public static int dataTypeTOSqlType(int dataType){
      int i=0;
      switch (dataType)
      {
         case DBFieldSQLDataTypeType.DATCHAR_TYPE:
            i=Types.CHAR;
         break;
         case DBFieldSQLDataTypeType.DATINTEGER_TYPE:
            i=Types.INTEGER;
         break;
         case DBFieldSQLDataTypeType.DATBINARY_TYPE:
            i=Types.BINARY;
         break;
         case DBFieldSQLDataTypeType.DATBIT_TYPE:
            i=Types.BIT;
         break;
         case DBFieldSQLDataTypeType.DATBOOLEAN_TYPE:
            i=Types.BOOLEAN;
         break;
         case DBFieldSQLDataTypeType.DATDECIMAL_TYPE:
            i=Types.DECIMAL;
         break;
         case DBFieldSQLDataTypeType.DATDOUBLE_TYPE:
            i=Types.DOUBLE;
         break;
         case DBFieldSQLDataTypeType.DATFLOAT_TYPE:
            i=Types.FLOAT;
         break;
         case DBFieldSQLDataTypeType.DATVARCHAR_TYPE:
            i=Types.VARCHAR;
         break;
         case DBFieldSQLDataTypeType.DATTIME_TYPE:
            i=Types.TIME;
         break;
         case DBFieldSQLDataTypeType.DATDATE_TYPE:
            i=Types.DATE;
         break;
         case DBFieldSQLDataTypeType.DATCLOB_TYPE:
            i=Types.CLOB;
         break;
         case DBFieldSQLDataTypeType.DATBLOB_TYPE:

            i=Types.BLOB;
         break;
         case DBFieldSQLDataTypeType.DATBIGINT_TYPE:
            i=Types.BIGINT;
         break;
         case DBFieldSQLDataTypeType.DATTIMESTAMP_TYPE:
            i=Types.TIMESTAMP;
         break;
         case DBFieldSQLDataTypeType.DATLONGVARCHAR_TYPE:
            i=Types.LONGVARCHAR;
         break;
         case DBFieldSQLDataTypeType.DATLONGVARBINARY_TYPE:
            i=Types.LONGVARBINARY;
         break;
         case DBFieldSQLDataTypeType.DATSMALLINT_TYPE:
            i=Types.SMALLINT;
         break;
         case DBFieldSQLDataTypeType.DATREAL_TYPE:
            i=Types.REAL;
         break;
         case DBFieldSQLDataTypeType.DATNUMERIC_TYPE:
            i=Types.NUMERIC;
         break;
         case DBFieldSQLDataTypeType.DATCURSOR_TYPE:
            i=-10;//OracleTypes.CURSOR = -10
         break;
      }
      return i;
   }
}
