var box = new twaver.ElementBox();
var network = new twaver.vector.Network(box);

function init() {
    initNetwork();
    registerImage();
    initDataBox();
}

function initNetwork() {
    var view = network.getView();
    document.body.appendChild(view);
    network.adjustBounds({x: 0, y: 0, width: 1300, height: 600});
    twaver.Styles.setStyle('select.color', '#57ab9a');
}

function registerImage() {
    twaver.Util.registerImage('shadow', {
        w: 37,
        h: 29,
        shadowOffsetX: 0,
        shadowOffsetY: 0,
        shadowBlur: 5,
        shadowColor: '#ec6c00',
        v: [
            {
                shape: 'vector',
                name: 'node_image',
                x: 0,
                y: 0
            }
        ]
    });
}

function initDataBox() {
    var parent = new twaver.Group({
        name: 'parent',
        location: {x: 300, y: 400 },
    });
    addAlarm("alarm 0", parent.getId(),twaver.AlarmSeverity.MINOR,box.getAlarmBox());
    box.add( parent);

    var node1 = new twaver.Node({
        name: 'Jeff.fu',
        location: {
            x: 200,
            y: 200
        }
    });
    addAlarm("alarm 1", node1.getId(), twaver.AlarmSeverity.CRITICAL, box.getAlarmBox());
    node1.setClient('vector', true);
    box.add(node1);

    var node2 = new twaver.Node({
        name: 'alex.dong',
        location: {
            x: 500,
            y: 350
        }
    });
    node2.setClient('vector', true);
    addAlarm("alarm 2", node2.getId(), twaver.AlarmSeverity.MAJOR, box.getAlarmBox());
    box.add(node2);

    var link = new twaver.Link(node1, node2);
    link.setName('link1');
    link.setStyle('label.position', 'topleft.topleft');
    addAlarm("alarm 3",link.getId(),twaver.AlarmSeverity.WARNING,box.getAlarmBox());
    box.add(link);
    
    parent.addChild(node1);
    parent.addChild(node2);
}
function addAlarm(alarmID, elementID, alarmSeverity, alarmBox) {
    var alarm = new twaver.Alarm(alarmID, elementID, alarmSeverity);
    alarmBox.add(alarm);
}