def right_angle_triangle(n):
    for i in range(1, n + 1):
        print('*' * i)

# Example usage
try:
    rows = int(input("Enter the number of rows: "))
    if rows > 0:
        right_angle_triangle(rows)
    else:
        print("Please enter a positive integer.")
except ValueError:
    print("Invalid input! Please enter an integer.")