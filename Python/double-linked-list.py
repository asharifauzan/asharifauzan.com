class Node:
    def __init__ (self, data):
        self.data = data
        self.next = None
        self.prev = None

class DoubleLinkedLIst:
    def __init__ (self):
        self.head = None

    def append(self, data):
        if self.head is None:
            new_node = Node(data)
            new_node.prev = None
            self.head = new_node

        else:
            new_node = Node(data)
            cur = self.head
            while cur.next:
                cur = cur.next
            cur.next = new_node
            new_node.prev = cur
            new_node.next = None

    def prepend(self, data):
        if self.head is None:
            new_node = node(data)
            new_node.next = self.head
            self.head = new_node

        else:
            new_node = Node(data)
            self.head.prev = new_node
            new_node.next = self.head
            self.head = new_node
            new_node.prev = None

    def print_list(self):
        cur = self.head
        while cur:
            print(cur.data)
            cur = cur.next

d1 = int(input("Masukkan nilai : "))
d2 = int(input("Masukkan nilai : "))
d3 = int(input("Masukkan nilai : "))
d4 = int(input("Masukkan nilai : "))
d5 = int(input("Masukkan nilai : "))
d6 = int(input("Masukkan nilai : "))
e1 = int(input("Masukkan nilai : "))
e2 =  int(input("Masukkan nilai : "))



list = DoubleLinkedLIst()
list.append(d1)
list.append(d2)
list.append(d3)
list.append(d4)
list.append(d5)
list.append(d6)

list.prepend(e1)
list.prepend(e2)

list.print_list()
