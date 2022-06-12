function click() {
    console.log("in greeting.js!!")
    let array = [];
    /* JSの中はJSFエンジンは評価しない
    <ui:repeat value="#{helloBean.sampleArray}" var="item" varStatus="stat">
        console.log('<h:outputText value="#{item}" />');
        array.push('<h:outputText value="#{item}" />');
    </ui:repeat>
    */
    console.log(array);
}

function exec() {
    var elem = document.getElementById("output");
    var now = new Date();
    var hour = now.getHours();
    var min = now.getMinutes();
    elem.innerHTML = "ボタンがクリックされました。 (" + hour +":" + min + ")";
}


