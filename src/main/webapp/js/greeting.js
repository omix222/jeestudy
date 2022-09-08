const singleMap = new Map();

function click() {
    console.log("in greeting.js!!")
    let array = [];
    /* JSの中はJSFエンジンは評価しない
    <ui:repeat value="#{helloBean.sampleArray}" var="item" varStatus="stat">
        console.log('<h:outputText value="#{item}" />');
        array.push('<h:outputText value="#{item}" />');
    </ui:repeat>
    */
    singleMap.set("key1", "value1");
    console.log(array);
}
function clickArg(arg) {
    console.log("in greeting.js clickArg!!")
    console.log(arg);
}
function clickArg2(arg1,arg2) {
    console.log("in greeting.js clickArg!!")
    console.log(arg1);
    console.log(arg2);
}
function exec() {
    var elem = document.getElementById("output");
    var now = new Date();
    var hour = now.getHours();
    var min = now.getMinutes();
    elem.innerHTML = "ボタンがクリックされました。 (" + hour +":" + min + ")";
}
const buttonOpen = document.getElementById('modalOpen');
const modal = document.getElementById('easyModal');
const buttonClose = document.getElementsByClassName('modalClose')[0];

// ボタンがクリックされた時
buttonOpen.addEventListener('click', modalOpen);
function modalOpen() {
    modal.style.display = 'block';
}

// バツ印がクリックされた時
buttonClose.addEventListener('click', modalClose);
function modalClose() {
    modal.style.display = 'none';
}

// モーダルコンテンツ以外がクリックされた時
addEventListener('click', outsideClose);
function outsideClose(e) {
    if (e.target == modal) {
        modal.style.display = 'none';
    }
}

