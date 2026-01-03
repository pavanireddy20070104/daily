//Print numbers from 1 to 10
for i in range(1,11):
  print(i)

//Sum of first n natural numbers
n=int(input("enter n value:"))
sum =0
for i in range(1,n+1):
  sum = sum+ i
print(sum)

//Multiplication table of a number
n=int(input("enter n value:"))
for i in range(1,11):
  print(f"{n}*{i}={n*i}")
