mat1 = [ [3, 1],
         [0, 2],
       ]

mat2 = [ [4, 6],
         [9, 2],
       ]

print "Matrix 1"
print mat1

print "Matrix 2"
print mat2

print

print "hasil penambahan matrix"

for x in range(0, len(mat1)):
    for y in range(0, len(mat1[0])):
        print mat1[x][y] + mat2[x][y]
    print
