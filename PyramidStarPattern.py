def pyramid_pattern(n):
    for i in range(1, n + 1):
        print(' ' * (n - i) + '*' * (2 * i - 1))

# Example usage
try:
    rows = int(input("Enter the number of rows: "))
    if rows > 0:
        pyramid_pattern(rows)
    else:
        print("Please enter a positive integer.")
except ValueError:
    print("Invalid input! Please enter an integer.")