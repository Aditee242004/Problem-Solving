def right_angle_number_pattern(n):
    for i in range(1, n + 1):
        print(' '.join(str(num) for num in range(1, i + 1)))

# Example usage
try:
    rows = int(input("Enter the number of rows: "))
    if rows > 0:
        right_angle_number_pattern(rows)
    else:
        print("Please enter a positive integer.")
except ValueError:
    print("Invalid input! Please enter an integer.")