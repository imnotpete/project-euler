def a = 1
def b = 2
def sum = 2

while (b<4000000) {
    def tmp = a + b
    if (tmp % 2 == 0) {
        sum += tmp
    }
    
    a = b
    b = tmp
}

println sum