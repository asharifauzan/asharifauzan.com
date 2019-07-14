class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def enqueue(self, item):
        self.items.insert(0, item)

    def getList(self):
        return self.items

q1 = raw_input("Masukkan Data ke-1 : ")
q2 = raw_input("Masukkan Data ke-2 : ")
q3 = raw_input("Masukkan Data ke-3 : ")

q = Queue()
q.enqueue(q1)
q.enqueue(q2)
q.enqueue(q3)
print q.getList()
