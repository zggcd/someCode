
/*�����������*/
/*�汾 v.1.2
 *���� zengjunjia 
 *����޸�ʱ�� 2006-03-15
 */
function frameService(){

    this.top     = null;     //TOP���ھ��
    this.left    = null;     //left���ھ��
    this.toolbar = null;     //���������ھ��
	this.footer  = null;     //ҳ�Ŵ��ھ��
    /****************��ʼ�����������************************/
    try{
        for(var i = 0 ; i < window.top.frames.length;  i++){
			if( window.top.frames(i).name == "top")     this.top = window.top.frames(i);
			if( window.top.frames(i).name == "footer")  this.footer = window.top.frames(i);
			if(window.top.frames(i).name == "main"){
				for(var n = 0; n < window.top.frames(i).frames.length;n++){
					if( window.top.frames(i).frames(n).name == "left") this.left = window.top.frames(i).frames(n);
					if( window.top.frames(i).frames(n).name == "worktable"){ 
						for(var k = 0 ; k< window.top.frames(i).frames(n).frames.length; k++){
							if(window.top.frames(i).frames(n).frames(k).name == "toolbar"){
							    this.toolbar = window.top.frames(i).frames(n).frames(k);
								break;
							}
					    }
				    }
				}	
			}
       }
    }catch (e){
        alert("frameservice�����ʼ�����ִ���ԭ����:" + e.description);
    }
    /***************��ʼ��������������**********************/

    /***************���õ�ǰλ����ʾ��Ϣ**************************/
    this.setCurrentLocation = function(sarg){
        try{
            if (this.top == null)
                return ;
            this.top.document.all.clocation.innerText = "��ǰλ��" + sarg;
        }
        catch (e){
            alert("[���õ�ǰλ����ʾ��Ϣ]���ִ���ԭ����:" + e.description);
        }

    }
    /***************���õ�ǰλ����ʾ��Ϣ����s**************************/

    /***************���õ�ǰ�û���**************************/
    this.setCurrentUserName = function(sarg){
        try{
            if (this.top == null)
                return ;
            this.top.document.all.currentuser.innerText = sarg;
        }
        catch (e){
            alert("[���õ�ǰ�û���]���ִ���ԭ����:" + e.description);
        }

    }
	/************** ��ť����ǰ��ʼ������******************/
   this.initbutton = function (){
	  if (this.toolbar.toolBar.rows.length != 1) return;
         for(var i = 1; i< this.toolbar.toolBar.rows(0).cells.length;i++){
		         this.toolbar.toolBar.rows(0).deleteCell(i);
				 i--;
		 }
       
   }
    /******************��ȡ�ͻ��˵�ǰ����*******/
  this.getdate = function(arg){
      var format =  "-";
      if(arg != null && typeof(arg) == "string")  format = arg;
      var s ="";
      var d = new Date();
      s += d.getYear() +format;
      s += ((d.getMonth() + 1)>=10?(d.getMonth() + 1):"0"+(d.getMonth() + 1)) + format;
      s += d.getDate()>=10?d.getDate():"0"+d.getDate();  
      return(s);
  }
  /*���ع�����*/
  this.hidetoolbar = function(){
      this.toolbar.parent.document.all.workframe.rows = "0,*";
  }
  /*��ʾ������*/
  this.showtoolbar = function(){
      this.toolbar.parent.document.all.workframe.rows = "32,*";
  }
   /******************************�����������İ�ť*********************/
   this.createbutton = function(ispic ,imgurl,functionname,name){
	   var otd ;
	   try{
		   if(this.toolbar.toolBar.rows.length == 1){
				otd = this.toolbar.toolBar.rows(0).insertCell();
				var temp = "";
				otd.onclick = functionname; 
				if (ispic == true){
					temp = temp +"<img name='Image15' border='0' src='" + imgurl + "' width='20' height='20' align='absmiddle'>";
				}else{
				    temp = "&nbsp;";
				}
				otd.insertAdjacentHTML("beforeEnd",temp + "&nbsp;" +  name +  "</a>");   
				this.toolbar.createButton(otd);
			}
	   }catch(e){
	       alert( "JavaScript�ű����д���" + e.description);
	   }
   }
}
