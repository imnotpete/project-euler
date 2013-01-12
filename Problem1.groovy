def sum = 0

1000.times {
    if (it % 3 == 0 || it % 5 == 0) {
        sum += it
    }
}

println sum