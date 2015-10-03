__author__ = 'Aman'
import time
print "-------------------Welcome to the Multiplication Machine-------------------"
a = raw_input("PRESS ENTER TO CONTINUE")
num = int(raw_input('ENTER A NUMBER, ANY NUMBER: '))
def fib(x):
    total = 1
    count = x

    while count > 0:
        total = total * count
        count -= 1
    return total
print 'Processing...'
time.sleep(0.5)
c = raw_input("The Machine has found your number!")
z = fib(num)
print " %s is your lucky number!" % z
x = 0
while x == 0:
    rep = raw_input("Do you want to try again? (Y/N) \n")
    if rep == "Y" or rep == "y":
        num2 = int(raw_input('ENTER A NUMBER, ANY NUMBER: '))
        print 'Processing...'
        time.sleep(0.5)
        c = raw_input("The Machine has found your number!")
        z = fib(num2)
        print " %s is your lucky number!" % z
    elif rep == "N" or rep == "n":
        break
    else:
        print "Please reply with Y or N."

print 'Thank you! Come Again!'