num = 1
i = 1

while num <= 15:
    for j in range(i):
        if num > 15:
            break
        print(num, end=" ")
        num += 1
    print()
    i += 1
