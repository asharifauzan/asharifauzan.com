pemb1 = input("Masukkkan pembilang ke-1 : ")
peny1 = input("Masukkan penyebut ke-1 : ")

pemb2 = input("Masukkan pembilang ke-2 : ")
peny2 = input("Masukkan penyebut ke-2 : ")

oper = raw_input("Masukkan operasi Matematika (+, -, x, /) : ")

xpeny = peny1 * peny2
xpemb1 = (xpeny / peny1) * pemb1
xpemb2 = (xpeny / peny2) * pemb2

if oper == "+":
    print pemb1, " ", pemb2, " ", (xpemb1+xpemb2)
    print "{0}{3}{1}{3}{0}{3}{2}{3}{0}".format("-", "+", "="," ")
    print peny1, " ", peny2, " ", xpeny

elif oper == "-":
    print pemb1, " ", pemb2, " ", (xpemb1-xpemb2)
    print "{0}{3}{1}{3}{0}{3}{2}{3}{0}".format("-", "-", "="," ")
    print peny1, " ", peny2, " ", xpeny

elif oper == "x":
    print pemb1, " ", pemb2, " ", (pemb1*pemb2)
    print "{0}{3}{1}{3}{0}{3}{2}{3}{0}".format("-", "x", "="," ")
    print peny1, " ", peny2, " ", xpeny

elif oper == "/":
    print pemb1, " ", pemb2, " ", (pemb1*peny2)
    print "{0}{3}{1}{3}{0}{3}{2}{3}{0}".format("-", "/", "="," ")
    print peny1, " ", peny2, " ", (pemb2*peny1)

else:
    print "Input Operasi Salah"
