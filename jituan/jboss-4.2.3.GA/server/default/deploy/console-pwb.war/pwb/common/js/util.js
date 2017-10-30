function struct(key, value){
  this.key = key;
  this.value = value;
}
function put(key, value){
  this.map[this.map.length] = new struct(key, value);
}
function get(key){
  var arr = new Array();
  var j = 0;
  for (var i = 0; i < this.map.length; i++){
    if ( this.map[i].key === key ){
      arr[j++] = this.map[i].value;
    }
  } 
  return arr;
}
function set(key,value){
  for (var i = 0; i < this.map.length; i++){
    if ( this.map[i].key === key ){
      this.map[i].value = value;
    }
  } 
}
function remove(key){
  var v;
  for (var i = 0; i < this.map.length; i++){
    v = this.map.pop();
    if ( v.key === key )
       continue;   
       this.map.unshift(v);
  }
}

function size(){
  return this.map.length;
}

function isEmpty(){
  return this.map.length <= 0;
}
/*??????*/
function Map() {
  this.map = new Array();
  this.get = get;
  this.put = put;
  this.remove = remove;
  this.size = size;
  this.isEmpty = isEmpty;
  this.set = set;
}

/*??cookie*/
function SetCookie(sName, sValue)
{
  document.cookie = sName + "=" + escape(sValue)+"; expires=Mon, 31 Dec 2012 23:59:59 UTC;";
}

/*??cookie*/
function GetCookie(sName)
{
  var aCookie = document.cookie.split("; ");
  for (var i=0; i < aCookie.length; i++)
  {
    var aCrumb = aCookie[i].split("=");
    if (sName == aCrumb[0]) 
      return unescape(aCrumb[1]);
  }
  //???????cookie?,??????
  return null;
}