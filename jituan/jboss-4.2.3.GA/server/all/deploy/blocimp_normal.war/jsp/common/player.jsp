<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=GBK" language="java"%>
<html>
	<head>
		<title>��������</title>
	</head>
	<body>
		<object id="wmplayer" width="0" height="0"
			classid="CLSID:6BF52A52-394A-11d3-B153-00C04F79FAA6"
			type="application/x-oleobject" >
			<param name="SendPlayStateChangeEvents" value="true">
			<param name="autoStart" value="true">
			<param name="uiMode" value="invisible">
			<param name="playCount" value="1">
			<param name="volume" value="100">
		</object>
		<input type="button" name ="ѭ������" onclick='setSoundPlayer ("start","receive.wav","loop");'/>
		<input type="button" name ="һ�β���" onclick='setSoundPlayer ("start","receive.wav","once");'/>
		<input type="button" name ="ֹͣ" onclick='setSoundPlayer ("stop","","");'/>
		<input type="button" name ="����" onclick='setSoundPlayer ("mute","","");'/>
	</body>

	<script type="text/javascript">
		var pWmplayerInterval;
		function setSoundPlayer(stat,wavFileName,loopMode) {
			//  ���Ʋ��������� ����������
			//stat :    start--��ʼ  stop --ֹͣ mute-- ����
			//loopMode : loop--ѭ��; once --ֻ����һ��
			//wavFileName :  �����ļ�����ȫ���ƶ����� /web/sound/
			if(stat=="start") {
				wmplayer.settings.mute = false;
				wmplayer.url="/sound/"+ wavFileName;
				if(loopMode=="loop") {
					if(pWmplayerInterval!=null) clearInterval(pWmplayerInterval);
					pWmplayerInterval=setInterval("wmplayer.controls.play()",1000);
				} else {
					wmplayer.controls.play();
				}
			} else if(stat=="stop") {
				if (wmplayer.controls.isavailable('stop')) {
					wmplayer.controls.stop();
					if(pWmplayerInterval!=null) clearInterval(pWmplayerInterval);
				}
			} else if(stat=="mute") {
				wmplayer.settings.mute = !wmplayer.settings.mute;
			}
		}
		parent.openCheckLoop();
	</script>
</html>