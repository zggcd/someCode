package com.ccssoft.rsas.common;

public class Queue extends java.util.Vector
{
   public Queue()
   {
      super();
   }

   public synchronized void enq(Object x)
   {
      super.addElement(x);
   }

   public synchronized Object deq()
   {
      /* ������Ϊ�գ�����EmptyQueueException�쳣 */
      if (this.empty())
         throw new EmptyQueueException();
      Object x = super.elementAt(0);
      super.removeElementAt(0);
      return x;
   }

   public synchronized Object front()
   {
      if (this.empty())
         throw new EmptyQueueException();
      return super.elementAt(0);
   }

   public boolean empty()
   {
      return super.isEmpty();
   }

   public synchronized void clear()
   {
      super.removeAllElements();
   }

   public int search(Object x)
   {
      return super.indexOf(x);
   }

   public class EmptyQueueException extends java.lang.RuntimeException
   {
      public EmptyQueueException()
      {
         super();
      }
   }
}
