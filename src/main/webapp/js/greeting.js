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

