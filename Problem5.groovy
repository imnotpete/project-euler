def range = 1..10
def current = range.max()
def found = false

while (!found) {
    found = true
    for (def num : range) {
        if (current % num != 0) {
            current += range.max()
            found = false
            break
        }
    }
}

println current