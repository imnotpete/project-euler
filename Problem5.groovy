def range = 1..10
def current = range.max()

loop:
while (true) {
    for (int i=range.max(); i >= range.min(); i--) {
        if (current % i != 0) {
            current += range.max()
            continue loop
        }
    }
    
    break
}

println current