/**
 * Silde 30
 */
var LinkedList = function () {
    this.head = null;
    this.size = 0;
    this.addToHead = function (v) {
        var node = new Node(v);
        if (this.head == null) { // if the list is empty
            this.head = node;
            this.size++;

        } else {                   // if the list contains one or more nodes
            node.next = this.head;
            this.head = node;
            this.size++;
        }
        return;
    }
}
var Node = function (V) {
    this.value = V;
    this.next = null;
}
//    ------------------------------- Slide 31-----------------------------------------------
    var bookNumber = new LinkedList();
    bookNumber.addToHead(10);
    bookNumber.addToHead(20);
    bookNumber.addToHead(30);
    bookNumber.addToHead(40);
    console.log(bookNumber);
